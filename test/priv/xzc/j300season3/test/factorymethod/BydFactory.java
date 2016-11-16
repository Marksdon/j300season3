package priv.xzc.j300season3.test.factorymethod;

/**
 * 生成比亚迪工厂
 * @author randall
 *
 */
public class BydFactory implements CarFactory {

	@Override
	public Car createCar() {
		return new Byd();
	}

}
