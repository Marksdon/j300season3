package priv.xzc.j300season3.classloader;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * 自定义类加载器
 * 网络加载器
 * <p>继承java.lang.ClassLoader
 * <p>双亲委托机制
 * 
 * @author randall
 *
 */
public class NetClassLoader extends ClassLoader{

	//com.bjsxt.test.User  -->www.sxt.cn com.bjsxt/test/User

	private String rootUrl;

	public NetClassLoader(String rootDir) {
		this.rootUrl = rootDir;
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
		String path = rootUrl + "/" + className.replace('.', '/') + ".class";
		InputStream is = null;
		URL url = null;
		try {
			url = new URL(path);
		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		} 
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
			is = url.openStream();
			byte[] buffer = new byte[1024];
			int temp = 0;
			while ((temp = is.read(buffer)) != -1) {
				baos.write(buffer, 0, temp);
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
