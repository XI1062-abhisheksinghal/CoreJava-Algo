package AOCEvent;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AOCProblem5 {

    public static void main(String[] args) {

        try {

            int max=0;
            int resultSeatid=0;
            List<String> input = listOfIntegers();
            List<Integer> seatNos = new ArrayList<Integer>();
            for(int i=0;i<input.size();i++){
                 String str = input.get(i);
                 int seatNo = tickets(str);
                 seatNos.add(seatNo);
                 if(seatNo>max){
                     max=seatNo;
                 }
            }

            int resultPart2 = solPart2(seatNos);
            System.out.println(resultPart2);
            System.out.println(max);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static int solPart2(List<Integer> lists){
        int result=0;
        lists.sort(Comparator.comparing(Integer::valueOf));
        int num1=0;
        int num2=0;
        for(int k=0;k<lists.size()-1;k++){
            num1=lists.get(k);
            num2=lists.get(k+1);
            if(num2-num1==2){
                   result= num2-1;
            }
        }
        return result;
    }

    public static int tickets(String str){
        int min=0;
        int max =127;
        int mincol =0;
        int maxcol=7;
        int mincurr =0;
        int maxcurr=127;
        int mincolcurr=0;
        int maxcolcurr=7;
        int resultrow=0;
        int resultcol=0;
        int seatNo=0;
        for(int j=0;j<str.length();j++){
            if(str.charAt(j)=='F'){
                int diff2 = (maxcurr-mincurr)+1;
                maxcurr = mincurr+((diff2)/2)-1;
                resultrow= maxcurr;
            }

            if(str.charAt(j)=='B'){
                int diff = maxcurr-mincurr+1;

                    diff= (diff)/2;
                    mincurr=mincurr+diff;
                    resultrow=mincurr;
            }

            if(str.charAt(j)=='L'){
                int diff3 = (maxcolcurr-mincolcurr)+1;
                maxcolcurr = mincolcurr+((diff3)/2)-1;
                resultcol= maxcolcurr;


            }

            if(str.charAt(j)=='R'){
                int diff1 = (maxcolcurr-mincolcurr)+1;
                mincolcurr= mincolcurr+(diff1)/2;
                resultcol=mincolcurr;

            }


        }
        seatNo = resultrow*8+resultcol;
        return seatNo;

    }



    public static List<String> listOfIntegers() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("./src/AOCEvent/input5.txt"));
        String line = null;
        List<String> list = new ArrayList<String>();
        while ((line = br.readLine()) != null) {
            //Integer userInputAsInteger = Integer.parseInt(line);
            list.add(line);

        }
        return  list;
    }
}
