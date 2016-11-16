package priv.xzc.j300season3.test.simplefactory;

/**
 * 简单工厂(静态工厂)
 * @author randall
 *
 */
public class CarFactory {

	/**
	 * 生成汽车
	 * @param cname 生成的汽车名称
	 * @return 汽车对象
	 */
	public static Car createCar(String cname){
		if (cname.equals("audi")) {
			return new Audi();
		} else if (cname.equals("byd")) {
			return new Byd();
		} 
		return null;
		 
	}
	
	
}
