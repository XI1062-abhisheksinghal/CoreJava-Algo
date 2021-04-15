package com.mckc.LeetCode;

public class LeetCode289 {


    public static int[] validx = {0,1,1,1,0,-1,-1,-1};
    public static int[] validy = {1,1,0,-1,-1,-1,0,1};

    public static void main(String[] args) {


       int[][] board = {
               {0,1,0},
               {0,0,1},
               {1,1,1},
               {0,0,0}};

       gameOfLife(board);
    }
    public static void gameOfLife(int[][] board) {

        //parse the board and check if the cell is live or not
        //conditions to check for ech cell
        //int N = board.length;
        //int M = board[0].length;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){

                gameBegins(i,j,board);
            }
        }
    }

    public static void gameBegins(int indexi, int indexj, int[][] board){

        int val = board[indexi][indexj];
        int count1 =0;

        for(int k=0;k<8;k++){
            int x = indexi+validx[k];
            int y = indexj+validy[k];
            if(isValid(x,y,board)){
                int check = board[x][y];
                if(check==1){
                    count1++;
                }
            }
        }

        changeVal(val, count1, board, indexi, indexj);
    }

    public static void changeVal(int v, int c,int board[][], int a, int b){

        if(v==1){
            if(c>3){
                board[a][b]=0;
            }
            if((c==2) || (c==3)){
                board[a][b]=1;
            }
            if(c<2){
                board[a][b]=0;
            }
        }

        else if(v==0){
            if(c==3){
                board[a][b]=1;
            }
        }


    }

    public static boolean isValid(int x, int y, int[][] board){

        if(x>=0 && x<board.length && y>=0 && y<board[0].length){
            return true;
        }
        return false;
    }
}
