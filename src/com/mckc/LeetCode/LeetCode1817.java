package com.mckc.LeetCode;

import com.mck.Java8Practice.Employee;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LeetCode1817 {

    public static void main(String[] args) {

        int[][] logs={
                {0,5},{1,2},{0,2},{0,5},{1,3}
                };
        int k=5;
        int[] result = new int[k];

        Map<Integer,Set<Integer>> uamMap = new HashMap();

        for(int i=0;i<logs.length;i++){

            int index = logs[i][0];
            int time = logs[i][1];

            if(uamMap.containsKey(index)){
                Set<Integer> s = uamMap.get(index);
                s.add(time);
                uamMap.put(index,s);
            }else{
                Set<Integer> set = new HashSet<>();
                set.add(time);
                uamMap.put(index,set);
            }
        }

        for(int j=1;j<=k;j++){
            int res=countOfUsersWithkUAM(uamMap,j);
            result[j-1]=res;
        }

        for(int l:result){
            System.out.println(l);
        }

        List<String> ls = new ArrayList<>();
        ls.add("abhi");
        ls.add("singh");
        Object arr[]= ls.toArray();
        System.out.println(arr[1]);

        Map<String, Integer> mapOfEmployeess= new HashMap<String,Integer>();
        mapOfEmployeess.put("Abhishek",100);
        mapOfEmployeess.put("Singh",200);
        mapOfEmployeess.put("Kan",400);
        mapOfEmployeess.put("suja",50);

        //fecth the employee names whose sal is less than 50
        List<String> empsSalLessThan50 = mapOfEmployeess.entrySet().stream().filter(map->map.getValue()<=50)
                .map(map->map.getKey()).collect(Collectors.toList());

        List<Employee> employess= new ArrayList<>();
        //int id, String name, int age, String gender, String department, int yearOfJoining, double salary
        Employee e1 = new Employee(1,"Abhishek",22,"M","Tech",1990,100L);
        Employee e2 = new Employee(2,"Meghu",25,"F","IT",1989,190L);
        Employee e3 = new Employee(3,"Naisha",38,"F","Tech",2000,120L);
        employess.add(e1);
        employess.add(e2);
        employess.add(e3);

        Map<String, Employee> mappedByDept = employess.stream()
                .collect(Collectors.toMap(emp->emp.getDepartment(), Function.identity(),(oldValue, newValue)->newValue));

        System.out.println(mappedByDept.size());

        //grouping of employees by department
        Map<String, List<Employee>> groupedByDept = employess.stream().collect(Collectors.groupingBy(emp->emp.getDepartment()));

        List<Employee> employees= groupedByDept.entrySet().stream()
                .map(m->m.getValue())
                .flatMap(Collection::stream).collect(Collectors.toList());

        System.out.println(empsSalLessThan50.size());
        empsSalLessThan50.stream().forEach(emp-> System.out.println(emp));
    }





    public static int countOfUsersWithkUAM(Map<Integer, Set<Integer>> map, int k){

        int count =0;
        for(Map.Entry<Integer, Set<Integer>> m: map.entrySet()){

            Set<Integer> times = m.getValue();
            if(times.size()==k){
                count++;
            }
        }

        return count;
    }
}
