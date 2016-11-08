package priv.xzc.j300season3.nestedclass;

/**
 * 静态内部类的基本用法
 * @author randall
 *
 */
public class Demo02 {

	public static void main(String[] args) {
		//两种创建方法,一般用第一种
		Outer02.StaticInnerClass sic = new Outer02.StaticInnerClass();
		//		StaticInnerClass sic = new StaticInnerClass();//import priv.xzc.j300season3.nestedclass.Outer02.StaticInnerClass;

	}

}


class Outer02{

	int c = 5;
	static int d = 10;
	//静态内部类
	static class StaticInnerClass{
		int d = 3;
		static int b = 5;

		private void test(){
			System.out.println(d);//可以使用外部类的静态成员
			/*System.out.println(c);*///不能使用外部类的普通成员
		}
	}

}


class Outer06{
	int a = 10;
	static class NestedClass{
		int d = 3;
		static int k = 4;
		public void test(){//不能使用外部类的普通成员，可以使用外部类的静态成员
			/*System.out.println(a);*/
		}
	}
}