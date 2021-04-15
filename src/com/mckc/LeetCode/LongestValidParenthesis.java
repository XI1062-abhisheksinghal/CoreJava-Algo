package com.mckc.LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Stack;

public class LongestValidParenthesis {

    public static void main(String[] args) {

        String s = "(()";
        System.out.println(longestValidParentheses(s));
    }

    public static int longestValidParentheses(String s) {

        Stack<Character> stack = new Stack<Character>();
        int count =0;
        char[] chars = s.toCharArray();

        for(int i=0;i<chars.length;i++){

            stack.add(chars[i]);
        }

        while(!stack.isEmpty()){

            Character c = stack.pop();

            switch(c){

                case '(':
                    if(!stack.isEmpty()){
                    Character ch = stack.peek();
                        if(ch==')'){
                            stack.pop();
                            count = count+2;
                        }
                    }

                    break;
                case ')':
                    if(!stack.isEmpty()) {
                        Character ch1 = stack.peek();
                        if (ch1 == '(') {
                            stack.pop();
                            count = count + 2;
                        }
                    }
                    break;
            }
        }

        return count;
    }

    public static void checkVowelOrNot(){

        String s = "Abhishek";
        int count =0;
        //Count vowels using java 8

        List<Character> ls = new ArrayList<>();
        ls.add('a');
        ls.add('A');
        ls.add('e');
        ls.add('E');
        ls.add('i');
        ls.add('I');
        ls.add('O');
        ls.add('o');
        ls.add('u');
        ls.add('U');

        List<Character> chs = new ArrayList<Character>();
        char[] chars= s.toCharArray();





    }
}
