package priv.xzc.j300season3.test.simplefactory;

/**
 * 测试简单工厂模式
 * @author randall
 *
 */
public class Client {

	public static void main(String[] args) {
		Car audi = CarFactory.createCar("audi");
		audi.run();
		Car byd = CarFactory.createCar("byd");
		byd.run();
		
		Car audi2 = CarFactory2.createAudi();
		audi2.run();
		
		
	}
	
	
}
