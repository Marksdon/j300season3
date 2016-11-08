package priv.xzc.j300season3.pattern;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 测试枚举方式(如何防止反射和反序列化)
 * @author randall
 */
public class SigletonDomo6 implements Serializable {
	//类初始化的时候，不创建对象
	private static SigletonDomo6 instance;

	private SigletonDomo6() {
		//防止反射破解单例
		if (instance != null) {
			throw new RuntimeException();
		}

	}
	//方法同步，调用效率低
	public static synchronized SigletonDomo6 getInstance(){
		if (instance == null) {
			instance = new SigletonDomo6();
		}
		return instance;
	}
	
	/**
	 * 破解反序列化破坏单例
	 * @return
	 * @throws ObjectStreamException
	 */
	//反序列化时，如果定义了readResolve()直接返回此方法指定的对象，而不需要单独饭序列化出新的对象
	private Object readResolve() throws ObjectStreamException{
		return instance;
	}
	

}
