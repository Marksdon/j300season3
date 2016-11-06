package priv.xzc.j300season3.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import priv.xzc.j300season3.bean.User;

/**
 * 动态通过反射API操作：构造器，方法，属性
 * @author randall
 *
 */
public class ReflectDemo03 {

	public static void main(String[] args) {

		String path = "priv.xzc.j300season3.bean.User";

		try {
			/**
			 * 通过反射API调用构造方法，创造对象 
			 * <p>所以，作为javabean中必须要带有无参构造器,开源框架中经常这样在使用
			 */
			@SuppressWarnings("unchecked")
			Class<User> clazz = (Class<User>) Class.forName(path);

			User u = clazz.newInstance();//其实是调用了无参构造方法
			//获得指定的构造器,参数类型来区分构造方法，重载方法就是这样在区分的
			Constructor<User> c = clazz.getDeclaredConstructor(int.class, int.class, String.class);
			User u2 = c.newInstance(1001,18,"高崎er");
			System.out.println(u2.getUname());

			/**
			 * 通过反射API调用普通方法
			 */
			User u3 = clazz.newInstance();
			Method method = clazz.getDeclaredMethod("setUname", String.class);
			method.invoke(u3, "高淇");//激活

			/**
			 * 通过反射API操作属性
			 */
			User u4 = clazz.newInstance();
			Field field = clazz.getDeclaredField("uname");
			field.setAccessible(true);//不需要安全检查，直接访问
			field.set(u4, "高淇");//通过反射写属性值
			System.out.println(u4.getUname());
			System.out.println(field.get(u4));//通过反射读属性数据

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}


	}
}
