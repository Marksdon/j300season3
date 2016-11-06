package priv.xzc.j300season3.annotation;
/**
 * 测试注解
 * @author randall
 *
 */
@MyAnnotation01(age=19,studentName="老高"
,id=101,schools={"北京大学","清华大学"})
public class Dome02 {

	@MyAnnotation02("北京大学")//使用一个的话，加value行，不加也行
	public void test(){

	}


}
