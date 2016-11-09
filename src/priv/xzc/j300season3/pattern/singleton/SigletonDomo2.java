package priv.xzc.j300season3.pattern.singleton;
/**
 * 测试懒汉式单例模式
 * 缺点：高并发下，调用低
 * @author randall
 *
 */
public class SigletonDomo2 {
	//类初始化的时候，不创建对象
	private static SigletonDomo2 instance;
	
	private SigletonDomo2() {
	}
	
	//方法同步，调用效率低
	public static synchronized SigletonDomo2 getInstance(){
		if (instance == null) {
			instance = new SigletonDomo2();
		}
		return instance;
	}
}
