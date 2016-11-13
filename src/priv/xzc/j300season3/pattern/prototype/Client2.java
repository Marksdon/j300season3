package priv.xzc.j300season3.pattern.prototype;

import java.util.Date;

/**
 * 原型模式prototype(深克隆)
 * @author randall
 *
 */
public class Client2 {

	public static void main(String[] args) throws Exception {
		Date date = new Date(12345889999779L);
		Sheep2 s1 = new Sheep2("少利",date);
		//克隆多利,实现深克隆
		Sheep2 s2 = (Sheep2) s1.clone();
		System.out.println(s1);
		System.out.println(s1.getSname() +"|" + s1.getBirthday());
		date.setTime(73764439839L);//修改共同引用
		System.out.println(s1.getSname() +"|" + s1.getBirthday());
		
		//克隆后的羊对象
		System.out.println(s2);
		s2.setSname("多利");
		System.out.println(s2.getSname() +"|" + s2.getBirthday());
		
		
	}
}
