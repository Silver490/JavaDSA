package Lec34_OOPs;
import java.util.*;
public class Student {
	String name;
	int age;
	static int countofstudent;
	
	public void intro_yourSelf() {
		System.out.println("My name is "+this.name+" and age is "+this.age);
	}
	
	public void sayhi(String name) {
		System.out.println(name +" say hi "+this.name);
	}
	
	public static void fun() {
		
	}
	
	static { // it is called static block and no need to call it and always run first
		System.out.println("this is static block and runs first!");
	}
}
