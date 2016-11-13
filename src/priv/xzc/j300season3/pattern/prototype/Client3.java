package priv.xzc.j300season3.pattern.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * 原型模式prototype(深克隆)
 * 使用序列化和反序列化实现深克隆
 * @author randall
 *
 */
public class Client3 {

	public static void main(String[] args) throws Exception {
		Date date = new Date(12345889999779L);
		Sheep s1 = new Sheep("少利",date);
		System.out.println(s1);
		System.out.println(s1.getSname() +"|" + s1.getBirthday());
		
		
		//使用序列化和饭序列化实现deep clone
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(s1);
		byte[] bytes = bos.toByteArray();
		oos.flush();
		oos.close();
		bos.close();

		ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
		ObjectInputStream ois = new ObjectInputStream(bis);
		Sheep s2 = (Sheep) ois.readObject();//克隆好的羊对象
		ois.close();
		bis.close();
		
		date.setTime(73764439839L);//修改共同引用
		System.out.println(s1.getSname() +"|" + s1.getBirthday());
		
		//克隆后的羊对象
		System.out.println(s2);
		s2.setSname("多利");
		System.out.println(s2.getSname() +"|" + s2.getBirthday());
		
		
	}
}
