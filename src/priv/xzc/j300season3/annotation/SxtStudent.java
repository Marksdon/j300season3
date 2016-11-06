package priv.xzc.j300season3.annotation;

/**
 * 一个注解的开发过程是分三步：
 * <p>1.定义注解
 * <p>2.应用注解
 * <p>3.解析注解
 * @author randall
 *
 */  
@SxtTable("tb_student")//跟表tb_student对应
public class SxtStudent {
	@SxtField(columnName="id",type="int",length=10)
	private String id;
	@SxtField(columnName="sname",type="varchar",length=10)
	private String studentName;
	@SxtField(columnName="sname",type="int",length=3)
	private int age;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

}
