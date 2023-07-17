package Lec34_OOPs;

public class Person_Client {
	public static void main(String[] args) {
		Person p1 = new Person("Raj", 21);
		Person p2 = new Person("Ravi", 18);
		p1.Intro_youSelf();
		p2.Intro_youSelf();

		p2.setName("Ankit");
		;
		p2.Intro_youSelf();

		p1.setAge(-90);
		p1.Intro_youSelf();
	}
}
