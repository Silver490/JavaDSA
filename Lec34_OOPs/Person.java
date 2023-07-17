package Lec34_OOPs;
public class Person {
	
	private String name="Anish";
	private int age=22;
	
	public void Intro_youSelf() {
		System.out.println("My name is "+this.name+" and age is "+this.age);
	}
	
	public Person() { // Non-parameterize Constructor
		this.name="Amisha";
		this.age=31;
	}
	public Person(String name, int age) { // parameterize Constructor
		this.name=name;
		this.age=age;
	}
	
//	public Person() { // Default Constructor
//		
//	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age<0) {
			
			return;
		}
		this.age = age;
	}
}
