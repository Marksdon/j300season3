package priv.xzc.j300season3.pattern.simplefactory;
/**
 * 测试在没有工厂模式下的情况
 * @author randall
 *
 */
public class Client01 {

	public static void main(String[] args) {
		
		Car car1 = new Audi();
		Car car2 = new Byd();
		
		car1.run();
		car2.run();
	}
}
