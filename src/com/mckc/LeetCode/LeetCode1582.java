package com.mckc.LeetCode;

public class LeetCode1582 {

    public static void main(String[] args) {
        int[][] nums = {
                {1,0,0},
                {0,0,1},
                {1,0,0}};
        System.out.println(numSpecial(nums));

    }




    public static int numSpecial(int[][] mat) {

        //Special positions in Binary Matrix
        int rows = mat.length;
        int cols = mat[0].length;

        int count=0;

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){

                if(mat[i][j]==1){
                    if(checkSpecial(i,j,mat)){
                        count++;
                    }

                }
            }
        }

        return count;


    }

    public static boolean checkSpecial(int i, int j, int[][] mat){


        int rowlen = mat.length;
        int collen = mat[0].length;
        for(int k=i;k<rowlen; k++ )
        {
            for(int l=j;k<collen; l++){
                if(mat[k+1][l+1] !=0){
                    return false;
                }
            }
        }

        return true;


    }

}
