package priv.xzc.j300season3.pattern.abstractfactory;

/**
 * 发动机接口,汽车组件
 * @author randall
 *
 */
public interface Engine {
	void run();
	void start();
	
}


class LuxuryEngine implements Engine{

	@Override
	public void run() {
		System.out.println("转得块");
	}

	@Override
	public void start() {
		System.out.println("启动快");
		
	}
	
}
class LowEngine implements Engine{
	
	@Override
	public void run() {
		System.out.println("转得慢");
	}
	
	@Override
	public void start() {
		System.out.println("启动慢");
		
	}
	
}