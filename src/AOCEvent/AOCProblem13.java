package AOCEvent;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

import static AOCEvent.Utils.readStringList;

public class AOCProblem13 {

    private static int diff = Integer.MAX_VALUE;
    private static int departTime = 0;
    private static int busId=0;

    public static void main(String args[]) throws IOException {

        List<String> lists = new ArrayList<>();
        lists = readStringList(new File("./src/AOCEvent/input13.txt"));
        Integer number = Integer.valueOf(lists.get(0));

        String allValues = lists.get(1);
        String[] vals=allValues.split(",");
        List<Integer> listToworkOn = Arrays.asList(vals).stream().filter(i->!i.equals("x")).map(Integer::parseInt)
                .collect(Collectors.toList());

        Map<Integer,Integer> finalNumbs = new HashMap<Integer,Integer>();

        listToworkOn.stream().forEach(i->{
            Integer num = number/i;
            if(num*i<number){
                finalNumbs.put(((num*i)+i),i);

            }else{
                finalNumbs.put(num*i,i);
            }
        });


        finalNumbs.entrySet().forEach(i ->{
            int differnce = i.getKey()-number;
            if(differnce< diff){
                diff = differnce;
                departTime= i.getKey();
                busId = i.getValue();
            }
        });

        int depart = departTime-number;

        int result = depart* busId;

        System.out.println(result);






    }
}
