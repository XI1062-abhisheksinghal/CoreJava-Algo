package com.mckc.LeetCode;

public class LeetCode844 {

    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab#c","ab#c"));
    }

    public static boolean backspaceCompare(String S, String T) {

        String one = "";
        String two= "";

        char[] charsS = S.toCharArray();
        char[] charsT = T.toCharArray();

        for(int i=0;i<charsS.length;i++){

            if(charsS[i]=='#'){

                continue;
            }else{
                int j=i;
                int k= j+1;
                if(k<charsS.length) {
                    if (charsS[k] != '#') {
                        Character c = charsS[i];
                        one = one + String.valueOf(c);

                    }

                }else{

                    Character c2 = charsS[i];
                    one = one + String.valueOf(c2);
                }

            }

        }

        for(int i=0;i<charsT.length;i++){

            if(charsT[i]=='#'){
                continue;
            }else {
                int j = i;
                int k = j + 1;
                if (k < charsT.length) {
                    if (charsT[k] != '#') {
                        Character c = charsS[i];
                        two = two + String.valueOf(c);

                    }
                }else{

                    Character c2 = charsT[i];
                    two = two + String.valueOf(c2);
                }
            }

        }

        return one.equals(two) ? true:false;
    }
}
