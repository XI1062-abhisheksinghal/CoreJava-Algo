package AOCEvent;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AOCProblem4 {
    public static int validPassport = 0;

    public static void main(String[] args) throws IOException {
        List<String> input = read();
        int validPassport = 0;
        //iterate input list till its empty , create a map than call logic function
        //for(int i=0;i<input.size();i++){
        sol4(input);


    }

    public static void sol4(List<String> input) {

        int i = 0;
        Map<String, String> map = new HashMap<String, String>();
        List<Map<String, String>> lists = new ArrayList<>();
        for (i = 0; i < input.size(); ) {

            while (i < input.size() && (!input.get(i).isEmpty())) {

                String strings = input.get(i);
                String[] spaceSeparated = strings.split(" ");
                for (String colonSeparated : spaceSeparated) {
                    String[] keyValues = colonSeparated.split(":");
                    map.put(keyValues[0],
                            keyValues[1]);
                }
                i++;
            }
            lists.add(map);
            if (i < input.size() && (input.get(i).isEmpty())) {
                map = new HashMap<>();
                i++;
            }

        }
        //System.out.println(validPassport);;
       // checkVaild(lists);
        checkValidPart2(lists);

    }

    public static void checkVaild(List<Map<String, String>> mapValues) {
        int res = 0;
        for (int j = 0; j < mapValues.size(); j++) {

            int noOfKeys = mapValues.get(j).entrySet().size();
            boolean result = false;
            if (noOfKeys == 8) {
                res++;
            }

            if (noOfKeys == 7) {
                if (mapValues.get(j).containsKey("cid")) {
                    result = false;
                } else {
                    res++;
                }
            }
        }
        System.out.println(res);
    }

    public static void checkValidPart2(List<Map<String, String>> mapValuePart2) {

        int res = 0;
        for (int k = 0; k < mapValuePart2.size(); k++) {

            Map<String, String> m = mapValuePart2.get(k);

            if(m.containsKey("byr") && m.containsKey("eyr") && m.containsKey("iyr") && m.containsKey("ecl") && m.containsKey("hcl") && m.containsKey("pid") && m.containsKey("hgt")) {
                if (checkByr(m) && checkeyr(m) && checkiyr(m) && checkecl(m) && checkhcl(m) && checkhgt(m) && checkpid(m)) {
                    res++;
                }
            }
        }

        System.out.println(res);
    }

    public static boolean checkByr(Map<String, String> m) {
        boolean result= false;
        if ((m.get("byr").length() == 4 && Integer.parseInt(m.get("byr")) >= 1920 && Integer.parseInt(m.get("byr")) <= 2002))
        {result= true;}
        return result;
    }

        public static boolean checkiyr(Map<String, String> m){
         boolean result = false;
            if (m.get("iyr").length() == 4 && Integer.parseInt(m.get("iyr")) >= 2010 && Integer.parseInt(m.get("iyr")) <= 2020) {
                {return true;}
            }
            return result;
        }

    public static boolean checkeyr(Map<String, String> m){
        boolean result = false;
        if (m.get("eyr").length() == 4 && Integer.parseInt(m.get("eyr")) >= 2020 && Integer.parseInt(m.get("iyr")) <= 2030) {
            {return true;}
        }
        return result;
    }

    //format of hgt
//    If cm, the number must be at least 150 and at most 193.
//    If in, the number must be at least 59 and at most 76.
    public static boolean checkhgt(Map<String,String> m){
        boolean result = false;
        String hgt = m.get("hgt");
        if(hgt.length()==4){
           String s1= hgt.substring(0,2);
           if(Integer.valueOf(s1)>=59 && Integer.valueOf(s1)<=76 && hgt.substring(2,hgt.length()).equals("in")){
               result= true;
           }
        }

        if(hgt.length()==5){
            String s2 = hgt.substring(0,3);
            if(Integer.valueOf(s2)>=150 && Integer.valueOf(s2)<=193 && hgt.substring(3,hgt.length()).equals("cm")){
                result = true;
            }
        }

        return result;
    }

    public static boolean checkhcl(Map<String,String> m){
        boolean result = false;
        String hcl = m.get("hcl");
        String s1 = hcl.substring(0,1);
        String s2 =hcl.substring(1);
        if(s1.equals("#") && hcl.substring(1).length()==6  ){
            char[] c = s2.toCharArray();
            for(char c1:c){
                int val = (int)c1;
                if(val>102){
                    result= false;
                }else{
                    result= true;
                }
            }
        }

        return result;

    }

    public static boolean checkecl(Map<String,String> m){
        boolean result = false;
        String ecl = m.get("ecl");

        List<String> list = Stream.of("amb", "blu","brn","gry","grn","hzl","oth")
                .collect(Collectors.toList());
         if(list.contains(ecl)){
             result = true;
         }
        return result;
    }

    public static boolean checkpid(Map<String,String> m){
        boolean result = false;
        String s1 = m.get("pid");
        if(s1!=null && s1.length()==9){
            result = true;
        }
        return result;
    }

    public static List<String> read() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("./src/AOCEvent/input4.txt"));
        String line = null;
        List<String> list = new ArrayList<String>();

        while ((line = br.readLine()) != null) {
            list.add(line);

        }
        return list;

    }
}
