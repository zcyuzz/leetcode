package Q0007;

/*
Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
Note:
Assume we are dealing with an environment which could only store integers within
the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem,
assume that your function returns 0 when the reversed integer overflows.
 */
public class Q0007 {
    public static void main(String[] args) {
        int input = 214483648;
        System.out.println(reverse(input));

    }

    public static int reverse(int x) {
        try {
            int num = x % 10;
            x /= 10;
            while (x != 0) {
                if (num > Integer.MAX_VALUE / 10 || num < Integer.MIN_VALUE / 10) return 0;
                num = num * 10 + x % 10;
                x /= 10;
            }
            return num;

        } catch (Exception e) {
            return 0;
        }
    }
}
//    public static int reverse(int x){
//        long num=x%10;
//        x/=10;
//        while(x!=0){
//            num=num*10+x%10;
//            x/=10;
//        }
//        if(num>Integer.MAX_VALUE||num<Integer.MIN_VALUE){
//            return 0;
//        }
//        return (int)num;
//    }

//    public static int reverse(int x) {
//        try {
//            boolean postive = true;
//            if (x == -2147483648) {
//                return 0;
//            }
//            if (x < 0) {
//                postive = false;
//                x = x * -1;
//            }
//            int answer = 0;
//            String s = String.valueOf(x);
//            String reverseS = "";
//            for (int i = s.length() - 1; i >= 0; i--) {
//                reverseS += s.charAt(i);
//            }
//            double temp;
//            answer = Integer.valueOf(reverseS);
//
//
//            return postive ? answer : answer * -1;
//        } catch (Exception e) {
//            return 0;
//        }
//
//
//    }
