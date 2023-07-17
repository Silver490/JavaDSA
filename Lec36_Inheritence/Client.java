package Lec36_Inheritence;

public class Client {
	public static void main(String[] args) {
//		// case 1
//		P obj = new P();
//		C obj1 = new C();
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		obj.fun();
//		obj.fun1();

		// Case 2
//		P obj = new C();
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		System.out.println(((C) (obj)).d);
//		System.out.println(((C) (obj)).d2);
//		obj.fun1();
//		((C)(obj)).fun2();
//		obj.fun();
//		// For method overriding two different classes should be there
//		// Must be inheritance
		
		// Case 3
//		C obj = new P();
//		
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		System.out.println(obj.d2);
		
		// Case 4
		C obj= new C();
		System.out.println(obj.d); 
		System.out.println(obj.d1);
		System.out.println(obj.d2);
		System.out.println(((P)(obj)).d);
		obj.fun();
		obj.fun1();
		obj.fun2();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
