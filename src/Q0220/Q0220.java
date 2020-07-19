package Q0220;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;

//Given an array of integers, find out whether there are two distinct indices i and j in the array such that
// the absolute difference between nums[i] and nums[j] is at most t and
// the absolute difference between i and j is at most k.
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
        int nums [] = {2147483647,-2147483647};
        int k =1;
        int t =2147483647;
        System.out.println(containsNearbyAlmostDuplicate(nums,k,t));

    }
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        long absDiff;
        for(int i =0;i<nums.length;i++){
            for(int j=i+1;j<i+k+1&&j<nums.length;j++){
                System.out.println(i + " " +j);
                System.out.println("t "+Math.abs(nums[j]-nums[i]));
                System.out.println("k " + Math.abs(j-i));
                absDiff= Math.abs(((long)nums[j]-(long)nums[i]));
                if(absDiff<=t) return true;
            }
        }
        return false;

    }
}