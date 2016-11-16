package priv.xzc.j300season3.pattern.prototype;

import java.util.Date;

/**
 * 原型模式(prototype)
 * 模拟浅克隆
 * @author randall
 *
 */
public class Sheep3 implements Cloneable{

	private String name;
	private Date birthday;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = super.clone();//直接调用父类的克隆方法 
		return obj;
		
	}
	
	
	
	public Sheep3() {
	}
	
	public Sheep3(String name, Date birthday) {
		super();
		this.name = name;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	
	
}
