package priv.xzc.j300season3.pattern.abstractfactory;

/**
 * 汽车工厂
 * @author randall
 *
 */
public interface CarFactory {
	Engine createEngine();
	Seat createSeat();
	Tyre createTyre();
}
