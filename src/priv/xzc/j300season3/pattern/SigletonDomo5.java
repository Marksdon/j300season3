package priv.xzc.j300season3.pattern;
/**
 * 测试枚举方式(避免了反射和序列化)
 * 这种方式：遗憾的没有延时加载
 * <p>调用效率高
 * @author randall
 *
 */
public enum SigletonDomo5 {
	//这个枚举元素，本事就是单例对象
	INSTANCE;
	
	//添加自己需要的操作
	public void singtonOperation(){
	}

}
