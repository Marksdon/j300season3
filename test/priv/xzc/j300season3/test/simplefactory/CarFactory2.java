package priv.xzc.j300season3.test.simplefactory;

/**
 * 简单工厂模式 写法2
 * <p>这种模式
 * 添加产品,增加响应的静态生产方法
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
