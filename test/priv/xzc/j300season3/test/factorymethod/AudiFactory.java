package priv.xzc.j300season3.test.factorymethod;

import priv.xzc.j300season3.test.factorymethod.Car;

/**
 * 生成奥迪工厂
 * @author randall
 *
 */
public class AudiFactory implements CarFactory {

	@Override
	public Car createCar() {
		return new Audi();
	}

}
