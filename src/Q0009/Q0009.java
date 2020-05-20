package Q0009;
/*
Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

Example 1:

Input: 121
Output: true
Example 2:

Input: -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 */
public class Q0009 {
    public static void main(String[] args) {
        int input =12321;
        System.out.println(isPalindrome(input));
    }
    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        if (x <10) {
            return true;
        }
        if(x%10==0){
            return false;
        }
        if(x<100){
            if(x%10==x/10) return true;
            return false;
        }
        int reverse =0;
        while(x>reverse){
            reverse=x%10+reverse*10;
            x/=10;
            System.out.println(x);
            System.out.println(reverse);


        }
        return x==reverse||x==reverse/10;

    }

}
