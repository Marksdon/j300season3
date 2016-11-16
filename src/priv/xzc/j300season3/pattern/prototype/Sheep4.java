package priv.xzc.j300season3.pattern.prototype;

import java.io.Serializable;
import java.util.Date;
@SuppressWarnings("all")
public class Sheep4 implements Cloneable, Serializable{

	private String name;
	private Date birthday;

	public Sheep4() {
	}
	public Sheep4(String name, Date birthday) {
		super();
		this.name = name;
		this.birthday = birthday;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = super.clone();
		Sheep4 s = (Sheep4) obj;
		s.birthday = (Date) this.birthday.clone();
		return s;
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
