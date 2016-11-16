package priv.xzc.j300season3.test.abstractfactory;

/**
 * 座椅
 * @author randall
 *
 */
public interface Seat {

	void messege();
	
}

class LuxurySeat implements Seat {

	@Override
	public void messege() {
		System.out.println("cound be message");
	}
	
}

class LowSeat implements Seat {

	@Override
	public void messege() {
		System.out.println("cound not be message");
	}
	
}
