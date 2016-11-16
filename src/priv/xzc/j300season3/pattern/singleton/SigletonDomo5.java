package priv.xzc.j300season3.pattern.singleton;
/**
 * 测试枚举方式(避免了反射和序列化)
 * 这种方式：遗憾的没有延时加载
 * <p>调用效率高
 * @author randall
 *
 * 
 * 1.饿汉式---线程安全，调用效率高，不支持延时加载
 * 2.懒汉式---线程安全，调用效率不高，支持延时加载
 * 3.双重锁--不推荐
 * 4.静态内部类---线程安全，调用效率高，支持延时加载
 * 5.枚举---线程安全，调用效率高，无延时加载(天然防止反射和反序列化)
 */
public enum SigletonDomo5 {
	//这个枚举元素，本身就是单例对象
	INSTANCE;
	
	//添加自己需要的操作
	public void singtonOperation(){
	}
	
	
	
	

}
