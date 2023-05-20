package com.mck.Java8Practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.partitioningBy;

public class PracticeJava8 {

    public static void main(String[] args) {

        List<Student> ls = new ArrayList<Student>();
        ls.add(new Student(1,"Abhishek",23));
        ls.add(new Student(2,"Singhal",24));
        ls.add(new Student(3,"Rana",25));
        ls.add(new Student(4,"Rakuten",30));

        Map<Integer, List<Student>> mapOfStudentshavingAgeMoreThan30 = new HashMap<Integer, List<Student>>();

        Map<Boolean, List<Student>> mapOfStudentspartitioned = new HashMap<Boolean, List<Student>>();
        mapOfStudentshavingAgeMoreThan30=  ls.stream().filter(i->i.getAge()>25).collect(groupingBy(Student::getAge));

        mapOfStudentspartitioned=ls.stream().collect(partitioningBy(i->i.getAge()>30));
        System.out.println(mapOfStudentshavingAgeMoreThan30.size());

        System.out.println(mapOfStudentspartitioned.size());

        System.out.println(1/10);
        int nums[] = {2,3,22,44,1,4};
        Arrays.sort(nums);

        List<String> namesOfEmployeeandStudent = new ArrayList<>();

        List<String> names = Arrays.asList("Abhi","Singhal","Keshav");
        Map<String,Object> mapOfFre= names.stream().collect(Collectors.toMap(Function.identity(),name->Collectors.counting()));

        Map<String, Long> mapss= names.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        mapOfFre.entrySet().forEach(entry-> System.out.println(entry.getKey()+""+entry.getValue().toString()));

        String s = "Abhishek Singhal 123";
        System.out.println(s.startsWith("Abhishek Singhal"));



    }

    private static List<String> getAllStuNames(){
        return Arrays.asList("Abhi","Rahul");
    }

    private static List<String> getAllEmployeeNames(){
        return Arrays.asList("Shankar","Diwedi");
    }


}
