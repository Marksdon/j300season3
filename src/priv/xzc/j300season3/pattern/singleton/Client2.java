package priv.xzc.j300season3.pattern.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 测试反射和反序列化破解单例模式
 * 反射和反序列化对于枚举是不起作用的
 * @author randall
 *
 */
public class Client2 {

	public static void main(String[] args) throws Exception {
		SigletonDomo6 s1 = SigletonDomo6.getInstance();
		SigletonDomo6 s2 = SigletonDomo6.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		//通过反射的方式直接调用私有构造器
		/*Class<SigletonDomo6> clazz = (Class<SigletonDomo6>) Class.forName("priv.xzc.j300season3.pattern.singleton.SigletonDomo6");
		Constructor<SigletonDomo6> c = clazz.getDeclaredConstructor(null); 
		c.setAccessible(true);//取消安全检查，破解单例
		//这种不是通过单例获取的对象，所以在防止破解中不会起作用
		//有效的作用是，必须先通过单例获取对象后，再使用这个就是有效的
		SigletonDomo6 s3 = c.newInstance();
		SigletonDomo6 s4 = c.newInstance();
		System.out.println(s3);
		System.out.println(s4);*/

		//通过反序列化的方式构造多个对象
		FileOutputStream fos = new FileOutputStream("d:/a.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.close();
		fos.close();

		ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("d:/a.txt")
				);
		SigletonDomo6 s3 = (SigletonDomo6) ois.readObject();
		System.out.println(s3);
		ois.close();

	}
}
