package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingOnMultipleFields {

    static class Employee{

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        String name;
        int studentId;

        public String getStand() {
            return stand;
        }

        public void setStand(String stand) {
            this.stand = stand;
        }

        String stand;

        Employee(String name, int studentId,String stand){

        this.name=name;
        this.studentId= studentId;
        this.stand=stand;

    }

        public static void main(String[] args) {
            Employee e= new Employee("Abhishek",1,"A");
            Employee e1= new Employee("Aabhishek",2,"Z");
            Employee e2 = new Employee("Jafran",3,"A");
            List<Employee> list= new ArrayList<Employee>();

            list.add(e);
            list.add(e1);
            list.add(e2);

            //Output Abhishek , Jafran, Aabhishek
            List<Employee> sortByName = list.stream()
                    .sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());

            List<Employee> sortByTypeAndName= sortByName.stream()
                    .sorted(Comparator.comparing(Employee::getStand)).collect(Collectors.toList());

            List<Integer> ls = Arrays.asList(1,2,34,45,22,12,13,56,78);

            List<Integer> ls1 =ls.stream().sorted(Comparator.reverseOrder())
                    .filter(i->i>10).collect(Collectors.toList());



            for(Employee emp:sortByTypeAndName){
                System.out.println(emp.getName());
            }


        }


    }
}
