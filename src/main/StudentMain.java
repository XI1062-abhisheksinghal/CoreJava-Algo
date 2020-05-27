package main;

import java.util.List;


public class StudentMain {
	
	
	public static void main(String args[]) {
		
		Student s = new Student();
		List<Student> ls = s.createStudents();
		System.out.println(s.getMaxNumberstudentName(ls));
		
	}
	
	

}
