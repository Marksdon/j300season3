package priv.xzc.j300season3.pattern.builder;

public class Client {

	public static void main(String[] args) {
		
		AirshipDirector director = new SxtAirshipDirector(new SxtAirshipBuilder());
		Airship airship = director.createAirship();
		System.out.println(airship.getEngine().getName());
		airship.launch();
	}
}
