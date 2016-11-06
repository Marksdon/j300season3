package priv.xzc.j300season3.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * 测试应用反射机制读取注解
 * @author randall
 */
public class StuApp {
	public static void main(String[] args) {

		try {
			Class<?> clazz = Class.forName("priv.xzc.j300season3.annotation.SxtStudent");
			//获得类的所有有效注解
			Annotation[] annotations = clazz.getDeclaredAnnotations();

			for (Annotation a : annotations) {
				System.out.println(a);
			}

			//获得类的指定注解
			SxtTable sxtTable = (SxtTable) clazz.getAnnotation(SxtTable.class);
			System.out.println(sxtTable.value());

			//获得类的指定属性
			Field f = clazz.getDeclaredField("studentName");
			SxtField sxtField = f.getAnnotation(SxtField.class);
			System.out.println(
					sxtField.columnName() 
					+ "--"+sxtField.type() 
					+ "--"+ sxtField.length());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}

	}
}
