package Q0349;

import java.lang.reflect.Array;
import java.util.*;

/*
Given two arrays, write a function to compute their intersection.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Note:

Each element in the result must be unique.
The result can be in any order.
 */
public class Q0349 {
    public static void main(String[] args) {
        int [] nums1 = {4,9,5};
        int [] nums2 = {};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 =new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for(int i:nums1) set1.add(i);
        for(int i:nums2) set2.add(i);
        for(Integer i :set1){
            if (set2.contains(i)) arrayList.add(i);
        }
        int [] answer = new int [arrayList.size()];
        for(int i=0;i<arrayList.size();i++){
            answer[i]=arrayList.get(i);
        }
        return  answer;
    }

}
