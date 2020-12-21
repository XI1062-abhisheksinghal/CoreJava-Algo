package AOCEvent;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AOCProblem1 {
    public static void main(String[] args) {
          //find couple of numbers whose sum is 2020
            findSum2020();

          //find three numbers whose sum is 2020
           findSumofThreeNumbers2020();


    }

    public static void findSumofThreeNumbers2020(){
       try {
           List<Integer> inputs= listOfIntegers();
           for(int i=0;i<inputs.size();i++){
               int num1 = inputs.get(i);
               for(int j=i+1;j<inputs.size();j++){
                   int num2 = inputs.get(j);
                   int num3 = 2020-(num1+num2);
                   int k = j+1;
                   if(inputs.subList(k,inputs.size()).contains(num3)){
                       System.out.println(num1+ " "+num2+ " "+num3);
                       System.out.println();
                       break;
                   }
               }
           }


       }catch (Exception e) {
           e.printStackTrace();
       }

    }

    public static void findSum2020(){
        try {
            int j=0;
            List<Integer> inputs= listOfIntegers();

            for(Integer i : inputs){

                Integer find = 2020-i;

                if(inputs.subList(j,inputs.size()-1).contains(find)){
                    System.out.println(i*find);
                    break;
                }

                j++;

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Integer> listOfIntegers() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("./src/AOCEvent/input.txt"));
        String line = null;
        List<Integer> list = new ArrayList<Integer>();
        while ((line = br.readLine()) != null) {
            Integer userInputAsInteger = Integer.parseInt(line);
            list.add(userInputAsInteger);

        }
        return  list;
    }

}
