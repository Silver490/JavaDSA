package Lec36_Inheritence;
public class Student {
	String name="Kunj";
	int age=9;
	
	@Override
	public String toString() {
		return this.name+ " "+this.age;
	}
}
