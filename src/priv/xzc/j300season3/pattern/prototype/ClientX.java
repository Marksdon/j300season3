package priv.xzc.j300season3.pattern.prototype;

import java.util.Date;

/**
 * 模拟浅克隆
 * @author randall
 *
 */
public class ClientX {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Date date = new Date(353216321);
		
		//1.获取原型
		Sheep3 s1 = new Sheep3("少莉", date);
		System.out.println(s1);
		System.out.println(s1.getName() + "|" + s1.getBirthday() );
		
		//2.克隆
		Sheep3 s2 = (Sheep3) s1.clone();
		
		//3.修改共同引用
		date.setTime(3548431658L);
		
		
		//原型对象以及数据
		System.out.println(s1);
		System.out.println(s1.getName() + "|" + s1.getBirthday() );
		//克隆对象以及数据
		System.out.println(s2);
		s2.setName("多利");
		System.out.println(s2.getName() + "|" + s2.getBirthday() );
		
		
		
	}
}
