package com.mckc.LeetCode;

public class shuffle {

    public static void main(String[] args) {

        int[] arr= {2,5,1,3,4,7};
        int n =3;
        System.out.println(shuffle(arr,n));
    }


        public static int[] shuffle(int[] nums, int n) {

            //shuffle the array
            int[] res= new int[nums.length];
            int first=0;
            int second = n;
            for(int i=0;i<nums.length;i++) {
                if (i % 2 == 0) {
                    res[i] = nums[first];
                    first++;

                } else {
                    res[i] = nums[second];
                    second++;
                }
            }
            return res;


        }
    }
