package priv.xzc.j300season3.pattern.abstractfactory;

/**
 * 轮胎类
 * @author randall
 *
 */
public interface Tyre {

	void revolve();
}

class LuxuryTyre implements Tyre {

	@Override
	public void revolve() {
		System.out.println("旋转不磨损");
		
	}
	
}
class LowTyre implements Tyre {
	
	@Override
	public void revolve() {
		System.out.println("旋转磨损快");
		
	}
	
}
