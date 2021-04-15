package com.mckc.LeetCode;

public class LeetCode12 {

    public static void main(String[] args) {

        int num = 123456;
        //program to reverse the integer
        //output should be 321

        int rem = num%10;
        int n = num/10;
        while(n>0 || rem>0) {
            System.out.print(rem);
            rem = n%10;
            n=n/10;
        }

        int n1 =hammingWeight(01010111111);
        System.out.println("++++++"+n1);

        //bitwise & operator in java

        int a =1;
        int b =2;
        //System.out.println(a&b);

        System.out.println(reverseBits(1));
        //reverseBits1(5);
    }

    public static int hammingWeight(int n) {
        int bits = 0;
        int mask = 1;
        for (int i = 0; i < 32; i++) {
            if ((n & mask) != 0) {
                bits++;
            }
            mask<<=1;
        }
        return bits;

    }

    public static int reverseBits(int n){

        int reverse =0;
        int power =31;

        while(n!=0){
            reverse = reverse +((n&1)<<power);
            n=n>>1;
            power-=1;

        }
        return reverse;
    }

    public static int reverseBits1(int n) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            ans <<= 1;
            ans = ans | (n & 1);
            n >>= 1;
        }
        return ans;

    }
}
