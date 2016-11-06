package priv.xzc.j300season3.classloader;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 加载文件系统中的加密后的class字节码的类加载器 
 * @author randall
 *
 */
public class DecrptClassLoader extends ClassLoader {



	//com.bjsxt.test.User  -->d:myjava/com.bjsxt/test/User

	private String rootDir;

	public DecrptClassLoader(String rootDir) {
		this.rootDir = rootDir;
	}


	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		Class<?> c = findLoadedClass(name);
		//检查有没有已经加载这个类，如果已经加载，则直接返回已经加载的该类，如果没有，则加载
		if (c != null) {
			return c;
		} else {
			ClassLoader parent = this.getParent();
			try {
				c = parent.loadClass(name);//委派给父加载器
			} catch (Exception e) {
				/*e.printStackTrace();*/
			}
			if (c != null) {
				return c;
			} else {
				byte[] classData = getClassData(name);
				if (classData == null) {//没加载到，排除异常
					throw new ClassNotFoundException();
				} else {
					c = defineClass(name, classData, 0, classData.length);
				}

			}
		}
		return c;

	}


	/**
	 * 将类记载为自己字节数组
	 * @param className 类的全路径
	 * @return 类的字节数组
	 */
	private byte[] getClassData(String className) {
		//com.bjsxt.test.User  -->d:myjava/com.bjsxt/test/User
		String path = rootDir + "/" + className.replace('.', '/') + ".class";
		//apache 的 common 中有IOUtil，很方便
		InputStream is = null;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
			is = new FileInputStream(path);
			//解密,这里就是简单的取反
			int temp = -1;
			while ((temp = is.read()) != -1) {
				baos.write(temp^0xff);//取反操作
			}
			return baos.toByteArray();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					is = null;
				}
			}

		}

	}


}
