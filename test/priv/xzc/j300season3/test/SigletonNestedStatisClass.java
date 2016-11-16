package priv.xzc.j300season3.test;

/**
 * 静态内部类单例,线程安全(静态内部类加载时，创建对象，这是天然的线程安全)，调用效率高，延时加载(静态内部类)
 * @author randall
 *
 */
public class SigletonNestedStatisClass {

	/**
	 * 组合到静态内部类 
	 */
	private static class SigletonInstance{
		private static final SigletonNestedStatisClass instance 
		= new SigletonNestedStatisClass();
	}
	
	/**
	 * 私有构造器
	 */
	public SigletonNestedStatisClass() {
	}
	
	
	/**
	 * 提供全局访问点，直接调用静态内部类的组合属性
	 * @return {@link SigletonNestedStatisClass}对象
	 */
	public static SigletonNestedStatisClass getInstance(){
		return SigletonInstance.instance;
	}
	
	
	
}
