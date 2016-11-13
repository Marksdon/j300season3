package priv.xzc.j300season3.pattern.decorator;

/**
 * 抽象组件
 * @author randall
 *
 */
public interface ICar {
	void move();
}

/**
 * 具体构件角色(真实对象)
 * 真实对象，被装饰对象
 * @author randall
 *
 */
class Car implements ICar {
	@Override
	public void move() {
		System.out.println("陆地上跑");
	}

}

/**
 * 装饰器角色
 * @author randall
 *
 */
class SuperCar implements ICar {

	protected ICar car;
	
	public SuperCar(ICar car) {
		this.car = car;
	}

	@Override
	public void move() {
		car.move();//直接调用被装饰的move
	}
	
}

/**
 * 具体装饰角色
 * @author randall
 *
 */
class FlyCar extends SuperCar {

	public FlyCar(ICar car) {
		super(car);
	}

	public void fly(){
		System.out.println("天上飞");
	}
	
	@Override
	public void move() {
		super.move();
		fly();//加入飞行方法
	}
	
}

/**
 * 具体装饰角色
 * @author randall
 *
 */
class WaterCar extends SuperCar {

	public WaterCar(ICar car) {
		super(car);
	}

	public void swim(){
		System.out.println("水上游");
	}
	
	@Override
	public void move() {
		super.move();
		swim();//加游水方法
	}
	
}

/**
 * 具体装饰角色
 * @author randall
 *
 */
class AICar extends SuperCar {
	
	public AICar(ICar car) {
		super(car);
	}
	
	public void auto(){
		System.out.println("自动驾驶");
	}
	
	@Override
	public void move() {
		super.move();
		auto();//加自动方法
	}
	
}

