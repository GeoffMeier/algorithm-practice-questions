package birthdayCakeCandles;
import java.util.*;
class Result {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int numCandles = 0;
        int max = 0;
        for(int i : candles){
            if(i == max){

                numCandles = numCandles + 1;
            }

            if(i > max){
                max = i;
                numCandles = 1;
            }
            if(i < max){}


        }
        return numCandles;
    }

}
