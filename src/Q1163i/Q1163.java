package Q1163i;
/*
Given a string s, return the last substring of s in lexicographical order.

Example 1:

Input: "abab"
Output: "bab"
Explanation: The substrings are ["a", "ab", "aba", "abab", "b", "ba", "bab"]. The lexicographically maximum substring is "bab".
Example 2:

Input: "leetcode"
Output: "tcode"

Note:

1 <= s.length <= 4 * 10^5
s contains only lowercase English letters.
 */
public class Q1163 {
    public static void main(String[] args) {
        String input ="leetcode";
        System.out.println(lastSubstring(input));
    }
    public static String lastSubstring(String s) {
        if(s.length()==0){
            return "";
        }
        String answer = "";
        int lex=0;
        int temp=0;
        int index =0;
        for(int i=0;i<s.length();i++){
            temp=(int)s.charAt(i);
            if(temp>lex){
                lex = temp;
                index=i;
            }
        }
        return s.substring(index,s.length());
    }
}