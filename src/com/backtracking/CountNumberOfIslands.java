//package com.backtracking;
//
//
//import com.sun.tools.javac.util.Pair;
//
//import java.util.ArrayDeque;
//import java.util.Queue;
//
//public class CountNumberOfIslands {
//
//
//    // Below arrays detail all eight possible movements from a cell
//    // (top, right, bottom, left, and four diagonal moves)
//    private static final int[] row = { -1, -1, -1, 0, 1, 0, 1, 1 };
//    private static final int[] col = { -1, 1, 0, -1, -1, 1, 0, 1 };
//
//    // Function to check if it is safe to go to position `(x, y)`
//    // from the current position. The function returns false if `(x, y)`
//    // is not valid matrix coordinates or `(x, y)` represents water or
//    // position `(x, y)` is already processed
//
//    public static boolean isSafe(int[][] mat, int x, int y,
//                                 boolean[][] processed)
//    {
//        return (x >= 0) && (x < processed.length) &&
//                (y >= 0) && (y < processed[0].length) &&
//                (mat[x][y] == 1 && !processed[x][y]);
//    }
//
//    public static void main(String[] args) {
//
//        int[][] mat=
//                {
//                        { 1, 0, 1, 0, 0, 0, 1, 1, 1, 1 },
//                        { 0, 0, 1, 0, 1, 0, 1, 0, 0, 0 },
//                        { 1, 1, 1, 1, 0, 0, 1, 0, 0, 0 },
//                        { 1, 0, 0, 1, 0, 1, 0, 0, 0, 0 },
//                        { 1, 1, 1, 1, 0, 0, 0, 1, 1, 1 },
//                        { 0, 1, 0, 1, 0, 0, 1, 1, 1, 1 },
//                        { 0, 0, 0, 0, 0, 1, 1, 1, 0, 0 },
//                        { 0, 0, 0, 1, 0, 0, 1, 1, 1, 0 },
//                        { 1, 0, 1, 0, 1, 0, 0, 1, 0, 0 },
//                        { 1, 1, 1, 1, 0, 0, 0, 1, 1, 1 }
//                };
//
//        int M = mat.length;
//        int N = mat[0].length;
//
//        boolean[][] processed = new boolean[M][N];
//        int island =0;
//        for(int i=0;i<M;i++){
//            for(int j=0;j<N;j++){
//
//                //start BFS for each unprocessed node
//                //and increment island count
//                if(mat[i][j]==1 && !processed[i][j]){
//                    BFS(mat,processed,i,j);
//                    island++;
//                }
//            }
//        }
//        System.out.println("Total number of islands"+island);
//    }
//
//    private static void BFS(int[][] mat, boolean[][] processed, int i, int j) {
//
//        // create an empty queue and enqueue source node
//        Queue<Pair> q = new ArrayDeque<>();
//        q.add(new Pair(i, j));
//
//        // mark source node as processed
//        processed[i][j] = true;
//
//        // loop till queue is empty
//        while (!q.isEmpty())
//        {
//            // dequeue front node and process it
//            //int x = q.peek().x;
//            //int y = q.peek().y;
//            q.poll();
//
//            // check for all eight possible movements from the current cell
//            // and enqueue each valid movement
//            for (int k = 0; k < 8; k++)
//            {
//                // skip if the location is invalid, or already processed, or has water
//                if (isSafe(mat, x + row[k], y + col[k], processed))
//                {
//                    // skip if the location is invalid, or it is already
//                    // processed, or consists of water
//                    processed[x + row[k]][y + col[k]] = true;
//                    q.add(new Pair(x + row[k], y + col[k]));
//                }
//            }
//        }
//    }
//
//
//}
