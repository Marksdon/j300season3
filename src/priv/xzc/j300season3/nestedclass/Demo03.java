package priv.xzc.j300season3.nestedclass;

/**
 * 成员内部类（普通内部类）
 * @author randall
 *
 */
public class Demo03 {

	//在不相关类中创建内部类
	Outer03 out = new Outer03();
	//内部类依赖于外部类对象
	Outer03.InnerClass ic = out.new InnerClass();
	
	public static void main(String[] args) {
		C c = new C();;
		C.A a = c.new A();
		a.test();//priv.xzc.j300season3.nestedclass.C$A@2a139a55
		
		C.B b = new C.B();
		b.test();//priv.xzc.j300season3.nestedclass.C$B@15db9742
		
		
		//内部类的对象表示由$隔开类
	}
	
	
	
}


/**
 * 成员内部类，定义内部类的两个作用
 * 1.内部类可以使用外部类的成员
 * 2.内部类只给外部类使用
 * <p>当满足这两点，我们才定义内部类
 * @author randall
 */
class Outer03{
	private int a = 3;
	int b = 10;

	public void ttt(){
		//在外部类中，直接使用该内部类
		InnerClass ic = new InnerClass();
	}

	//内部类对象要绑定在外部类上，现有外部类
	class InnerClass{

		/**
		 * 普通成员内部类为什么不能有静态成员,反证法，假设可以定义
		 */
		/*static InnerClass ic = new InnerClass();*///那么外部可以直接获得该内部类的对象，这个与设计内部类的初衷相违背

		int c = 1;
		/*static int a = 3;*///普通成员内部类不能有静态成员
		final static int b = 5;//可以是常量
		/*final static Date d = new Date();*/ //编译器不能确定 
		void test(){
			System.out.println("内部类：" + this);//成员内部类必须要有外部类，静态内部类就不是这样子
		}
	}
}



class C {
	class A {
		int a = 10;//不能有静态成员
		final static String F_STRING = "asdf";//可以是常量表达式
		void test(){
			System.out.println("成员内部类对象 ："  +this);
		}

	}
	
	
	static class B {
		void test(){
			System.out.println("静态内部类对象： " + this);
		}
	}

}