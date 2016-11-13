package priv.xzc.j300season3.pattern.prototype;

import java.util.Date;

/**
 * 用于深克隆
 * 实现克隆：
 * <p>1.实现cloneable接口（空接口）
 * <p>2.重写clone()方法
 * 
 * <p>native 修饰表示要调用c代码，效率高
 * 
 * 深克隆（克隆时，引用也克隆）
 * 
 * @author randall
 *
 */
public class Sheep2 implements Cloneable{

	private String sname;
	private Date birthday;
	public Sheep2() {
	}
	public Sheep2(String sname, Date birthday) {
		this.sname = sname;
		this.birthday = birthday;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = super.clone();//直接调用object对象的clone（）方法实现克隆
		//添加如下代码，实现深克隆(deep clone)
		Sheep2 s = (Sheep2) obj;
		s.birthday = (Date)this.birthday.clone();
		return s;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
}
