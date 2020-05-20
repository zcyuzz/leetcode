package Q0004;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Arrays;

/*
There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

You may assume nums1 and nums2 cannot be both empty.

Example 1:

nums1 = [1, 3]
nums2 = [2]

The median is 2.0
Example 2:

nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5
 */
public class Q0004 {
    public static void main(String[] args) {
        int [] nums1 = {1,3};
        int [] nums2 = {2};
        System.out.println(findMedianSortedArrays(nums1,nums2));

    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] result = new int[nums1.length+nums2.length];
        System.arraycopy(nums1,0,result,0,nums1.length);
        System.arraycopy(nums2,0,result,nums1.length,nums2.length);
        Arrays.sort(result);
        if (result.length % 2 == 0) {
            return (double)(result[result.length / 2] + result[result.length / 2 - 1]) / 2;
        } else {
            return result[result.length/2];
        }
    }
}

