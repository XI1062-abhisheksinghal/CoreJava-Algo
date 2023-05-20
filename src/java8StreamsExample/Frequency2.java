package java8StreamsExample;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Frequency2 {

    public static void main(String[] args) {

        List<String> names = new ArrayList();
        names.add("Abhishek");
        names.add("Abhishek");
        names.add("Megha");
        List<String> namesRepeat= names.stream().filter(name-> Collections.frequency(names,name)>=2).collect(Collectors.toList());
        namesRepeat.forEach(print-> System.out.println(print));
    }
}
