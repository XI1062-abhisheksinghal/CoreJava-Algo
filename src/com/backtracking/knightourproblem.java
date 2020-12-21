package com.backtracking;


//this problem is to print the positions of array where knight moves and tracks all the positions in 8*8 array
public class knightourproblem {
  static int N =8;

    //Knight can move 8 positions , lets start from position 0,0
    //valid moves from current position posX[]
    //valid moves from current position posY[]

    public static boolean isSafe ( int pos_x, int pos_y, int sol[][]){
         if(pos_x<N && pos_x>=0 && pos_y<N && pos_y>=0 && sol[pos_x][pos_y]==-1){
            return true;
        }

         return false;
    }


    public static boolean solveKTUtil(int[][] sol, int[] x, int[] y,int movei,int posx, int posy){

        int k, next_x, next_y;
        if (movei == N * N)
            return true;

        /* Try all next moves from the current coordinate
            x, y */
        for (k = 0; k < 8; k++) {
            next_x = posx + x[k];
            next_y = posy + y[k];
            if (isSafe(next_x, next_y, sol)) {
                sol[next_x][next_y] = movei;
                if (solveKTUtil(sol, x, y,next_x, next_y, movei + 1
                       ))
                    return true;
                else
                    sol[next_x][next_y]
                            = -1; // backtracking
            }
        }

        return false;



    }



        public static boolean solveKT(){

            int sol[][] = new int[8][8];
            int validX[] = {2, 1, -1, -2, -2, -1, 1, 2};
            int validY[] ={1, 2, 2, 1, -1, -2, -2, -1};
         //initialise the 8*8 Array with -1
            for(int i=0;i<8;i++){
                for(int j=0;j<8;j++){
                    sol[i][j]=-1;
                }
            }

            if (!solveKTUtil(sol, validX, validY,1,0,0)) {
                System.out.println("Solution does not exist");
                return false;
            }
            else
                printSol(sol);

            return true;




        }

        public static void printSol(int[][] sol){

           for(int i=0;i<N;i++){
               for(int j=0;j<N;j++){
                   System.out.println(sol[i][j]);
               }
           }
        }

    public static void main(String[] args) {

        solveKT();

    }
}
