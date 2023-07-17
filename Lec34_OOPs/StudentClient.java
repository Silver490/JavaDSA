package Lec34_OOPs;
//import Lec34_OOPs.Student;
//Student class is in the same package so no need to import it
public class StudentClient {
	public static void main(String[] args) {
		System.out.println("Hello Arjun!");
		Student s = new Student();
		Student s1 = new Student();
		// new Student(); is called object
		// s is called reference variable of student type
		s.name = "kaju";
		s.age = 21;
		s1.name = "katli";
		s1.age = 22;
		s.intro_yourSelf();
		s1.intro_yourSelf();
		s.sayhi("Priya");
		int x=Student.countofstudent;
		Student.fun();
	}
}












