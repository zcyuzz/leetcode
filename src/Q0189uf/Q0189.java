package Q0189uf;

/*
Given an array, rotate the array to the right by k steps, where k is non-negative.

Follow up:

Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
Could you do it in-place with O(1) extra space?


Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation:
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]


Constraints:

1 <= nums.length <= 2 * 10^4
It's guaranteed that nums[i] fits in a 32 bit-signed integer.
k >= 0
 */
public class Q0189 {
    public static void main(String[] args) {
        int [] input = {-1};
        rotate(input,2);
    }
    public static void  rotate(int [] nums, int k){
        
    }
//    public static void rotate(int[] nums, int k) {
//        if(nums.length==1) return;
//        int n = nums.length;
//        int [] answer = new int[n];
//        for(int i=0;i<n;i++){
//            answer[(i+k)%n]=nums[i];
//        }
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = answer[i];
//        }
//    }
}
