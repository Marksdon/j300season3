package priv.xzc.j300season3.test.staticproxy;

public class ProxyStar implements Star {

	private Star star;
	
	public ProxyStar(Star star) {
		this.star = star;
	}

	@Override
	public void confer() {
		System.out.println("proxy confer...");
	}

	@Override
	public void signe() {
		System.out.println("proxy siging ...");
	}

	@Override
	public void book() {
		System.out.println("proxy booking ...");
	}

	@Override
	public void sing() {
		star.sing();
	}

	@Override
	public void collectMoney() {
		System.out.println("proxy collecting moneny");
	}

}
