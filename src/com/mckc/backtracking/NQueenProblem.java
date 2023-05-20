package com.mckc.backtracking;

public class NQueenProblem {

    public static void main(String[] args) {

        //Queen is marked as 1 .
        int[][] board = new int[8][8];
        int row = board.length;
        int col = board[0].length;
        if(nQueen(board,0)){

            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    System.out.println(board[row][col]);
                }
            }
        }



    }

    public static boolean nQueen(int[][] board,int row){
        if(row==board.length){
            return true;
        }

        for(int col =0;col<board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col]=1;
                if(nQueen(board,row+1))
                    return true;
                board[row][col]=0;
            }
        }
        return false;
    }

    public static boolean isSafe(int[][] board,int placedAtx, int placedAty){

        if(diagIsClear(board,placedAtx,placedAty) && colIsClear(board,placedAtx,placedAty)){
            return true;
        }
        return false;
    }

    public static boolean diagIsClear(int[][] board,int rowNum,int colNum){
        if(rowNum==0){
            return true;
        }

        for(int i=0;i<rowNum;i++){

            if(board[rowNum][rowNum]==1){
                return false;
            }
        }

        return true;
    }

    public static boolean colIsClear(int[][] board, int rowNum,int colNum){

        if(rowNum==0){
            return true;
        }
        for(int i=0;i<rowNum;i++){
            if(board[rowNum][colNum]==1){
                return false;
            }
        }
        return true;
    }
}
