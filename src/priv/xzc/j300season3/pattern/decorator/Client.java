package priv.xzc.j300season3.pattern.decorator;

/**
 * 测试装饰
 * 
 * 
 * 
 * 
 * IO流实现细节:
 * Com
 * 
 * 
 * 应用场景：
 * IO流中设计
 * 
 * Wrapper
 * 
 * 
 * 
 * @author randall
 *
 */
public class Client {

	public static void main(String[] args) {
		Car car = new Car();
		car.move();

		System.out.println("增加新的功能，飞行----------------");
		FlyCar flyCar = new FlyCar(car);
		flyCar.move();

		System.out.println("添加新的功能，水上游--------------");
		WaterCar waterCar = new WaterCar(car);
		waterCar.move();
		
		//这样可以自由的组合，添加新的功能
		System.out.println("添加连个新的功能,水上游，飞行------");
		WaterCar waterCar2 = new WaterCar(flyCar);
		waterCar2.move();
		

	}
}
