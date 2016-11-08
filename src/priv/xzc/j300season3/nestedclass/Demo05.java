package priv.xzc.j300season3.nestedclass;

/**
 * 
 * @author randall
 *
 */
public class Demo05 {
	
	public void test02(Car car){
		car.run();
	}
	
	public void test(){
		
		//匿名内部类(接口式),定义在方法内，也是个方法内部类
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				
			}
		};
		
		
		/**匿名内部类继承式写法*/
		Car car = new Car(){
			@Override
			public void run() {
				System.out.println("子类的车在跑");
			}
		};
		car.run();
		
		//参数式写法
		test02(new Car(){
			@Override
			public void run() {
				System.out.println("参数式匿名内部类");
			}
		});
	}
	
	
	
	
}

class Car{
	public void run(){
		System.out.println("子类，车在跑");
	}
}