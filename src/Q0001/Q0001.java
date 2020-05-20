package Q0001;

import java.util.Arrays;

/*
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */
public class Q0001 {
    public static void main(String[] args) {
            int [] nums = {2,7,11,15};
            int target = 9;
            System.out.println(Arrays.toString(twoSum(nums,target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>target)
                continue;
            for(int j=i+1;j<nums.length;j++){
                if (nums[i] + nums[j]==target) {
                    return new int [] {i,j};
                }
            }
        }
        return null;
    }
}
