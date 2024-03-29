package com.mck.Java8Practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UsingStreamDebugger {


    public static void main(String[] args) {

        Stream.of("Abhishek","Megha","Deva","Roony")
                .filter(str-> str.length()>4)
                .map(str->str.substring(2))
                .map(str->str.toUpperCase())
                .distinct()
                .sorted()
                .forEach(str-> System.out.println(str));

        Map<String, Integer> map = new HashMap<String,Integer>();

        map.put("Abhishek",10000);
        map.put("Megha",20000);
        map.put("Neha",30000);

        String s = "tothenew";
        Map<Character, Long> map1= s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        map1.entrySet().forEach(m-> System.out.println(m.getKey()+" "+m.getValue()));

       List<String> names= map.entrySet().stream().filter(m->m.getValue()>10000)
                .map(name-> name.getKey())
               .collect(Collectors.toList());

       //Sort Employees on the basis of Salary
        //map.entrySet().stream().forEach(emp-> System.out.println(emp.getKey() +""+ emp.getValue() ));
        final Map<String, Integer> mapSortedBySal=
                map.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue())
                        .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));

        final Map<String, Integer> sortedByKey = map.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByKey().reversed())

               .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));



        sortedByKey.entrySet().stream().forEach(emp->System.out.println(emp.getKey()+ ""+ emp.getValue()));

      // names.forEach(str-> System.out.println(str));

        List<Integer> list = Arrays.asList(1,2,4,5,6,77);
        Integer sum = (list.stream().reduce((a, b) -> a + b).get());
        Integer max=list.stream().max(Comparator.comparing(Integer::intValue)).get();
        System.out.println(max);
        //list.remove(max);
        int res =list.stream().reduce(0,(a,b)->a+b).intValue();
        System.out.println(res);


        //Finding min between the list of Integer arrays

        Integer res1 =Arrays.asList(1,2,3,4,5).stream().min(Comparator.comparing(Integer::valueOf)).get();
        Integer res2 = Arrays.asList(1,2,3,4,99).stream().max(Comparator.comparing(Integer::valueOf)).get();

        List<String> ls =Arrays.asList("Abhishek","Meghna")
                .stream().sorted(Comparator.comparing(String::length))
                .collect(Collectors.toList());
        List<Employee> emps = Arrays.asList(new Employee(1,"Abhishek",21,"Male","IT",2001,10000),
                                            new Employee(2,"Singhal",24,"Female","Admin",2003,20000));

        List<Employee> empsSal=emps.stream().sorted(Comparator.comparing(Employee::getSalary))
                .collect(Collectors.toList());
        ls.stream().forEach(str-> System.out.println(str));
        System.out.println(res1);

        //Counting the number of Strings in List
        Map<String, Long> map5 =Arrays.asList("Abhishek","Abhishek","Meghanshi")
                .stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        map1.entrySet().stream().forEach(m-> System.out.println(m.getKey()+""+m.getValue()));

        String s8 = "tothenew";
        //find frequency of eacg character
        Map<Character, Long> mapOfChars = s.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        mapOfChars.entrySet().forEach(m-> System.out.println(m.getKey()+""+m.getValue()));

        Integer i =10;
        double sqrtNum = Math.floor(Math.sqrt(i));
        double x = i-sqrtNum;
        System.out.println(x);
        System.out.println(Math.floor(sqrtNum));
        List<Integer> km = new ArrayList<>();
        //Integer h = Integer.valueOf((int) x);
        km.add(Integer.valueOf((int) x));
    }
}
