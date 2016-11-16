package priv.xzc.j300season3.pattern.singleton;

/**
 * 单例模式
 * 
 * 1.饿汉式---线程安全，调用效率高，不支持延时加载
 * 2.懒汉式---线程安全，调用效率不高，支持延时加载
 * 3.双重锁--不推荐
 * 4.静态内部类---线程安全，调用效率高，支持延时加载
 * 5.枚举---线程安全，调用效率高，无延时加载(天然防止反射和反序列化)
 * 
 * @author randall
 *
 */

public class Client {

	public static void main(String[] args) {
		SigletonDomo1 s1 = SigletonDomo1.getInstance();
		SigletonDomo1 s2 = SigletonDomo1.getInstance();


		//		SigletonDomo1 s1 = SigletonDomo1.getInstance();
	}
}
