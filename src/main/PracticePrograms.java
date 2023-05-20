package main;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PracticePrograms {

    public static void main(String[] args) {

        String s="abcdabcd";

        //find frequency for passed character
        //using java 8
        System.out.println(countChar(s,'a'));
        //bytes also print length
        System.out.println(s.getBytes().length);

        int[] nums = {1,2,3,4,5,6};
        List<Integer> list=Arrays.stream(nums).boxed().collect(Collectors.toList());
        //Counting frequency of each number

                String s1="abhishek";
        Map<Character, Long> characterFrequency = s1.chars()  // creates an IntStream
                .mapToObj(c -> (char) c) // converts the IntStream to Stream<Character>
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        Stream<String> st = Stream.iterate("",(str)-> str+"x");
        System.out.println(st.limit(3).map(str -> str + "y"));

        char[] chars = s.toCharArray();
        for(char ch:chars){


        }
    }

    public static int countChar( String s, char c){
        int count =0;
        char[]  charArr =s.toCharArray();
        for(char c1 : charArr){
            if(c1==c){
                count++;
            }
        }
        return count;
    }

}
