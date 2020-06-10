package Q0665;

/*
Given an array nums with n integers, your task is to check if it could become non-decreasing by modifying at most 1 element.

We define an array is non-decreasing if nums[i] <= nums[i + 1] holds for every i (0-based) such that (0 <= i <= n - 2).



Example 1:

Input: nums = [4,2,3]
Output: true
Explanation: You could modify the first 4 to 1 to get a non-decreasing array.
Example 2:

Input: nums = [4,2,1]
Output: false
Explanation: You can't get a non-decreasing array by modify at most one element.


Constraints:
3423 -1423
1 <= n <= 10 ^ 4
- 10 ^ 5 <= nums[i] <= 10 ^ 5
 */
public class Q0665 {
    public static void main(String[] args) {
        int[] input = {1, 3, 2};
        System.out.println(checkPossibility(input));
    }

    public static boolean checkPossibility(int[] nums) {
        if (nums.length <= 1) {
            return true;
        }
        int temp = -1;
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                count++;
                temp = i;
            }
            if (count == 2) {
                return false;
            }
        }
        System.out.println(temp);
        if (temp > 1 && temp != nums.length - 1) {
            if (nums[temp - 1] > nums[temp + 1] && nums[temp] < nums[temp - 2]) return false;
        }
        return true;
    }
}