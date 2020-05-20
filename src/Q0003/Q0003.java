package Q0003;

import java.time.temporal.Temporal;

/*
Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class Q0003 {
    public static void main(String[] args) {
        String input = "pwwkew";
        System.out.println(lengthOfLongestSubstring(input));
    }


    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int answer = 1;
        String tempStr = "";
        for (int i = 0; i < s.length()-answer; i++) {
            tempStr = "" + s.charAt(i);
            for (int j = i + 1; j < s.length(); j++) {
                if (tempStr.indexOf(s.charAt(j)) != -1) {
                  break;
                }
                    tempStr += s.charAt(j);

            }
            if (tempStr.length() > answer)
                answer = tempStr.length();

        }
        return answer;
    }
}