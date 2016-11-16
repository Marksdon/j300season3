package priv.xzc.j300season3.test.factorymethod;


/**
 * 测试工厂方法模式
 * 
 * <p>工厂方法模式符合开闭原则，但是增添新的产品需要增添新的工厂，增添新的类，容易造成类的膨胀
 * @author randall
 *
 */
public class Client {

	public static void main(String[] args) {
		
		AudiFactory audiFactory = new AudiFactory();
		Car audi = audiFactory.createCar();
		audi.run();
		
		BydFactory bydFactory = new BydFactory();
		Car byd = bydFactory.createCar();
		byd.run();

	}
}
