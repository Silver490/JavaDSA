package Lec16;

public class String_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// only literal/hard code string , string pool me banega
		String s= "hello";
		System.out.println(s); // it will print 'hello' but not address
		
		// s and s1 will be having same address since duplicate is not allowed in pool
		// string is a non-primitive data type therefore s and s1 space allocation will be on heap.  
		String s1= "hello"; 
		
		
		// s2 will be allocated on heap(not pool) and duplicate is allowed
		String s2= new String("Hello");
		System.out.println(s1);
		System.out.println(s2);
		
		
		// s3 will be formed in heap since there is concatenation(add) in s3;
		String s3= s+s1;
		System.out.println(s3);
		
		
		// s4 will be formed in string pool because two literals are getting concatenating(added).
		String s4= "hello"+"bye";
		System.out.println(s4);
		
		String s5= "hello"+"bye";
		
		
		// s4==s5 , compare address, if same true, else false
		System.out.println(s4==s5);
		
		
	}

}
