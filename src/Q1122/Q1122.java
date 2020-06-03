package Q1122;

import java.util.ArrayList;
import java.util.Arrays;

/*
Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.

Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2.  Elements that don't appear in arr2 should be placed at the end of arr1 in ascending order.



Example 1:

Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
Output: [2,2,2,1,4,3,3,9,6,7,19]


Constraints:

arr1.length, arr2.length <= 1000
0 <= arr1[i], arr2[i] <= 1000
Each arr2[i] is distinct.
Each arr2[i] is in arr1.
 */
public class Q1122 {
    public static void main(String[] args) {
        int[] a1 = {2, 21, 43, 38, 0, 42, 33, 7, 24, 13, 12, 27, 12, 24, 5, 23, 29, 48, 30, 31};
        int[] a2 = {2, 42, 38, 0, 43, 21};
        System.out.println(Arrays.toString(relativeSortArray(a1, a2)));
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] answer = new int[arr1.length];
        int index = 0;
        int index2 = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] == arr2[i]) {
                    answer[index++] = arr1[j];
                    arr1[j] = -1;
                }
            }
        }
        int counter = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == -1) counter++;
        }
        int[] temp = new int[arr1.length - counter];
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != -1) temp[index2++] = arr1[i];
        }
        Arrays.sort(temp);
        for (int i = 0; i < temp.length; i++) {
            answer[index++] = temp[i];
        }
        return answer;
    }
}

