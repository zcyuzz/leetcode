package Q1304;
//Given an integer n, return any array containing n unique integers such that they add up to 0.
//
//
//
//Example 1:
//
//Input: n = 5
//Output: [-7,-1,1,3,4]
//Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
//Example 2:
//
//Input: n = 3
//Output: [-1,0,1]
//Example 3:
//
//Input: n = 1
//Output: [0]
//
//
//Constraints:
//
//1 <= n <= 1000
public class Q1304 {
    public static void main(String[] args) {

    }
    public static int[] sumZero(int n) {
        int sum =0;
        int [] result =new int [n];
        for(int i =0; i<n-1;i++){
            result[i]=i;
            sum+=i;
        }
        result[n-1]=0-sum;
        return result;

    }
}