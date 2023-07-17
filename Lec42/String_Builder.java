package Lec42;

public class String_Builder {
	public static void main(String [] args) {
		StringBuilder sb= new StringBuilder();
		System.out.println(sb.capacity()); // Capacity of StringBuilder is 16 by default;
		System.out.println(sb.length());
		sb.append('c'); // to add
		sb.append("Hello");
		System.out.println(sb);
		String str=sb.toString();
		System.out.println(str);
		System.out.println(sb.reverse());
		System.out.println(sb);
		
		
		String s="HelloBye";
		StringBuilder sb1= new StringBuilder(s);
		System.out.println(sb1);
		System.out.println(sb1.capacity()); // 24=16 + 8(length of string s)
		sb1.append("Ram");
		System.out.println(sb1.capacity());
		System.out.println(sb1.indexOf("Ram"));
		System.out.println(sb1);
		System.out.println(sb1.delete(1, 3));
		System.out.println(sb1.charAt(5));
	}
}
