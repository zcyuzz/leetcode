package Q0905;

import java.util.Arrays;

/*
Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.

You may return any answer array that satisfies this condition.



Example 1:

Input: [3,1,2,4]
Output: [2,4,3,1]
The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.


Note:

1 <= A.length <= 5000
0 <= A[i] <= 5000
 */
public class Q905 {
    public static void main(String[] args) {
        int[] input = {0,0,2,3,4,5};
        System.out.println(Arrays.toString(sortArrayByParity(input)));
    }


    public static int[] sortArrayByParity(int[] A) {
        int length = A.length;
        int[] Answer = new int[length];
        int index = 0;
        int countindex = 1;
        for (int i = 0; i < length; i++) {
            if (A[i] % 2 == 0) {
                Answer[index++] = A[i];
            } else {
                Answer[length - countindex++] = A[i];
            }
        }
        return Answer;
    }
}