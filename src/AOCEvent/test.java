package AOCEvent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test {

    public static void main(String[] args) {
        char s = 'f';
        System.out.println(Integer.valueOf(s));
        List<String> find = new ArrayList<>();
        find.add("abhishek");
        find.add("Megha");

        List<String> ls = new ArrayList<String>();
        ls.add("abhishek");
        ls.add("Shantanu");
        ls.add("mohit");

        String s1 = "10";
        Integer i = new Integer("2");

        System.out.println(Integer.valueOf(s1)+i);

        String s2 = "abhishek";

        Map<String, Integer> m = new HashMap<String, Integer>();
        m.put(s2,0);

      m.entrySet().stream().forEach(k-> System.out.println(k.getKey()));

      s2 = "raghu";
      m.put(s2,1);

      m.entrySet().stream().forEach(l-> System.out.println(l.getKey()));





    }
}
