package com.mck.Java8Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StudentMain {
	
	public static void main(String args[]) {
		
		Student student1 = new Student (1,"Abhishek",34);
		Student student2 = new Student (2,"Renu",45);
		Student student3 = new Student (3,"Richa",4);
		Student student4 = new Student (4,"Megha",3);
		Student student5 = new Student (5,"Alice",23);
		Student student6 = new Student (6,"Joy",29);
		Student student7 = new Student (7,"Rajan",30);
		Student student8 = new Student(8,"Rakesh",38);
		Student student9 = new Student(9,"Mohan",39);
		
		
		
		
		
		//Create map of students whose age is greater than 30 
		
		List<Student> ls = new ArrayList<Student>();
		ls.add(student1);
		ls.add(student2);
		ls.add(student3);
		ls.add(student4);
		ls.add(student5);
		ls.add(student6);
		ls.add(student7);
		ls.add(student8);
		ls.add(student9);
		
		
		
		Map<Integer,Student> map = ls.stream().filter(stu->stu.getAge()>30)
				.collect(Collectors.toMap(Student::getId, Function.identity()));
		
		System.out.println(map);
		
		
		
	}

}
