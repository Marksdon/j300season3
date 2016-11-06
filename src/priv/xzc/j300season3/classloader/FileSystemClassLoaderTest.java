package priv.xzc.j300season3.classloader;

/**
 * 测试自定义的FileSystemClassLoader
 * @author randall
 *
 */
public class FileSystemClassLoaderTest {

	public static void main(String[] args) throws ClassNotFoundException {
		FileSystemClassLoader loader = new FileSystemClassLoader("d:/myjava");
		FileSystemClassLoader loader2 = new FileSystemClassLoader("d:/myjava");
		
		Class<?> c = loader.loadClass("com.xzc.classloader.test.HelloWord");
		Class<?> c2 = loader.loadClass("com.xzc.classloader.test.HelloWord");
		Class<?> c3 = loader2.loadClass("com.xzc.classloader.test.HelloWord");
		
		Class<?> c4 = loader2.loadClass("java.lang.String");//双亲委托机制
		Class<?> c5 = loader2.loadClass("priv.xzc.j300season3.classloader.ClassLoaderDemo01");
		
		System.out.println(c.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());
		System.out.println(c4.hashCode());//只有是同一个类加载器，加载相同的类，jvm才会认为是相同的class
		
		System.out.println(c3.getClassLoader());//文件系统路径的类加载器（自定义），AppClassLoader是加载bin目录
		System.out.println(c4.getClassLoader());
		System.out.println(c5.getClassLoader());//系统默认的加载器,加载的是bin目录，是应用类加载器
		
		
				
	}
	
}
