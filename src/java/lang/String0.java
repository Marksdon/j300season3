package java.lang;

/**
 * 用于测试java的类加载器的双亲代理模式
 * <p>所以定义与java.lang.String想冲突的类
 * 
 * 
 * 为了让它不影响编译器，先改名为String0
 * @author randall
 *
 */
public class String0 {

	/**
	 * 测试重写toString()方法,看看此类是否会被加载
	 */
	@Override
	public String toString() {
		return "aaa";
	}

}
