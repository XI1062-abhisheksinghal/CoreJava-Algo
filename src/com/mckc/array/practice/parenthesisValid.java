package com.mckc.array.practice;

import java.util.Stack;

public class parenthesisValid {

    public static void main(String[] args) {

        String s = "([{}])";
        System.out.println(validParenthesis(s));

    }

    public static boolean validParenthesis(String s){

        Stack<Character> stack = new Stack<Character>();

        char[] chars = s.toCharArray();
        for(char c:chars){
            stack.push(c);
        }

        for(char c1:chars){
            char check=stack.pop();
            if(check==']'){
                if(c1!='['){
                    return false;
                }
            }
            else if(check=='}'){
                if(c1!='{'){
                    return false;
                }
            }
            else if(check==')'){
                if(c1!='('){
                    return false;
                }
            }
        }

        return true;

    }
}
