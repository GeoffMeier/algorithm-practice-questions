package java.simpleArraySum;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
//    Given an array of integers, find the sum of its elements.
//
//    For example, if the array , , so return .
//
//    Function Description
//
//    Complete the simpleArraySum function in the editor below. It must return the sum of the array elements as an integer.
//
//    simpleArraySum has the following parameter(s):
//
//    ar: an array of integers
//    Input Format
//
//    The first line contains an integer, , denoting the size of the array.
//    The second line contains  space-separated integers representing the array's elements.
//
//    Constraints
//
//
//    Output Format
//
//    Print the sum of the array's elements as a single integer

    /*
     * Complete the 'simpleArraySum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY ar as parameter.
     */

    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
        int total = 0;
        for(int i : ar){
            total= total + i;
        }
        return total;
    }

}
