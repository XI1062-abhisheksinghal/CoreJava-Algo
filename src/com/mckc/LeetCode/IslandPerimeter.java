package com.mckc.LeetCode;

public class IslandPerimeter {

    public static void main(String[] args) {

        int[][] grid = {{1,1}};

        System.out.println(islandPerimeter(grid));


    }

    public static int islandPerimeter(int[][] grid) {

        //check on left and top blocks if they are 1 than reduce -2
        int perimeter=0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){

                if(grid[i][j]==1){
                    perimeter= perimeter+4;
                    if(i>0){
                        if(grid[i-1][j]==1){
                            perimeter= perimeter-2;
                        }
                    }
                        if(j>0) {
                            if (grid[i][j - 1] == 1) {
                                perimeter = perimeter - 2;
                            }
                        }
                    }
                }
            }


        return perimeter;

    }
}
