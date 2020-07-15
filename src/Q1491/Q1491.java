package Q1491;

import java.util.Arrays;
import java.util.InputMismatchException;

//Given an array of unique integers salary where salary[i] is the salary of the employee i.
//
//Return the average salary of employees excluding the minimum and maximum salary.
//
//
//
//Example 1:
//
//Input: salary = [4000,3000,1000,2000]
//Output: 2500.00000
//Explanation: Minimum salary and maximum salary are 1000 and 4000 respectively.
//Average salary excluding minimum and maximum salary is (2000+3000)/2= 2500
//Example 2:
//
//Input: salary = [1000,2000,3000]
//Output: 2000.00000
//Explanation: Minimum salary and maximum salary are 1000 and 3000 respectively.
//Average salary excluding minimum and maximum salary is (2000)/1= 2000
//Example 3:
//
//Input: salary = [6000,5000,4000,3000,2000,1000]
//Output: 3500.00000
//Example 4:
//
//Input: salary = [8000,9000,2000,3000,6000,1000]
//Output: 4750.00000
//
//
//Constraints:
//
//3 <= salary.length <= 100
//10^3 <= salary[i] <= 10^6
//salary[i] is unique.
//Answers within 10^-5 of the actual value will be accepted as correct.
public class Q1491 {
    public static void main(String[] args) {
        int[] input = {1000, 4000, 2000, 3000, 5000, 50001, 50232, 203424};
        System.out.println(average(input));
    }

    //    public static double average(int[] salary) {
//        Arrays.sort(salary);
//        int total=0;
//        for(int i =1;i<salary.length-1;i++){
//            total+=salary[i];
//        }
//        return (double)total/(salary.length-2);
//    }
    public static double average(int[] salary) {
        int min =1000000;
        int max =1000;
        int sum =0;
        for(int s:salary){
            min = Math.min(min,s);
            max = Math.max(max,s);
            sum+=s;
        }
        return (double)(sum-min-max)/(salary.length-2);
    }
}

