package priv.xzc.j300season3.pattern.proxy.staticproxy;

public class ProxyStar implements Star{

	private Star star;

	public ProxyStar(Star star) {
		this.star = star;
	}

	@Override
	public void confer() {
		System.out.println("ProxyStar.confer()");
	}

	@Override
	public void singContract() {
		System.out.println("ProxyStar.singContract()");

	}

	@Override
	public void bookTicketd() {
		System.out.println("ProxyStar.bookTicketd()");
	}


	@Override
	public void collectMoney() {
		System.out.println("ProxyStar.collectMoney()");
	}

	@Override
	public void sing() {
		star.sing();
	}

}
