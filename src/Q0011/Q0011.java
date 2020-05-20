package Q0011;

/*
Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines
are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis
forms a container, such that the container contains the most water.

Note: You may not slant the container and n is at least 2.
The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
In this case, the max area of water (blue section) the container can contain is 49.
Example:

Input: [1,8,6,2,5,4,8,3,7]
Output: 49
 */
public class Q0011 {
    public static void main(String[] args) {
        int input[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(input));
    }

    public static int maxArea(int[] height) {
        int answer = 0;
        int temp = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                if (height[i] >= height[j]) {
                    temp = height[j] * (j - i);
                } else {
                    temp = height[i] * (j - i);
                }
                if (temp > answer) answer = temp;
            }
        }
        return answer;
    }
}
