//package com.mckc.LeetCode;
//
//import java.util.Stack;
//
//public class LeetCode283 {
//
//    public static void main(String[] args) {
//
//        int[] arr = {0,0, 1};
//       // moveZeroes(arr);
//        String s = "Abh"+" "+"ishek";
//        System.out.println(s);
//
//        String s1 = "abbaca";
//       // removeDuplicates(s1);
//
//        String s2 = "deeedbbcccbdaa";
//        int k=3;
//        removeDuplicatess(s2,k);
//
//    }
//
//    public static void moveZeroes(int[] nums) {
//        //Move all zeroes to end of array
//        for (int i = 0; i < nums.length; i++) {
//
//            if (nums[i] == 0) {
//                int k = i;
//                int j = i+1;
//                while (j < nums.length ) {
//                    if(nums[j]!=0) {
//                        int temp = nums[j];
//                        nums[j] = nums[k];
//                        nums[k] = temp;
//                        break;
//                    }
//                    j++;
//                    k++;
//                }
//            }
//
//        }
//    }
//
//
//    public static String removeDuplicates(String S) {
//        //remove duplicate adjacent string chars
//        int i =0;
//        int j = i+1;
//        StringBuilder sb = new StringBuilder(S);
//        while(j<sb.length()){
//            if(sb.charAt(i)==sb.charAt(j)){
//                sb.delete(i,i+2);
//                i=0;
//                j=i+1;
//                continue;
//            }
//            i++;
//            j++;
//
//        }
//        return sb.toString();
//
//    }
//
//    public static String removeDuplicatess(String s, int k) {
//
//        //k is the number of characters to be removed if same
//        //use logic if a ==b , b ==c than a==c
//        Stack<Character> stack = new Stack<>();
//        char[] chars = s.toCharArray();
//
//        for(int i=0;i<chars.length;i++){
//            stack.push(chars[i]);
//        }
//        int pos=0;
//        Character c = stack.peek();
//        Character c1 = stack.elementAt(pos+1);
//        if(c==c1){
//
//        }
//
//    }
//
//
//}
