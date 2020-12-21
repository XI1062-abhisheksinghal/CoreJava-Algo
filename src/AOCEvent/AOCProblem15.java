package AOCEvent;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static AOCEvent.Utils.readStringsBySeparator;

public class AOCProblem15 {

    public static void main(String args[]) throws IOException {

        List<String> input = readStringsBySeparator(new File("./src/AOCEvent/input15.txt"),",");

        List<Integer> inputIntegers =  input.stream().map(String::trim)
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> spokenWords = new ArrayList<>();

        //Check the last occurence of element and store the difference of Turn .
        for(Integer i=0;i<30000000;i++){

            if(inputIntegers.size()>i) {
                spokenWords.add(inputIntegers.get(i));
            }
            if(inputIntegers.size()==i){
                spokenWords.add(0);
            }
           if(i>inputIntegers.size()) {
               int no = spokenWords.get(i - 1);
               List<Integer> sub = spokenWords.subList(0,
                       i-1);
               if (sub.size() >= 1) {
                   int lastPos = sub.lastIndexOf(no);

                   if (lastPos < 0) {
                       spokenWords.add(0);
                   } else if (lastPos >= 0) {
                       spokenWords.add(i-1 - lastPos);
                   }
               }

           }

        }

        System.out.println(spokenWords.get(29999999));





    }
}
