package main;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortOnMultipleFields {

    public static void main(String[] args) {


        List<Student> ls = Arrays.asList(new Student("Abhishek",99),
                                    new Student ("Meghanshi",100),
                                    new Student("Abhishek",100),
                                    new Student ("Meghanshi",78));

        //ls.stream().forEach(str-> System.out.println(str.name +""+ str.marks));

        List<String> employess = Arrays.asList("Abhishek","Abhishek","Gautam");
        System.out.println(duplicateName(employess));

        Set<String> sets = new HashSet<>();

        Map<String, List<String>> map = new HashMap<>();

        map=employess.stream().collect(Collectors.groupingBy(Function.identity()));

        Optional<String> name5 =map.entrySet().stream().
                filter(entry->entry.getValue().size()>1)
                .map(Map.Entry::getKey)
                .findFirst();
        System.out.println(name5.get());

//        employess.stream().forEach(name->{
//            if(!sets.add(name)){
//                System.out.println(name);
//            }
//        });



        //sort on the basis of name
        //ls.stream().sorted(Comparator.comparing(Student::getName)).forEach(str-> System.out.println(str.name+ ""+ str.marks));

        //ls.stream().sorted(Comparator.comparing(Student::getMarks)).forEach(str-> System.out.println(str.name+""+str.marks));

        //sorting on two fields

        ls.stream().sorted(Comparator.comparing(Student::getName)
                .thenComparing(Comparator.comparing(Student::getMarks)))
                //.sorted(Comparator.comparing(Student::getMarks))
                .forEach(str-> System.out.println(str.name+""+str.getMarks()));
    }

    public static String duplicateName(List<String> names){
        String name2 =null;
            for(String n:names){
                if(countName(names,n)>1){
                    name2= n;
                    break;
                }
            }
            return name2;

    }

    public static long countName ( List<String> names, String name){
        return names.stream().filter(name1->name1.equals(name)).count();

    }
}
