package priv.xzc.j300season3.pattern.simplefactory;

/**
 * 简单工厂
 * @author randall
 *
 */
public class CarFactory {

	public static Car createCar(String type){
		
		if ("奥迪".equals(type)) {
			return new Audi();
		} else if ("比亚迪".equals(type)) {
			return new Byd();
		} else {
			return null;
		}
		
	}
	
}
