package priv.xzc.j300season3.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

import priv.xzc.j300season3.bean.User;

/**
 * 反射操作泛型
 * @author randall
 *
 */
public class ReflectDemo04 {

	/**
	 * 测试有参数的
	 * @param map
	 * @param list
	 */
	public void test01(Map<String, User> map, List<User> list){
		System.out.println("ReflectDemo04.test01()");
	}
	
	/**
	 * 用于测试返回值
	 * @return
	 */
	public Map<Integer, User> test02(){
		System.out.println("ReflectDemo04.test02()");
		return null;
	}
	
	
	public static void main(String[] args) {
		
		try {
			//反射获取泛型类型
			Method m = ReflectDemo04.class.getDeclaredMethod("test01", Map.class,List.class);
			Type[] t = m.getGenericParameterTypes();
			for (Type paramType : t) {
				System.out.println("#"+paramType);
				if (paramType instanceof ParameterizedType) {
					Type[] types = ((ParameterizedType) paramType).getActualTypeArguments();
					for (Type type : types) {
						System.out.println(type);
					}
					
				}
			}
			
			
			//反射获取返回类型的泛型
			@SuppressWarnings("all")
			Method method = ReflectDemo04.class.getDeclaredMethod("test02", null);
			Type type = method.getGenericReturnType();//获取带泛型的返回类型
			
			System.out.println("#" + type);
			if (type instanceof ParameterizedType) {
				Type[] types = ((ParameterizedType) type).getActualTypeArguments();
				for (Type type2 : types) {
					System.out.println(type2);
				}
				
			}
			
			
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		
	}



}
