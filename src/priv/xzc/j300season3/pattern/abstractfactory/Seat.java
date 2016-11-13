package priv.xzc.j300season3.pattern.abstractfactory;

/**
 * 座椅类
 * @author randall
 *
 */
public interface Seat {

	void massage();
}

class LuxurySeat implements Seat {

	@Override
	public void massage() {
		System.out.println("可以自动按摩");
		
	}
	
}
class LowSeat implements Seat {
	
	@Override
	public void massage() {
		System.out.println("不可以自动按摩");
		
	}
	
}
