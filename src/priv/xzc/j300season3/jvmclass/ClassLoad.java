package priv.xzc.j300season3.jvmclass;

/**
 * 测试类的加载
 * @author randall
 *
 */
public class ClassLoad {

	static {
		System.out.println("初始化类ClassLoad");
	}
	public static void main(String[] args) {
		System.out.println("ClassLoad的main方法");
		A a = new A();
		System.out.println(A.width);
		/**
		 * 类加载和初始化就只有一次，不需要反复地加载
		 */
		A a2 = new A();
	}

}


class A extends A_Father{
	public static int width = 100; //静态变量，域，field
	static {
		System.out.println("静态初始化类A");
		width = 300; 
	}
	public A() {
		System.out.println("创建A类对象");
	}

}


class A_Father{
	static{
		System.out.println("初始化类A_Father");
	}
}