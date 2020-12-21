package AOCEvent;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AOCProblem3 {

    private final static char TREE = '#';
    public static void main(String[] args) throws IOException {
        List<String> ls = createList();
       long day3input1 = getEncounters(ls,3,1);
        System.out.println(day3input1);
        System.out.println(task2(ls));
    }

   public static List<String> createList() throws IOException {
       BufferedReader br = new BufferedReader(new FileReader("./src/AOCEvent/input3.txt"));
       String line = null;
       List<String> list = new ArrayList<String>();
       while ((line = br.readLine()) != null) {
           list.add(line);
       }
       return list;
   }

   public static long getEncounters(List<String> inputs, int horizontalMovement, int verticalMovement){
           final int partWidth = inputs.get(0).length();
           final int height = inputs.size();

           long encounteredTrees = 0;
           int currentX = 0;
           int currentY = 0;

           //Run as long as the Bottom is not reached
           while (currentY < height) {
               //Calculates the next Positions - Takes the maximum Width of the Input into account
               int nextX = currentX + horizontalMovement < partWidth ? currentX + horizontalMovement : currentX + horizontalMovement - partWidth;
               int nextY = currentY + verticalMovement;
               //Safety check to ensure that nextY will not produce an IndexOutOfBounds Exception
               if (nextY < height) {
                   char location = inputs.get(nextY).charAt(nextX);
                   if (location == TREE) {
                       encounteredTrees++;
                   }
               }
               currentX = nextX;
               currentY = nextY;
           }
           return encounteredTrees;
   }
    public static long task2(List<String> inputs) {
        long firstSlopeEncounters = getEncounters(inputs, 1, 1);
        long secondSlopeEncounters = getEncounters(inputs, 3, 1);
        long thirdSlopeEncounters = getEncounters(inputs, 5, 1);
        long fourthSlopeEncounters = getEncounters(inputs, 7, 1);
        long fifthSlopeEncounters = getEncounters(inputs, 1, 2);

        return firstSlopeEncounters * secondSlopeEncounters * thirdSlopeEncounters * fourthSlopeEncounters * fifthSlopeEncounters;
    }
}
