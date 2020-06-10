package Q0448;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
448. Find All Numbers Disappeared in an Array
Easy

2652

232

Add to List

Share
Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

Find all the elements of [1, n] inclusive that do not appear in this array.

Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

Example:

Input:
[4,3,2,7,8,2,3,1]

Output:
[5,6]
Accepted
243,816
Submissions
438,303
 */
public class Q0448 {
    public static void main(String[] args) {
        int[] input = {0};
        System.out.println(findDisappearedNumbers(input).toString());
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int[] temp = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            temp[nums[i]] += 1;
        }
        System.out.println(Arrays.toString(temp));
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 1; i < temp.length; i++) {
            if (temp[i] == 0) {
                a.add(i);
            }
        }
        return a;
    }
}
