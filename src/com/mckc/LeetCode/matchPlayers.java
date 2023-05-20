package com.mckc.LeetCode;

import java.util.Arrays;

public class matchPlayers {

    public static void main(String[] args) {
        int[] players = {4,7,9}, trainers = {8,2,5,8};
        System.out.println(matchPlayersAndTrainers(players,trainers));
    }




public static int matchPlayersAndTrainers(int[] players, int[] trainers) {

        Arrays.sort(trainers);
        int result=0;
        for(int i=0;i<players.length;i++){

        for(int j=0;j<trainers.length;j++){

        if(trainers[j]>=players[i]){
        trainers[j]=0;
        result++;
        break;
        }
        }
        }

        return result;

        }
}
