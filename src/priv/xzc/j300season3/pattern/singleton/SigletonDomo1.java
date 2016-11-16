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


	public static void main(String[] args) {

		SigletonEH sEh = SigletonEH.getInstance();
		sEh.setName("那么");
		System.out.println(sEh.getName());

	}

}



class SigletonEH{

	/**
	 * 饿汉式单例
	 */
	/**
	 * 静态加载,天然线程安全
	 */
	private static final SigletonEH instance = new SigletonEH();
	/**
	 * 私有构造器
	 */
	private SigletonEH() {
	}


	/**
	 * 提供一个全局访问点
	 * @return {@link SigletonEH}实例
	 */
	public static SigletonEH getInstance(){
		return instance;
	}

	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



}



class Clienttt{
	public static void main(String[] args) {

		SigletonEH sEh = SigletonEH.getInstance();
		sEh.setName("那么");
		System.out.println(sEh.getName());

	}

}
