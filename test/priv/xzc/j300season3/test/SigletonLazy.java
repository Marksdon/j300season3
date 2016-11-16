package priv.xzc.j300season3.test;

/**
 * 测试懒汉式单例
 * @author randall
 *
 */
public class SigletonLazy {

	/**
	 * 类加载时,不进行对象的创建
	 */
	private static SigletonLazy instance;
	
	/**
	 * 私有构造器
	 */
	private SigletonLazy() {
	}
	
	
	/**
	 * 提供一个全局的访问点，加了同步，调用效率低
	 * @return {@link SigletonLazy}对象
	 */
	public static synchronized final SigletonLazy getInstance(){
		if (instance == null) {
			instance = new SigletonLazy();
		}
		return instance;
	}
	
}
