package priv.xzc.j300season3.pattern.builder;

public class SxtAirshipDirector implements AirshipDirector{

	private SxtAirshipBuilder builder;
	
	public SxtAirshipDirector(SxtAirshipBuilder builder) {
		this.builder = builder;
	}


	/**
	 * 组装飞船
	 */
	@Override
	public Airship createAirship() {
		Engine e = builder.buildEngine();
		OrbitalModule o = builder.buildOrbitalModule();
		EscapeTower et = builder.buildEscapseTower();
		Airship ship = new Airship();
		ship.setEngine(e);
		ship.setOrbitalModule(o);
		ship.setEscapeTower(et);
		return ship;
	}

}
