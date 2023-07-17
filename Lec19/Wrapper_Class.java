package Lec19;

public class Wrapper_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer a = 10;
		int a1 = 10;
		
		System.out.println(a==a1);// Compares the Content inside them,when one is premitive and other is non-primitive
		System.out.println(a); // print the Content inside 'a'
		
		a =a1; // AutoBoxing - putting the content of primitive into non-primitive
		
		Integer c= 90;
		int c1=10;
		c1=c;// unBoxing - putting the content of non-primitive  into primitive  
		
		Integer d= 90;
		Integer d1= 90;
		Integer e= 167;
		Integer e1= 167;
		System.out.println(d==d1); // Since both 'd' and 'd1' are non-primitive, their address will be compared
		// Will be true since both d and d1 are inside integer cache range(i.e  -127 to 128)
		
		System.out.println(e==e1);
		// Will be false since both 'e' and 'e1' are outside integer cache range(i.e  -127 to 128)
		
		
		
		
		
		
	}
	

}
