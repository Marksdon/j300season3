package priv.xzc.j300season3.test;

/**
 * 测试final权限
 * @author randall
 *
 */
public class FinalTest {

	public static void main(String[] args) {
		 Stu stu =  new Stu(1, "mark");//意思是说变量stu指向的内存地址不能改变 
		 Stu stu1 = new Stu(1, "mark");
		stu.setId(3);//数据还是可以被改动

		System.out.println(stu);
		System.out.println(stu1);
	}


}


class Stu {

	private int id;
	private String sname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Stu(int id, String sname) {
		super();
		this.id = id;
		this.sname = sname;
	}



}
