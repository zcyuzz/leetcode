package Q1403;
/*
Given the array nums, obtain a subsequence of the array whose sum of elements is strictly greater than the sum of the non included elements in such subsequence.

If there are multiple solutions, return the subsequence with minimum size and if there still exist multiple solutions, return the subsequence with the maximum total sum of all its elements. A subsequence of an array can be obtained by erasing some (possibly zero) elements from the array.

Note that the solution with the given constraints is guaranteed to be unique. Also return the answer sorted in non-increasing order.



Example 1:

Input: nums = [4,3,10,9,8]
Output: [10,9]
Explanation: The subsequences [10,9] and [10,8] are minimal such that the sum of their elements is strictly greater than the sum of elements not included, however, the subsequence [10,9] has the maximum total sum of its elements.
Example 2:

Input: nums = [4,4,7,6,7]
Output: [7,7,6]
Explanation: The subsequence [7,7] has the sum of its elements equal to 14 which is not strictly greater than the sum of elements not included (14 = 4 + 4 + 6). Therefore, the subsequence [7,6,7] is the minimal satisfying the conditions. Note the subsequence has to returned in non-decreasing order.
Example 3:

Input: nums = [6]
Output: [6]


Constraints:

1 <= nums.length <= 500
1 <= nums[i] <= 100
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1403 {
    public static void main(String[] args) {
        int[] input ={4,4,7,6,7};
        System.out.println(minSubsequence(input));
    }

    public static List<Integer> minSubsequence(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        int temp =0;
        int biggest=0;
        int sum=0;
        int index=0;
        int currentNum=0;
        int remaining=Integer.MAX_VALUE;
        while(sum<=remaining) {

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > temp) {
                    temp = nums[i];
                    index = i;
                }
            }
            temp=0;
            list.add(nums[index]);
            sum+=list.get(currentNum++);
            remaining=0;
            nums[index]=0;
            for(int i=0;i<nums.length;i++) {
                remaining += nums[i];
            }
            System.out.println(remaining);
            System.out.println(sum);
        }
        return list;
    }

}
