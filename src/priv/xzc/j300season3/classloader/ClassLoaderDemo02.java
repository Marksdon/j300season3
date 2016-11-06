package priv.xzc.j300season3.classloader;

/**
 * 测试简单加密解密(取反)
 * @author randall
 *
 */
public class ClassLoaderDemo02 {

	public static void main(String[] args) throws ClassNotFoundException {
		
//		int a = 3;//00000011
//		System.out.println(Integer.toBinaryString(a^0xff));//取反
		
		//加密class,正常的加载器是加载不到的
		/*EncrptUtil.encrpt("d:/myjava/HelloWord.class", 
				"d:/myjava/temp/HelloWord.class");*/
		
		//正常的类加载器是加载不了的，会抛出java.lang.ClassFormatError
		/*FileSystemClassLoader loader = new FileSystemClassLoader("d:myjava/temp");
		Class<?> c = loader.loadClass("HelloWord");
		System.out.println(c);*/
		
		//用解密的类加载器
		DecrptClassLoader loader = new DecrptClassLoader("d:myjava/temp");
		Class<?> c = loader.loadClass("HelloWord");
		System.out.println(c);
		
		
	}
	
}
