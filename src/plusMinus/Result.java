package java.plusMinus;
import java.util.*;
class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        double value=0.0;
        double positive=0.0;
        double negative=0.0;
        double zero=0.0;
        for(double i : arr){
            if(i>0){
                positive += 1;
            }
            if(i<0){
                negative += 1;

            }if(i==0){
                zero +=1;
            }

            //   value = (Math.pow(value,-5));


        }
        value = (positive /arr.size() ) ;
        System.out.println(
                String.format("%.6f", value));
        value = (negative / arr.size());
        System.out.println(
                String.format("%.6f", value));
        value = (zero/arr.size());
        System.out.println(
                String.format("%.6f", value));
    }

}

