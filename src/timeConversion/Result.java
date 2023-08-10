package java.timeConversion;
import java.util.*;
class Result {


    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        String hour = s.substring(0,2);
        String minutes = s.substring(3,5);
        String seconds = s.substring(6,8);
        Integer h = Integer.valueOf(hour);
        String time = "";
        if(s.contains("AM")  ){
            Integer x = h;
            String exactHour = Integer.toString(x);
            if(h == 12){
                exactHour = "00";
            }
            if(h < 10){


                exactHour = "0" + exactHour;
            }

            time = exactHour + ":" + minutes + ":" + seconds;

        }
        if(s.contains("PM")){

            Integer x = h;
            if(h != 12){
                x += 12;
            }
            String exactHour = Integer.toString(x);
            time = exactHour + ":" + minutes + ":" + seconds;

        }
        return time;
    }

}