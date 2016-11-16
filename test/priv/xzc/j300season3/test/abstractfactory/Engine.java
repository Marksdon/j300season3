package priv.xzc.j300season3.test.abstractfactory;

/**
 * 引擎
 * @author randall
 *
 */
public interface Engine {

	void run();
	
}


class LuxuryEngine implements Engine {

	@Override
	public void run() {
		System.out.println("run faster");
	}
	
}

class LowEngine implements Engine {

	@Override
	public void run() {
		System.out.println("run not faster");
	}
	
}