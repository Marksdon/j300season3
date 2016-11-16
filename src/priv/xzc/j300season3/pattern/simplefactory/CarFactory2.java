package priv.xzc.j300season3.pattern.simplefactory;

/**
 * 简单工厂
 * 
 * <p>简单工厂模式的写法二
 * 
 * @author randall
 *
 */
public class CarFactory2 {

	public static Car createAudi(){
		return new Audi();
	}
	public static Car createByd(){
		return new Byd();
	}
	
}
