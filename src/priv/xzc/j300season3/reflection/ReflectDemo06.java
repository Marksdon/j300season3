package priv.xzc.j300season3.reflection;

import java.lang.reflect.Method;

import priv.xzc.j300season3.bean.User;

/**
 * 反射的性能问题
 * <p>使用反射的性能效率要比普通的第30倍左右
 * <p>提高反射的效率，可以取消禁用访问开关
 * @author randall
 *
 */
public class ReflectDemo06 {

	public static void main(String[] args) throws Exception {

		test1();
		test2();
		test3();
	}


	/**
	 * 普通调用测试
	 */
	public static void test1(){

		long begin = System.currentTimeMillis();

		User u = new User();
		for (int i = 0; i < 1000000000L; i++) {
			u.getUname();//访问10亿次
		}
		long end = System.currentTimeMillis();
		System.out.println("普通调用消耗时间： " +(end-begin)+"ms");

	}


	/**
	 * 不禁用安全检查，反射动态访问10亿次
	 * @throws Exception
	 */
	@SuppressWarnings("all")
	public static void test2() throws Exception{
		long begin = System.currentTimeMillis();
		User u = new User();
		Class<User> clazz = (Class<User>) u.getClass();
		Method method = clazz.getDeclaredMethod("getUname", null);
		//不禁用安全检查
		/*method.setAccessible(true);*/
		for (int i = 0; i < 1000000000L; i++) {
			//访问10亿次
			method.invoke(u, null);
		}
		long end = System.currentTimeMillis();
		System.out.println("反射动态调用消耗时间： " +(end-begin)+"ms");
	}
	
	
	/**
	 * 禁用安全检查，反射动态访问10亿次
	 * @throws Exception
	 */
	@SuppressWarnings("all")
	public static void test3() throws Exception{
		long begin = System.currentTimeMillis();
		User u = new User();
		Class<User> clazz = (Class<User>) u.getClass();
		Method method = clazz.getDeclaredMethod("getUname", null);
		//禁用安全检查
		method.setAccessible(true);
		for (int i = 0; i < 1000000000L; i++) {
			//访问10亿次
			method.invoke(u, null);
		}
		long end = System.currentTimeMillis();
		System.out.println("反射动态调用消耗时间： " +(end-begin)+"ms");
	}
	
	
	
	


}
