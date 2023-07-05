package diagonalDifference;
import java.util.*;
class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
//     int num =arr.size();
//     int diagonalOne = 0;
//     int diagonalTwo= 0;
//     for(int i = 0; i < num; i ++){
//         for(int j =0; j < num ; j++){
//             if(i == j){
//                 diagonalOne += arr[i][j];
//             }
//             if((i + j) == (num - 1) ){
//                 diagonalTwo += arr[i][j];
//             }
//         }
//     }
// int sum = diagonalOne + diagonalTwo;


//     //    int total = 0;

//     // for (int row = 0; row < arr.size; row++)
//     // {
//     //     for (int col = 0; col < arr[row].size; col++)
//     //         total += arr[row][col];
//     // }

//     // return total;

//  return sum;

        int d1=0;
        int d2=0;
        for(int i=0;i<arr.size();i++)
        {
            for(int j=0;j<arr.get(i).size();j++)
            {
                if(i==j)
                {
                    d1=d1+arr.get(i).get(j);
                }
                if((i+j)==arr.size()-1)
                {
                    d2=d2+arr.get(i).get(j);
                }
            }
        }
        int ans =d1-d2;
        return Math.abs(ans);



    }
}
