package priv.xzc.j300season3.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import priv.xzc.j300season3.bean.User;

/**
 * 应用反射的API获取类的信息(类的名字、属性、方法和构造器)
 * @author randall
 *
 */
public class ReflectDemo02 {

	public static void main(String[] args) {

		String path = "priv.xzc.j300season3.bean.User";

		try {

			Class<?> clazz = Class.forName(path);
			//获取类名
			System.out.println(clazz.getName());//获取的是类的全路径(包名+类名)
			System.out.println(clazz.getSimpleName());//获取的是类名(类名)

			//获取类的属性
			Field[] fields = clazz.getFields();//获得类的public的属性
			Field[] fields1 = clazz.getDeclaredFields();//获取全部声明的属性，不管是否私有
			Field field = clazz.getDeclaredField("uname");//获取某个属性
			for (Field field1 : fields1) {
				System.out.println("属性 : " + field1);
			}

			//获取类的放方法
			Method[] methods = clazz.getMethods();//只能获取Public方法
			Method[] methods2 = clazz.getDeclaredMethods();//和上面一样的，获取所有声明的方法
			Method method = clazz.getDeclaredMethod("getUname", null);//无参数就要填写Null
			Method method1 = clazz.getDeclaredMethod("setUname", String.class);//填写参数的类型
			for (Method m : methods2) {
				System.out.println("方法: " + m);
			}

			//获取类的构造器
			Constructor[] constructors = clazz.getDeclaredConstructors();//获取所有定义的构造器
			Constructor<User> u = (Constructor<User>) clazz.getConstructor(null);//获取无参构造器
			Constructor<User> u1 = (Constructor<User>) clazz.getConstructor(int.class,int.class,String.class);//获取带参数构造器，传递什么参数的类信息就获取什么构造器


		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}



	}
}
