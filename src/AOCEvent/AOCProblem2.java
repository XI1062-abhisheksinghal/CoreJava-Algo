package AOCEvent;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AOCProblem2 {

    public static void main(String[] args) throws IOException {

       //part1();
        part2();


    }

    public static void part2() throws IOException {
        int value =0;
        List<String> lines = listOfStrings();
        for(String s :lines) {
            String[] limits = s.split(" ");
            String[] s1 = limits[1].split(":");


            if(validPassword(limits[0],s1[0],limits[2])){
                value++;
            }



        }
        System.out.println(value);
    }

    public static void part1(){
        try {
            int val =0;
            List<String> lines = listOfStrings();
            for(String s :lines) {
                String[] limits = s.split(" ");
                String[] s1 = limits[1].split(":");


                if(checkPattern(limits[0],s1[0],limits[2])){
                    val++;
                }



            }
            System.out.println(val);


        }catch (Exception e){
            System.out.println(e.getStackTrace());
        }
    }

    public static boolean validPassword(String limits, String character, String s){

        boolean result= false;
        String[] values = limits.split("-");

        int min =Integer.parseInt(values[0]);
        int max = Integer.parseInt(values[1]);

        char c1 = s.charAt(min-1);
        char c2 = s.charAt(max-1);

        if(c1==character.charAt(0) && c2!=character.charAt(0)){
            result = true;
        }

        if(c1!=character.charAt(0) && c2==character.charAt(0)){
            result= true;
        }

        return result;

    }

    public static boolean checkPattern(String limits, String character, String s){

        String[] values = limits.split("-");

        int min =Integer.parseInt(values[0]);
        int max = Integer.parseInt(values[1]);


        Map<Character,Integer> map = calfreq(s);
        boolean result = false;

        if(map.containsKey(character.charAt(0))){
            int val = map.get(character.charAt(0));
            if(val<=max && val >=min){
                result= true;
            }
        }else{
            result= false;
        }

        return result;



    }

    public static Map<Character,Integer> calfreq(String s){
        char[] chars = s.toCharArray();
        Map<Character,Integer> m = new HashMap<Character,Integer>();
        for(char c : chars){
            if(m.containsKey(c)){
                m.put(c,m.get(c)+1);
            }else{
                m.put(c,1);
            }
        }

        return m;
    }


    public static List<String> listOfStrings() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("./src/AOCEvent/input2.txt"));
        String line = null;
        List<String> list = new ArrayList<String>();
        while ((line = br.readLine()) != null) {
            list.add(line);

        }
        return  list;
    }
}
