package priv.xzc.j300season3.pattern.builder;

/**
 * 飞船建造者
 * @author randall
 *
 */
public interface AirshipBuilder {

	Engine buildEngine();
	OrbitalModule buildOrbitalModule();
	EscapeTower buildEscapseTower();
	
}
