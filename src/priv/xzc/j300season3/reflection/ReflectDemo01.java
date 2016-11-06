package priv.xzc.j300season3.reflection;

/**
 * 测试各种类型的(class,interface,emun,annotation,primitive type,void)java.lang.Class对象的获取方式
 * 获取{@link Class}对象有三种方法
 * <li>getClass
 * <li>Class.forName()
 * <li>.class
 * 
 * @author randall
 *
 */
public class ReflectDemo01 {

	public static void main(String[] args) {

		String path = "priv.xzc.j300season3.bean.User";

		try {
			/**
			 * 对象就是表示或者封装一些数据，类也是一堆数据，所以一个类被夹在后，JVM会创建该类的Class对象
			 * 类的整个信息结构会放到对应的Class对象中。
			 * <p>这个Class对象像一个镜子一样，通过这面镜子可以看到整个类的全部信息
			 */
			Class<?> clazz = Class.forName(path);
			System.out.println(clazz);

			Class<?> class1 = Class.forName(path);//类被加载到内存中，一个类就只生成一个Class对象
			/**
			 * 通过这个Class对象就可以操作这个类
			 */
			Class class2 = String.class;
			Class class3 = path.getClass();

			//是相同的Class对象
			System.out.println(class2.hashCode());
			System.out.println(class3.hashCode());
			System.out.println(class2==class3);

			//基本数据类型也可以(阅读源码就可以知道，所有的都可以)
			Class class4 = int.class;

			int[] arr01 = new int[10];
			int[] arr02 = new int[29];
			int[][] arr03 = new int[10][10];
			//是相同的Class对象，跟维数有关
			System.out.println(arr01.getClass() == arr02.getClass());
			/*System.out.println(arr01.getClass() == arr03.getClass());*///无法编译
			System.out.println(arr01.getClass().hashCode());
			System.out.println(arr02.getClass().hashCode());
			System.out.println(arr03.getClass().hashCode());


		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}		





	}
}
