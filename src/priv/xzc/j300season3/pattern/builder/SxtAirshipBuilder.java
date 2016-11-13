package priv.xzc.j300season3.pattern.builder;
/**
 * 用到建造者模式，StringBuiler,xml解析
 * SaxBuilder,DomBuilder
 * @author randall
 *
 */
public class SxtAirshipBuilder implements AirshipBuilder{

	@Override
	public Engine buildEngine() {
		System.out.println("构建尚学堂牌发动机");
		return new Engine("尚学堂发动机");
	}

	@Override
	public OrbitalModule buildOrbitalModule() {
		System.out.println("构建尚学堂轨道");
		return new OrbitalModule("尚学堂配轨道舱");
	}

	@Override
	public EscapeTower buildEscapseTower() {
		System.out.println("构建尚学堂牌逃逸塔");
		return new EscapeTower("尚学堂牌逃逸塔");
	}

}
