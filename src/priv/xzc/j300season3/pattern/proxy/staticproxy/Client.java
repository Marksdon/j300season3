package priv.xzc.j300season3.pattern.proxy.staticproxy;

/**
 * 测试静态代理模式
 * @author randall
 *
 */
public class Client {

	public static void main(String[] args) {
		Star real = new RealStar();
		Star proxy = new ProxyStar(real);
		proxy.confer();
		proxy.singContract();
		proxy.bookTicketd();
		proxy.sing();//周杰伦本人
		proxy.collectMoney();
	}
}
