package com.mckc.LeetCode;

public class JumpGame {

    public static void main(String[] args) {

        int target =2;
        int res = moves(target);
        System.out.println(res);

    }

    public static int moves(int target){
        int moves =1;
        int count =1;
        if(target==1){
            return moves;
        }
        //int actualPosition=1;
        while(count!=target) {
            while (count < target) {
                moves++;
                count = count + moves;

                //actualPosition += actualPosition + count;
                if (count == target) {
                    break;
                }
            }
            if (count > target) {
                moves++;
                count = count -moves;
                //actualPosition = actualPosition - count;
            }
        }

        return moves;
    }
}
