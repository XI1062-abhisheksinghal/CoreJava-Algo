package AOCEvent;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static AOCEvent.Utils.readIntList;

public class AOCProblem10 {

    public static void main(String args[]) throws FileNotFoundException {

        List<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers = readIntList((new File("./src/AOCEvent/input10.txt")));

        Collections.sort(listOfNumbers);
        solPart1(listOfNumbers);
        solPart2(listOfNumbers);

    }

    public static void solPart1(List<Integer> listOfNumbers) {

        int differnce1 = 1;
        int difference3 = 1;

        for (int i = 0; i < listOfNumbers.size() - 1; ) {

            int num1 = listOfNumbers.get(i);
            int num2 = listOfNumbers.get(i + 1);

            if (num2 - num1 == 1) {
                differnce1++;
                i++;
            } else if (num2 - num1 == 3) {
                difference3++;
                i++;
            } else if (num2 - num1 == 2) {
                i++;
            }
        }

        System.out.println(differnce1 * difference3);

    }

    public static void solPart2(List<Integer> list){


        int previousDiff =0;
        int currDiff =0;
        int nums = 0;
        Integer result = 1;

        for(int i=0;i<list.size()-1;i++){
            int num1 = list.get(i);
            int num2 = list.get(i+1);
            currDiff = num2-num1;
            if(previousDiff!=currDiff) {
                previousDiff = currDiff;
            }
            else if(previousDiff==currDiff){
                nums++;
                previousDiff=currDiff;
            }

        }

        for(int i=1;i<=nums;i++){
            result = result*2;
        }
        System.out.println("Solution part2======" +result);

    }

}
