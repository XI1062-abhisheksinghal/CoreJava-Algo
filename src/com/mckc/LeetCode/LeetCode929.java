package com.mckc.LeetCode;

public class LeetCode929 {

    public static void main(String[] args) {

        String s = "aa.bb.cc";
        String[] str = s.split("\\.");
        String res ="";
        for(String combined :str){
             res = res+combined;
        }

        System.out.println(res);

        String s1 = "abc.abcde+love";
        String[] splitted = s1.split("\\+");

        System.out.println(splitted[0]);

        char ch = 3;
        int a = ch;
        System.out.println(a);

        System.out.println(decodeAtIndex("a2b3c4d5e6f7g8h9",
                10));

        int[] input = {
                5,5,5,5,20,20,5,5,20,5};
        System.out.println(lemonadeChange(input));

    }

    public static String decodeAtIndex(String S, int K) {
        String s ="";
        int len = S.length();
        for(int i=0;i<len;i++){

            if(s.length()>=K && s.length()!=0){
                return String.valueOf(s.charAt(K-1));
            }
            char ch = S.charAt(i);
            if(ch>= 97){
                s= s+ String.valueOf(ch);
            }else{
                int a = ch-'0';
                for(int j=1;j<a;j++){
                    s=s+s;
                }
            }

        }

        return String.valueOf(s.charAt(K-1));

    }

    public static boolean lemonadeChange(int[] bills) {

        int count5=0;
        int count10=0;
        int count20=0;
        boolean res= false;
        for(int i=0;i<bills.length;i++){
            res = false;
            if(bills[i]==5){
                count5++;
                res= true;
            }
            else if(bills[i]==10){
                if(count5>0){
                    count5--;
                    res= true;
                }
                count10++;
            }
            else if(bills[i]==20){
                if(count10>0){
                    count10--;
                    if(count5>0){
                        count5--;
                        res = true;
                    }else{
                        count10++;
                    }

                }else{
                    if(count5>=3){
                        count5= count5-3;
                        res = true;
                    }
                }
            }

            if(res==false && i==bills.length-1){
                break;
            }

        }

        return res;
    }
}
