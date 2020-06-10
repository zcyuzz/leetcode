package Q0441;

/*
You have a total of n coins that you want to form in a staircase shape, where every k-th row must have exactly k coins.

Given n, find the total number of full staircase rows that can be formed.

n is a non-negative integer and fits within the range of a 32-bit signed integer.

Example 1:

n = 5

The coins can form the following rows:
¤
¤ ¤
¤ ¤

Because the 3rd row is incomplete, we return 2.
Example 2:

n = 8

The coins can form the following rows:
¤
¤ ¤
¤ ¤ ¤
¤ ¤

Because the 4th row is incomplete, we return 3.
 */
public class Q0441 {
    public static void main(String[] args) {
        int input = 1800000000;
        System.out.println(arrangeCoins(input));
    }

    public static int arrangeCoins(int n) {
        double answer = ((-1+ Math.sqrt(1+(8*(double)n)))/2);
//        int i = 0;
//        while (n > 0) {
//            i++;
//            n-=i;
//        }
//        return n == 0 ? i : i - 1;
        return (int)answer;
    }
}

