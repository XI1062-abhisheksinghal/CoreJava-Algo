package com.backtracking;

public class NQueenProblem {


    static final int N =4;
    public static void main(String args[]){

        //printout the positions N queen that can be placed on N*N chess board


    }

    public boolean solveNQUtil(int[][] board,int col){
        if(col>=N){
            return true;
        }

        return false;
    }

    static boolean isSafe(int board[][], int row, int col)
    {
        int i, j;

        /* Check this row on left side */
        for (i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;

        /* Check upper diagonal on left side */
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        /* Check lower diagonal on left side */
        for (i = row, j = col; j >= 0 && i < N; i++, j--)
            if (board[i][j] == 1)
                return false;

        return true;
    }

    void createChessboard(int size){

        int[][] chessBoard = new int[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                chessBoard[i][j]=0;
            }
        }
    }
}
