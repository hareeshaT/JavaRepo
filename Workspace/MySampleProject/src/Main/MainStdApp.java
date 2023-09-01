package Main;

import com.oops.Student;

public class MainStdApp {
	

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setStudentNo(123);
		System.out.println("Student's Id Number is: "+student1.getStudentNo());
		student1.setStudentName("Hareesha");
		System.out.println("Student's first Name is: "+student1.getStudentName());
		student1.setLastName("Turimerla");
		System.out.println("Student's Last Name is: "+student1.getLastName());
		System.out.println("Student's Full Name is: "+student1.fullName());
		student1.setGender('F');
		System.out.println("Student's gender is: "+student1.getGender());
		student1.setScore(98.08f);
		System.out.println("Student's score is: "+student1.getScore());
		
		Student student2 = new Student();
		student2.setStudentNo(456);
		System.out.println("Student's Id Number is: "+student2.getStudentNo());
		student2.setStudentName("Kavya");
		System.out.println("Student's first Name is: "+student2.getStudentName());
		student2.setLastName("Kolluru");
		System.out.println("Student's Last Name is: "+student2.getLastName());
		System.out.println("Student's Full Name is: "+student2.fullName());
		student2.setGender('F');
		System.out.println("Student's gender is: "+student2.getGender());
		student2.setScore(89.08f);
		System.out.println("Student's score is: "+student2.getScore());
	}

}
