package priv.xzc.j300season3.test.staticproxy;

/**
 * 测试静态代理
 * @author randall
 *
 */
public class Client {
	public static void main(String[] args) {
		Star rStart = new RealStart();
		Star proxy = new ProxyStar(rStart);
		proxy.confer();
		proxy.signe();
		proxy.book();
		proxy.sing();//有真实的被代理对象操作,其他都由代理对象操作
		proxy.collectMoney();

	}

}
