package priv.xzc.j300season3.test.abstractfactory;

/**
 * 工厂抽象
 * @author randall
 *
 */
public interface CarFactory {

	Engine createEngine();
	Seat createSeat();
	
}

class LuxuryCarFactor implements CarFactory {

	@Override
	public Engine createEngine() {
		return new LuxuryEngine();
	}

	@Override
	public Seat createSeat() {
		return new LuxurySeat();
	}
	
}


class LowCarFactor implements CarFactory {

	@Override
	public Engine createEngine() {
		return new LowEngine();
	}

	@Override
	public Seat createSeat() {
		return new LowSeat();
	}
	
}
