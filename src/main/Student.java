package main;

import java.util.ArrayList;
import java.util.List;



public class Student {
	
	@Override
	public String toString() {
		return name;
	}


	String name;
	int marks;
	
	
	public Student() {
	}
	
	
	public Student(String name, int marks) {
		this.name= name;
		this.marks=marks;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	public List<Student> createStudents(){
		List<Student> ls = new ArrayList();
		ls.add(new Student("Abhishek",99));
		ls.add(new Student("Shekhar",88));
		ls.add(new Student("Gupta",45));
		ls.add(new Student("Ashish",100));
		
		return ls;
	}
	
	
	public String getMaxNumberstudentName(List<Student> ls) {
		
		int maxnumber =0;
		
		ls.forEach(i->{
			if(i.getMarks()>maxnumber) {
				name = i.getName();
			}
		});
		return name;
		
	}
	
	
	

}
