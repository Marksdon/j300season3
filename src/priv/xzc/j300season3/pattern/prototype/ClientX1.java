package priv.xzc.j300season3.pattern.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * 模拟深度克隆(实现cloneable接口+序列化和反序列化)
 * <p>所谓
 * @author randall
 *
 */
public class ClientX1 {

	public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
		Date date = new Date(324651324);
		//1.原型
		Sheep4 s1 = new Sheep4("少莉",date);
		//2.克隆对象
		Sheep4 s2 = (Sheep4) s1.clone();
		System.out.println("原型======");
		System.out.println(s1);
		System.out.println(s1.getName() + "|" + s1.getBirthday());
		
		//3.修改引用对象
		date.setTime(3546365432L);
		System.out.println("修改引用后＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝");
		System.out.println(s1);
		System.out.println(s1.getName() + "|" + s1.getBirthday());
		
		s2.setName("多利");
		System.out.println(s2);
		System.out.println(s2.getName() + "|" + s2.getBirthday());
		
		
		/**
		 * 
		 * 序列化和反序列化实现深度克隆
		 * ------------------------
		 */
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(s1);//把原型对象序列化
		oos.flush();
		byte[] bytes = bos.toByteArray();//序列化成字节数组(二进制)
		ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
		ObjectInputStream ois = new ObjectInputStream(bis);
		Sheep4 s3 = (Sheep4) ois.readObject();
		
		System.out.println(s3);
		System.out.println(s3.getName() + "|" + s3.getBirthday()); 
		
		
		
	}
}
