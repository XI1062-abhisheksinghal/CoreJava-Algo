package com.mckc.LeetCode;

public class LeetCode1716 {

    public static void main(String[] args) {

        System.out.println(totalMoney(10));
    }


    static int sum = 0;

    public static int totalMoney(int n) {

        int quo = n / 7;
        int start = 1;
        int rem = n % 7;
        while (quo >= 1) {
            sum = sum + calSum(start, 7);

            start = start + 1;
            quo--;
        }

        if (rem > 0) {
            sum = sum + calSum(start, rem);
        }

        return sum;
    }

    public static int calSum(int start, int nums) {
        int s = 0;
        for (int i = 1; i <= nums; i++) {
            s = s + start;
                start++;
        }

        return s;
    }
}