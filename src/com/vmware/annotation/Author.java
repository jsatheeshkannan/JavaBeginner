package com.vmware.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Author {
	String name();
	String date();
	int currentRevision() default 1;
	String lastModifiedBy() default "N/A";
	String[] reviewers();

}
@Author(date = "12/10/2017", 
name = "Wings",
reviewers = { "satheesh","kannan" }
)
class one {
	public static void main(String[] args) {
		System.out.println("fad");
	}
	public void g1(){
		
		while(true){
		}
		}
	
}
