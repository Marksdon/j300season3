package priv.xzc.j300season3.pattern.prototype;

/**
 * 原型模式prototype
 * 效率，短时间建造大量对象,并且new对象过程比较消耗时间，可以考虑原型模式（clone方式）
 * <p>与new做比较
 * 
 * spring中bean对象：单例模式+原型模式（当然原型模式和工厂模式搭配起来）
 * @author randall
 *
 */
public class Client4 {

	/**
	 * 测试clone对象消耗时间
	 * @param size clone对象的次数
	 * @throws Exception
	 */
	public static void testClone(int size) throws Exception{
		Laptop t = new Laptop();
		long start = System.currentTimeMillis();
		for (int i = 0; i < size; i++) {
			Laptop temp = (Laptop) t.clone();
		}
		long end = System.currentTimeMillis();
		System.out.println("clone方式消耗时间:"+ (end - start));
	}

	/**
	 * 测试new对象耗时
	 * @param size new对象的次数
	 * @throws Exception
	 */
	public static void testNew(int size) throws Exception{
		long start = System.currentTimeMillis();
		for (int i = 0; i < size; i++) {
			Laptop temp = new Laptop();
		}
		long end = System.currentTimeMillis();
		System.out.println("new方式消耗时间:"+ (end - start));
	}

	public static void main(String[] args) throws Exception {

		testNew(1000);
		testClone(1000);

	}
}
	class Laptop implements Cloneable{
		public Laptop() {
			try {
				Thread.sleep(10);//模拟new对象消耗时间的过程
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		@Override
		protected Object clone() throws CloneNotSupportedException {
			Object obj = super.clone();//直接调用object对象的clone（）方法实现克隆
			return obj;
		}
	}

