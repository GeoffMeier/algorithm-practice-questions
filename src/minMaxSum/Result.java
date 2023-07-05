package minMaxSum;
import java.util.*;
class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long firstSum = 0;
        long lastSum = 0;
        long min = (long) Integer.MAX_VALUE;
        long max = (long) Integer.MIN_VALUE;
        for(int i : arr){
            firstSum += i;
            lastSum += i;
            if(i > max){
                max = i;
            }
            if(i < min){
                min = i;
            }

            // lastSum += arr.get(i);
            // if(i != 0){
            //    firstSum += arr.get(i);
            // }
            // if(i == arr.size() -1){
            //     lastSum = lastSum - arr.get(i);
            // }
        }
        lastSum -= max;
        firstSum -= min;
        System.out.println(lastSum + " " + firstSum);


    }





}
