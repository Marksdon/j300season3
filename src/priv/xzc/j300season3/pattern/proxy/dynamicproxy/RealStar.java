package priv.xzc.j300season3.pattern.proxy.dynamicproxy;

/**
 * 真实的歌星类
 * @author randall
 *
 */
public class RealStar implements Star {

	@Override
	public void confer() {
		System.out.println("RealStar.confer()");
	}

	@Override
	public void singContract() {
		System.out.println("RealStar.singContract()");
		
	}

	@Override
	public void bookTicketd() {
		System.out.println("RealStar.bookTicketd()");
	}

	@Override
	public void sing() {
		System.out.println("RealStar(周杰伦本人).sing()");
	}

	@Override
	public void collectMoney() {
		System.out.println("RealStar.collectMoney()");
	}

}
