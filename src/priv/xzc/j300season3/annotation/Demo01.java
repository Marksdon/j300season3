package priv.xzc.j300season3.annotation;

import java.util.ArrayList;
import java.util.List;

/**
 * 初步认识注解(Annotation)
 * 
 * @author randall
 *
 */
public class Demo01 {

	public static void main(String[] args) {
		
		
	}
	
	
	@Override
	public String toString() {
		return "";
	}
	
	
	@Deprecated
	public void test(){
		
	}
	
	
	@SuppressWarnings({ "all", "rawtypes" })
	public void test2(){
		@SuppressWarnings("unused")
		List list = new ArrayList<>();
	}
	
	
	
	
}
