package solveMeFirst;

import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Solution {

//    Function Description
//
//    Complete the solveMeFirst function in the editor below.
//
//    solveMeFirst has the following parameters:
//
//    int a: the first value
//    int b: the second value
//            Returns
//- int: the sum of  and

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named solveMeFirst.Solution. */

        Scanner scanner = new Scanner(System.in);
        Integer a = scanner.nextInt();
        Integer b  = scanner.nextInt();
        scanner.close();
        Integer solution = a + b;

        System.out.println(solution);
    }
}
