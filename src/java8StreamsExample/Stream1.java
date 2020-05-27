package java8StreamsExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Stream1 {
	
	public static void main(String args[]) {
		List<Student> students = new ArrayList<Student>();
		
		Student stu = new Student();
		students.add(stu);
		Address add = new Address();
		List<MobileNumber> mob = new ArrayList<MobileNumber>();
		MobileNumber mob1 = new MobileNumber();
		mob1.setAreaCode(91);
		mob1.setNo("8586074071");
		
		mob.add(mob1);
		add.setHouseNo("156");
		add.setCity("Gurgaon");
		add.setPinCode(122003);
		add.setState(State.HARYANA);
		
		stu.setAddress(add);
		stu.setAge(29);
		stu.setName("Abhishek Singhal");
		stu.setMobileNumbers(mob);
		
		//used streams , lambda expression .
		//
		
		Optional<Student> question1 = students.stream().filter((stud)-> stud.getName().equals("Abhishek")).findAny();
		//Finding all the students having mobile number 1234 and 123 
		List<Student> stulist = students.stream().filter((stud)-> stud.getMobileNumbers().contains(1234)).collect(Collectors.toList());
		
	}

}
