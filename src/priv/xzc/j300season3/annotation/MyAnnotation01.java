package priv.xzc.j300season3.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *  自定义注解
 *  通常要加上元注解
 *  <p>如果注解只有一个参数，一般定义为value
 * @author randall
 *
 */
@Target(value={ElementType.METHOD,ElementType.TYPE})//声明这个注解的作用范围
@Retention(RetentionPolicy.RUNTIME)//运行时保留该注解，被运行被反射机制读取
public @interface MyAnnotation01 {
	String studentName() default "";
	int age() default 0;
	int id() default -1;
	
	String[] schools() default {"清华大学","北京大学"};
}
