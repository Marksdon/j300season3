package priv.xzc.j300season3.nestedclass;

/**
 * 测试方法内部类（局部内部类）
 * @author randall
 *
 */
public class Demo04 {



}

class Outer04{
	public void test(){
		int a = 3;
		/**局部内部类*/
		//地位就像方法属性一样，不能有静态属性
		class Inner{//只在本方法内可见
			int b = 10;
			/*static int a = 10;*///不能定义静态成员，就像方法内部不能定义静态变量
			void tt(){
				System.out.println(b);
				System.out.println(a);
				/**
				 * 方法内部类中不能引用所在方法的普通局部变量，除非的常量。原因如下：还没理解 
				 * 生命周期不一样
				 */
			}
		}
	}
}


class KK {
	public static void test(){

		//方法内不可以定义静态成员，所以局部内部类（方法内部类）不可以定义静态属性
		class DD {
			int a = 1;
		}

	}
}
