package priv.xzc.j300season3.pattern.prototype;

import java.io.Serializable;
import java.util.Date;

/**
 * 用于浅克隆
 * 实现克隆：
 * <p>1.实现cloneable接口（空接口）
 * <p>2.重写clone()方法
 * 
 * <p>native 修饰表示要调用c代码，效率高
 * @author randall
 *
 */
public class Sheep implements Cloneable,Serializable{
	private String sname;
	private Date birthday;
	public Sheep() {
	}
	public Sheep(String sname, Date birthday) {
		this.sname = sname;
		this.birthday = birthday;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = super.clone();//直接调用object对象的clone（）方法实现克隆
		return obj;
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
