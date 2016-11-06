package priv.xzc.j300season3.classloader;

/**
 * 当前线程上下文加载器
 * 通过set
 * 可以抛弃双亲委派的机制
 * 
 * Tomcat服务器类加载
 * OSGI原理：谁定义的，采用谁的加载器加载
 * 
 * @author randall
 *
 */
public class ClassLoaderDemo05 {
	
	public static void main(String[] args) {
		
		ClassLoader loader = ClassLoaderDemo05.class.getClassLoader();
		System.out.println(loader);
		
		loader = Thread.currentThread().getContextClassLoader();
		System.out.println(loader);
		
		//设置当前线程上下文类加载器
		Thread.currentThread().setContextClassLoader(new FileSystemClassLoader("d:/myjava/"));;
		System.out.println(Thread.currentThread().getContextClassLoader());
		
		
		
		
	}
}
