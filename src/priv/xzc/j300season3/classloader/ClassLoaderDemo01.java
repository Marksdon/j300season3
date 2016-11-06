package priv.xzc.j300season3.classloader;

/**
 * 类加载类的认识
 * <p>类加载器分4类
 * <li>引导类加载器(Bootstrap class loader)
 * 	<p>-原生代码(c/c++)编写，用来加载核心类库(JAVA_HOME/jre/lib/rt.jar或者sun.toot.classpath目录的内容)
 * <li>扩展类加载器(extension class loader)
 *  <p>-加载java的扩展类库(JAVA_HOME/jre/ext/*.jar或者java.ext.dirs目录下内容)
 *  <p>-由sun.misc.Launcher$ExtClassLoader实现
 * <li>应用程序类加载器(application class loader)
 *  <p>-加载classpath或者java.class.path目录下
 *  <p>-由sun.misc.Launcher$AppClassLoader实现
 * <li>自定义类加载器(user defined class loader)
 *
 * <p>认识一下java.lang.ClassLoader类  API
 * <p>类加载器的代理模式---双亲委托模式
 * 
 * @author randal
 * 
 */
public class ClassLoaderDemo01 {

	public static void main(String[] args) {
		//查看当前系统的加载器以及层级关系
		System.out.println(ClassLoader.getSystemClassLoader());//当前是sun.misc.Launcher$AppClassLoader@4e0e2f2a
		System.out.println(ClassLoader.getSystemClassLoader().getParent());//sun.misc.Launcher$ExtClassLoader@2a139a55
		System.out.println(ClassLoader.getSystemClassLoader().getParent().getParent());//null表示是引导类加载器，因为这个加载器是原声代码（c/c++）写的，不是java
		
		String aString = "haah";
		System.out.println(aString.getClass().getClassLoader());//获取该对象对应class类的加载器,是引导类加载器(表示加载的是JAVA_HOME/jre/lib/rt.jar中的java.lang.String)
		System.out.println(aString);//看看自定义的String是否会被加载，结论是永远不会(双亲委托机制)
		
	}

}
