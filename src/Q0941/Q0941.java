package Q0941;

import java.lang.invoke.VarHandle;
import java.sql.SQLOutput;

/*
Given an array A of integers, return true if and only if it is a valid mountain array.

Recall that A is a mountain array if and only if:

A.length >= 3
There exists some i with 0 < i < A.length - 1 such that:
A[0] < A[1] < ... A[i-1] < A[i]
A[i] > A[i+1] > ... > A[A.length - 1]




Example 1:

Input: [2,1]
Output: false
Example 2:

Input: [3,5,5]
Output: false
Example 3:

Input: [0,3,2,1]
Output: true


Note:

0 <= A.length <= 10000
0 <= A[i] <= 10000

 */
public class Q0941 {
    public static void main(String[] args) {
        int [] input = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(validMountainArray(input));
    }
    public static boolean validMountainArray(int[] A) {
        int n = A.length;
        if(n<3) return false;
        if(A[0]>=A[1]) return false;
        if(A[n-1]>=A[n-2]) return false;
        int index = 1;
//        for(int i=1;i<n;i++){
//            if(A[i]==A[i-1]) return false;
//            if(A[i]<A[i-1]) {
//                index =i;
//                break;
//            }
//        }
        while(index<n){
            if(A[index]==A[index-1]) return false;
            if(A[index]<A[index-1]) {
                break;
            }
            index++;
        }
        while(index<n){
            if(A[index]>=A[index-1]) return false;
            index++;
        }
        return true;
    }
}

