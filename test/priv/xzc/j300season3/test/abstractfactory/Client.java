package priv.xzc.j300season3.test.abstractfactory;

/**
 * 测试抽象工厂模式
 * 
 * 豪华产品
 * 
 * 低端产品
 * @author randall
 *
 */
public class Client {

	public static void main(String[] args) {
		//来个豪华产品
		CarFactory factory = new LuxuryCarFactor();
		Engine engine = factory.createEngine();
		Seat seat = factory.createSeat();
		engine.run();
		
		CarFactory factory1 = new LowCarFactor();
		Engine engine2 = factory1.createEngine();
		engine2.run();
		
	}
}
