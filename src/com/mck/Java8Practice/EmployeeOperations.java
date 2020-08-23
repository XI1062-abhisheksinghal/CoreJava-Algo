package com.mck.Java8Practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeOperations {
	
	public static void main(String args[]) {
		
		List<Employee> employeeList = new ArrayList<Employee>();
        
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

		
		
		//How many Male and Female Employees are there in Org.
		
		long maleCount = employeeList.stream().filter((e)->e.gender.equals("Male")).count();
		System.out.println(maleCount);
		
		//print name of all departments in org.
		List<String> namesOfDpt = employeeList.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList());
				for( String dpt:namesOfDpt) {
					System.out.println(dpt);
				}
				
		//Average Age of male and female Employee 
				Optional<Integer> SumOfAge = employeeList.stream().filter((e)->e.gender.equals("Male"))
						.map(Employee::getAge).reduce((a,b)->(a+b));
				
				long avgAgeofMale = (SumOfAge.get())/maleCount;
				
				System.out.println(avgAgeofMale);
				
		//Get details of highest paid employee
				Optional<Double> maxSalary = employeeList.stream().map(Employee::getSalary).max(Comparator.naturalOrder());
				System.out.println(maxSalary);
				Stream<Employee> employesswithSal = employeeList.stream().filter((e)->(e.getSalary()==maxSalary.get()));
				employesswithSal.forEach(e->System.out.println(e.getName()));
				
				//name of employees who have joined after 2015 
				Stream<Employee> employessAfter2015 = employeeList.stream().filter((e)->(e.getYearOfJoining()>2015));
				employessAfter2015.forEach(e->System.out.println(e.getName()));
					
				//Count Number of employees in each department so map<DepartmentName, CountofEmployee>
				Map<String,Long> map = new HashMap();
				
				map=employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
						
				//avg salary of each dept
				employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
				
				//Get the details of youngest male employee in Product development department 
				Optional<Employee> youngestMaleEmployeeInProductDevelopmentWrapper=
						employeeList.stream()
						            .filter(e -> e.getGender()=="Male" && e.getDepartment()=="Product Development")
						            .min(Comparator.comparingInt(Employee::getAge));
				
				
				Map<String, List<Employee>> employeeListByDepartment=
						employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
						    
				
	}

}
