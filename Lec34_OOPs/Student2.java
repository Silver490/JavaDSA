package Lec34_OOPs;

public class Student2 {
	private String name="Anish";
	private int age=22;
	
	public Student2(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public void intro_yourSelf() {
		System.out.println("My name is "+this.name+" and age is "+this.age);
	}

	public int getAge() {
		
		return age;
	}

//	public void setAge(int age) throws Exception {
//		if (age<0) {
//			throw new Exception("Age can not be Negative");
//		}
//		this.age = age;
//	}
	
	public void setAge(int age) {
		try {
			System.out.println("In Try");
			if (age<0) {
				throw new Exception("Age can not be Negative");
			}
			this.age = age;
			
		} catch (Exception e) {
			System.out.println("In Catch");
			e.printStackTrace();
		}
		
		finally { // try catch ke sath hi aayega
			System.out.println("I am in finally blocks");
		}
	}
	
	
}
