package priv.xzc.j300season3.nestedclass;

/**
 * 内部类
 * @author randall
 *
 */
public class Demo01 {

	/**静态内部类*/
	private static class StatisNestedClass{
	}

	/**普通内部类（成员内部类）*/
	private class FieldInnerClass{
	}

	void sayHello(){
		/**局部内部类(方法内部类)*/
		class LocalClass{
		}

		/**匿名内部类*/
		//并不是new接口，接口是不能new的,其实也可以放到方法外边，但一般是放在方法内
		Runnable runnable = new Runnable() {//两个作用：定义了匿名内部类的类体，创建了匿名内部类的实例 
			@Override
			public void run() {
			}
		};//分号是必须的

	}

}
