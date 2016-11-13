package priv.xzc.j300season3.pattern.abstractfactory;
/**
 * 豪华汽车工厂
 * @author randall
 *
 */
public class LuxuryCarFactory implements CarFactory{

	@Override
	public Engine createEngine() {
		return new LuxuryEngine();
	}

	@Override
	public Seat createSeat() {
		return new LuxurySeat();
	}

	@Override
	public Tyre createTyre() {
		return new LuxuryTyre();
	}

	
}
