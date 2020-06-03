package Q0977;

import java.util.Arrays;

/*
Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.



Example 1:

Input: [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Example 2:

Input: [-7,-3,2,3,11]
Output: [4,9,9,49,121]


Note:

1 <= A.length <= 10000
-10000 <= A[i] <= 10000
A is sorted in non-decreasing order.
 */
public class Q977 {
    public static void main(String[] args) {
        int [] input = {-1,-2,0,2,3,4,-3};
        System.out.println(Arrays.toString(sortedSquares(input)));
    }

    public static int[] sortedSquares(int[] A) {

        int[] answer = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            answer[i] = A[i] * A[i];
        }
        Arrays.sort(answer);
        return answer;
    }
}