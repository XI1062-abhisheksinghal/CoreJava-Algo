package com.mckc.LeetCode;

public class Search2DMatrix {

    public static void main(String[] args) {
        int [][] matrix = {{1}};
        int target =1;

        System.out.println(searchMatrix(matrix,target));

    }



    public static boolean searchMatrix(int[][] matrix, int target) {
        //check for range of values start and end
        //apply Bindary search on row values

        int rows = matrix.length;
        int cols = matrix[0].length;

        int r = rowNum(matrix,target);

        //Binary Search
        int[] arr = new int[cols];
        for(int j=0;j<cols;j++){
            arr[j]=matrix[r][j];
        }

        if(target==arr[r]){
            return true;
        }
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid = start+end/2;
            if(target==arr[mid]){
                return true;
            }
            else if(target<arr[mid]){
                end = mid-1;
            }else{
                start= mid+1;
            }
        }
        return false;
    }

    public static int rowNum(int[][] mat, int target){

        int res =-1;
        int col = mat[0].length;
        for(int i=0;i<mat.length;i++){
            if(target>mat[i][i] && target<mat[i][col-1]){
                res = i;
                break;
            }
            else if(target==mat[i][i]){
                res=i;
            }
        }

        return res;

    }
}
