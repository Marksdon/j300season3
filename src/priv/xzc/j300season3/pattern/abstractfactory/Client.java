package priv.xzc.j300season3.pattern.abstractfactory;

/**
 * 抽象工厂模式：
 * <p>对增加新的产品无能为力，适合增加产品族
 * @author randall
 *
 */
public class Client {

	public static void main(String[] args) {
		CarFactory factory = new LuxuryCarFactory();
		Engine engine = factory.createEngine();
		Seat seat = factory.createSeat();
		Tyre tyre = factory.createTyre();
		engine.run();
		engine.start();
	}
}
