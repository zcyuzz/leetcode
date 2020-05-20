package Q0005;

import com.sun.source.tree.ForLoopTree;

/*
Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example 1:

Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example 2:

Input: "cbbd"
Output: "bb"
 */
public class Q0005 {
    public static void main(String[] args) {
        String input = "ffffffffffffffffffffffff";
        System.out.println(longestPalindrome(input));

    }

    public static String longestPalindrome(String s) {
        if(s.length()==0){
            return "";
        }
        String answer = ""+s.charAt(0) ;
        String temp;

        for (int i = 0; i < s.length()-answer.length(); i++) {

            for (int j = s.length()-1; j>i; j--) {
                if (s.charAt(i) == s.charAt(j)) {
                    temp = s.substring(i,j+1);

                        if (isPalindrome(temp)) {
                            if (temp.length() > answer.length()) {
                                answer = temp;
                            }
                            break;
                        }

                }
            }
        }

        return answer;
    }

    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
