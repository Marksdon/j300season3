package priv.xzc.j300season3.pattern.singleton;
/**
 * 饿汉式单例模式
 * <p>类初始化时就创建该对象，优点：调用效率高，加载天然线程安全；缺点：如果该对象不用到，就白加载了，
 * 而且如果是加载比较耗费资源的对象，那就效率低了
 * @author randall
 *
 */
public class SigletonDomo1 {
	//类初始化的时候，就加载进来
	private static SigletonDomo1 instance = new SigletonDomo1();
	
	private SigletonDomo1() {
	}
	
	public static /*synchronized*/ SigletonDomo1 getInstance(){
		return instance;
	}
}
