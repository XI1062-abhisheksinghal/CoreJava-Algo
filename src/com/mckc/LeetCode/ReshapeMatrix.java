package com.mckc.LeetCode;

public class ReshapeMatrix {

    public static void main(String[] args) {
        int [][] mat = {{1,2},{3,4}};
        int r=1;
        int c=4;
        System.out.println(matrixReshape(mat,r,c));
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        //reshape matrix

        int totalElements = r*c;
        int row = mat.length;
        int col = mat[0].length;
        int[][] newmatrix = new int[r][c];

        int totalValues = row*col;
        int[] newArr= new int[totalValues];

        if(totalValues!=totalElements){
            return mat;

        }
        int count=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){

                newArr[count]= mat[i][j];
                count++;
            }
        }
        int ele=-1;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ele++;
                newmatrix[i][j]= newArr[ele];
            }
        }

        return newmatrix;
    }
}
