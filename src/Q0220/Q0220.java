package Q0220;

import java.awt.*;

//Given an array of integers, find out whether there are two distinct indices i and j in the array such that the absolute difference between nums[i] and nums[j] is at most t and the absolute difference between i and j is at most k.
//
//Example 1:
//
//Input: nums = [1,2,3,1], k = 3, t = 0
//Output: true
//Example 2:
//
//Input: nums = [1,0,1,1], k = 1, t = 2
//Output: true
//Example 3:
//
//Input: nums = [1,5,9,1,5,9], k = 2, t = 3
//Output: false
public class Q0220 {
    public static void main(String[] args) {
        int nums [] = {1,5,9,1,5,9};
        int k =2;
        int t =3;
        System.out.println(containsNearbyAlmostDuplicate(nums,k,t));

    }
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {

    }
}