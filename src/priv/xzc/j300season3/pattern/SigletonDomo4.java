package priv.xzc.j300season3.pattern;
/**
 * 测试静态内部类的实现单例模式
 * 这种方式：线程安全，调用效率高，并且实现了延时加载
 * @author randall
 *
 */
public class SigletonDomo4 {
	
	private static class SiggletonClassInstance{
		private static final SigletonDomo4 instance = new SigletonDomo4();
	} 
	
	private SigletonDomo4() {
	}
	
	public static /*synchronized*/ SigletonDomo4 getInstance(){
		return SiggletonClassInstance.instance;
	}
}
