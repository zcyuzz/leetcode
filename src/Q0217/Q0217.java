package Q0217;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Given an array of integers, find if the array contains any duplicates.
//
//Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
//
//Example 1:
//
//Input: [1,2,3,1]
//Output: true
//Example 2:
//
//Input: [1,2,3,4]
//Output: false
//Example 3:
//
//Input: [1,1,1,3,3,4,3,2,4,2]
//Output: true
public class Q0217 {
    public static void main(String[] args) {
        int []  input = {1,2,1,3};
        System.out.println(containsDuplicate(input));
    }
   public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])return true;

        }
       return false;

//       Set<Integer> set = new HashSet<Integer>();
//       for(int i=0;i<nums.length;i++){
//
//           if(set.add(nums[i])==false)return true;
//       }
//       return false;

//       for(int i=0;i<nums.length;i++){
//           set.add(nums[i]);
//       }
//       return set.size()==nums.length?false:true;
   }

}
