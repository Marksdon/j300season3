package priv.xzc.j300season3.pattern.prototype;

import java.util.Date;

/**
 * 测试原型模式(prototype)(浅克隆)
 * @author randall
 *
 */
public class Client {
	public static void main(String[] args) throws Exception {
		
		Date date = new Date(12345889999779L);
		Sheep s1 = new Sheep("少利",date);
		System.out.println(s1);
		System.out.println(s1.getSname() +"|" + s1.getBirthday());
		date.setTime(73764439839L);//修改共同引用
		System.out.println(s1.getSname() +"|" + s1.getBirthday());
		
		//克隆后的羊对象
		Sheep s2 = (Sheep) s1.clone();
		System.out.println(s2);
		s2.setSname("多利");
		System.out.println(s2.getSname() +"|" + s2.getBirthday());
	}

}
