package AOCEvent;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class AOCProblem6 {

    static int MAX_CHAR = 26;

    public static void main(String[] args) {
       // part1solution();
        part2solution();
        String s = "abcs@asda";
        print1(s);

    }

    public static void print1(String s){

        String[] st = s.split("@");
        System.out.println(st.length);
    }

    public static void part1solution() {
        List<String> input;
        List<Integer> size = new ArrayList<>();
        Set<String> set1 = new HashSet<>() ;

        {
            try {
                input = listOfIntegers();

                String str="";

                for(int i=0;i<input.size();){
                    if(!input.get(i).isEmpty()){

                        str= str+input.get(i);
                        i++;
                        while(i<input.size() && !input.get(i).isEmpty()){
                            str= str+input.get(i);
                            i++;
                        }

                    }
                    else if(i<=input.size() && input.get(i).isEmpty()){
                        i++;
                        str="";
                    }
                    if(!str.isEmpty()) {
                         set1 = part1(str);
                        size.add(set1.size());

                    }


                }

                System.out.println(size.stream().mapToInt(i->i).sum());



            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static Set<String> part1(String s){

        Set<String> set = new HashSet<>();
        for(int k=0;k<s.length();k++){
            char[] chars = s.toCharArray();
            for(int l=0;l<chars.length;l++){
                set.add(String.valueOf(chars[l]));
            }
        }
        return set;

    }


    public static void part2solution() {
        List<Integer> size1 = new ArrayList<>();

        try {
            List<String> inputpart2 = listOfIntegers();
            String str="";
            int count =0;
            List<String> lists = new ArrayList<>();
            boolean val= false;
            for(int k=0;k<inputpart2.size();){
                if(!inputpart2.get(k).isEmpty()){

                    str= str+inputpart2.get(k);
                    k++;
                    while(k<inputpart2.size() && !inputpart2.get(k).isEmpty()){
                        val = true;
                        str= str+"@"+inputpart2.get(k);
                        k++;
                    }

                }
                else if(k<=inputpart2.size() && inputpart2.get(k).isEmpty()){
                    k++;
                    str="";
                }

                if(!str.isEmpty()) {
                    if(val) {
                         count = countofCommonCharacters(str);
                    }else{
                         count = str.length();
                    }
                    size1.add(count);

                }
                val = false;
            }

            System.out.println(size1.stream().mapToInt(i->i).sum());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int countofCommonCharacters(String str){


        String[] st = str.split("@");
        return commonCharacters(st,st.length);

    }


    public static int commonCharacters(String str[],
                                        int n)
    {
        int count =0;
        // primary array for common characters
        // we assume all characters are seen before.
        Boolean[] prim = new Boolean[MAX_CHAR];
        Arrays.fill(prim, new Boolean(true));

        // for each string
        for (int i = 0; i < n; i++) {

            // secondary array for common characters
            // Initially marked false
            Boolean[] sec = new Boolean[MAX_CHAR];
            Arrays.fill(sec, new Boolean(false));

            // for every character of ith string
            for (int j = 0; j < str[i].length(); j++)
            {

                // if character is present in all
                // strings before, mark it.
                if (prim[str[i].charAt(j) - 'a'])
                    sec[str[i].charAt(j) - 'a'] = true;
            }

            // copy whole secondary array into primary
            System.arraycopy(sec, 0, prim, 0, MAX_CHAR);
        }

         //displaying common characters
        for (int i = 0; i < 26; i++)
            if (prim[i]){
                count++;
            }
        return count;
    }
    public static List<String> listOfIntegers() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("./src/AOCEvent/input6.txt"));
        String line = null;
        List<String> list = new ArrayList<String>();
        while ((line = br.readLine()) != null) {
            //Integer userInputAsInteger = Integer.parseInt(line);
            list.add(line);

        }
        return list;
    }
}