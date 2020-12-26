package AOCEvent;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static AOCEvent.Utils.readStringList;

public class AOCProblem22 {

    public static void main(String[] args) {

        try {
            List<String> list = readStringList(new File("./src/AOCEvent/input22.txt"));
            List<String> player1 = new ArrayList<>();
            List<String> player2 = new ArrayList<>();
            int result =0;
            int rounds =0;

            int indexOf = list.indexOf("");
            player1 = list.subList(1,indexOf);
            player2= list.subList(indexOf+2,list.size());

            List<Integer> player1int = new ArrayList<>();
            List<Integer> player2int = new ArrayList<>();

            player1int = player1.stream().map(Integer::parseInt).collect(Collectors.toList());
            player2int = player2.stream().map(Integer::parseInt).collect(Collectors.toList());

            while(player1int.size()!=0 && player2int.size()!=0){
                Integer no1 = player1int.get(0);
                Integer no2=player2int.get(0);
                if(no1>no2){
                    player2int.remove(no2);
                    player1int.remove(no1);
                    player1int.add(player1int.size(),no1);
                    player1int.add(player1int.size(),no2);
                }
                else if(no1<no2){

                    player2int.remove(no2);
                    player1int.remove(no1);
                    player2int.add(player2int.size(),no2);
                    player2int.add(player2int.size(),no1);
                }
            }

            if(player1int.size()!=0){
                int sum =0;
                 for(int i=0;i<player1int.size();i++){
                     sum = sum + (player1int.get(i)*(player1int.size()-i));
                 }
                 result = sum;
            }

            if(player2int.size()!=0){
                int sum =0;
                for(int i=0;i<player2int.size();i++){
                    sum = sum + (player2int.get(i)*(player2int.size()-i));
                }
                result = sum;
            }
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
