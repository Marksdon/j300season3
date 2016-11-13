package priv.xzc.j300season3.pattern.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * 测试动态代理-----很重要，要吃透
 * <p>这种动态代理不像静态代理需要写代理类{@link ProxyStar}
 * @author randall
 *
 */
public class Client {
	public static void main(String[] args) {
		Star realStar = new RealStar();
		//处理器
		StarHander hander = new StarHander(realStar);

		Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
				new Class[]{Star.class}, hander);
		proxy.bookTicketd();
		proxy.sing();
	}

}
