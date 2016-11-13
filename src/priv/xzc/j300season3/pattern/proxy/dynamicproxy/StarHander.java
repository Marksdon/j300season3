package priv.xzc.j300season3.pattern.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理核心
 * @author randall
 *
 */
public class StarHander implements InvocationHandler{

	Star realStar;

	public StarHander(Star realStar) {
		this.realStar = realStar;
	}

	/**
	 * 所有代理方法都在这里统一处理
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		/**
		 * 核心方法之外的，做统一的处理
		 */
		System.out.println("真正方法执行前");
		System.out.println("面谈，签合同，订票");
		Object obj = null;
		if (method.getName().equals("sing")) {
			obj = method.invoke(realStar, args);
		}
		System.out.println("真正方法执行后");
		System.out.println("收尾款");
		return obj;
	}

}
