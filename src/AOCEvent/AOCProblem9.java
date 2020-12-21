package AOCEvent;

import java.io.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static AOCEvent.Utils.readIntList;

public class AOCProblem9 {
    public static List<Long> inputNumbers = new LinkedList<>();
    public static void main(String[] args){

        try {
            inputNumbers = listOfIntegers();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Long sol = solvePart1();
        Long out =solvepart2(inputNumbers,sol);
        System.out.println(out);

    }

    public static Long solvepart2(List<Long> inputNumbers, Long sum){

        Long curr_sum = inputNumbers.get(0);
        int start = 0, i;
        Long res=0L;
        // Pick a starting point
        for (i = 1; i <= inputNumbers.size(); i++) {
            // If curr_sum exceeds the sum,
            // then remove the starting elements
            while (curr_sum > sum && start < i - 1) {
                curr_sum = curr_sum - inputNumbers.get(start);
                start++;
            }

            // If curr_sum becomes equal to sum,
            // then return true
            if (curr_sum == sum) {
                int p = i - 1;
                System.out.println(
                        "Sum found between indexes " + start
                                + " and " + p);
                List<Long> partition = inputNumbers.subList(start,p+1);
                List<Long> partitionSum = new LinkedList<>();
                partitionSum.addAll(partition);
                Collections.sort(partitionSum);

                res= partitionSum.get(0)+partitionSum.get(partitionSum.size()-1);
            }

            // Add this element to curr_sum
            if (i < inputNumbers.size())
                curr_sum = curr_sum + inputNumbers.get(i);
        }

          return res;

    }

    public static Long solvePart1(){

        try {

            for(int j=25;j<inputNumbers.size();j++){

                Long num = inputNumbers.get(j);
                if(!validNumber(j-25,j-1,num)){
                    return inputNumbers.get(j);
                }
            }

            } catch (Exception e) {
            e.printStackTrace();
        }
        return 0L;

    }

    public static boolean validNumber (int startIndex, int endIndex, Long n){


        List<Long> in = inputNumbers.subList(startIndex,endIndex+1);
        List<Long> ins = new LinkedList<>();
        ins.addAll(in);
        Collections.sort(ins);
        int lowptr =0;
        int highptr=24;
        while(highptr>lowptr) {
            if (n ==ins.get(lowptr) +ins.get(highptr)) {
                return true;

            } else if (n<ins.get(lowptr) +ins.get(highptr)){
                highptr--;
            }
            else{
                lowptr++;
            }
        }
        return false;
    }


    public static List<Long> listOfIntegers() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("./src/AOCEvent/input9.txt"));
        String line = null;
        List<Long> list = new LinkedList<Long>();
        while ((line = br.readLine()) != null) {
            line = line.trim();
            Long userInputAsInteger = Long.parseLong(line);
            list.add(userInputAsInteger);

        }
        return  list;
    }
}
