package Q0010;
/*
Given an input string (s) and a pattern (p), implement regular expression matching with support for '.' and '*'.

'.' Matches any single character.
'*' Matches zero or more of the preceding element.
The matching should cover the entire input string (not partial).

Note:

s could be empty and contains only lowercase letters a-z.
p could be empty and contains only lowercase letters a-z, and characters like . or *.
Example 1:

Input:
s = "aa"
p = "a"
Output: false
Explanation: "a" does not match the entire string "aa".
Example 2:

Input:
s = "aa"
p = "a*"
Output: true
Explanation: '*' means zero or more of the preceding element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".
Example 3:

Input:
s = "ab"
p = ".*"
Output: true
Explanation: ".*" means "zero or more (*) of any character (.)".
Example 4:

Input:
s = "aab"
p = "c*a*b"
Output: true
Explanation: c can be repeated 0 times, a can be repeated 1 time. Therefore, it matches "aab".
Example 5:

Input:
s = "mississippi"
p = "mis*is*p*."
Output: false
 */
public class Q0010 {
    public static void main(String[] args) {
        String input = "aa";
        String pattern = "a.";
        System.out.println(isMatch(input,pattern));
    }
    public static boolean isMatch(String s, String p) {
        boolean flag = false;
        char preceding = ' ';
        int repeatCount = 0;
        if(s.equals(p)) return true;
        while(flag == false){
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!=p.charAt(i)){
                   if(p.charAt(i)=='.'&&s.length()>i+1){
                       if(p.charAt(i+1)=='*') return true;
                       preceding=p.charAt(i-1);
                       s=s.substring(i+1,s.length());
                       p=p.substring(i+1,p.length());
                       break;
                   }
                   if(p.charAt(i)=='*'){
                        if(i==0) continue;
                        preceding = p.charAt(i-1);
                        for(int j=i;j<s.length();j++){
                            if(s.charAt(j)==preceding) repeatCount++;
                            s=s.substring(repeatCount,s.length());
                            p=p.substring(i+1,p.length());
                            break;
                        }
                   }
                }
            }
        }

        return flag;
    }
}