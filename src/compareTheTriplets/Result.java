package java.compareTheTriplets;
import java.util.*;
class Result {

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List <Integer> totals = new ArrayList<Integer>();
        Integer totalForAlice =0;
        Integer totalForBob = 0;

        if(a.get(0)> b.get(0)){
            totalForAlice +=1;
        }
        if(a.get(1)> b.get(1)){
            totalForAlice +=1;
        }
        if(a.get(2)> b.get(2)){
            totalForAlice +=1;
        }
        if(b.get(0)> a.get(0)){
            totalForBob +=1;
        }
        if(b.get(1)> a.get(1)){
            totalForBob +=1;
        }
        if(b.get(2)> a.get(2)){
            totalForBob +=1;
        }
        totals.add(totalForAlice);
        totals.add(totalForBob);
        return totals;

        //  for(int alice : a){

        //      for(int bob : b){
        //          if(alice > bob){
        //              totalForAlice = totalForAlice + 1;
        //          } if(bob> alice){
        //             totalForBob = totalForBob + 1;
        //          } if(alice == bob){

        //          }
        //      }


        //  }
        //  totals.add(totalForAlice);
        //      totals.add(totalForBob);
        //   return totals;
    }

}
