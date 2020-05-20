package Q0006;

import java.awt.font.NumericShaper;
import java.util.Arrays;

/*
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
(you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);
Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:

P     I    N
A   L S  I G
Y A   H R
P     I
 */
public class Q0006 {
    public static void main(String[] args) {
        String input = "PAYPALISHIRING";
        int numRows = 4;
        System.out.println(convert(input, numRows));
    }
    public static String convert(String s, int numRows) {
        String answer ="";
        int middleColumns = numRows - 2;
        int Znums = s.length() / (numRows + middleColumns);
        int numsColumns = Znums * (middleColumns + 1);
        if ((s.length() % (numRows + middleColumns)) > 0) {
            if ((s.length() % (numRows + middleColumns)) <= numRows) {
                numsColumns++;
            } else {
                numsColumns += 1 + (s.length() % (numRows + middleColumns) % numRows);
            }
        }
        for(int i =0;i<s.length();i++){

        }
        return null;
    }

//    public static String convert(String s, int numRows) {
//        int middleColumns = numRows - 2;
//        int Znums = s.length() / (numRows + middleColumns);
//        int numsColumns = Znums * (middleColumns + 1);
//        if ((s.length() % (numRows + middleColumns)) > 0) {
//            if ((s.length() % (numRows + middleColumns)) <= numRows) {
//                numsColumns++;
//            } else {
//                numsColumns += 1 + (s.length() % (numRows + middleColumns) % numRows);
//            }
//        }
//        int matrix[][] = new int[numRows][numsColumns];
//        for (int i = 0; i < numRows; i++) {
//            for (int j = 0; j < numsColumns; j++) {
//            matrix[i][j]=0;
//            }
//        }
//        for(int i=0;i<s.length();i++){
//            if(i+1<=numRows+middleColumns){
//
//            }
//        }
//
//        for(int i=0;i<matrix.length;i++){
//            System.out.println(Arrays.toString(matrix[i]));
//        }
//        return numsColumns + "";
//    }
}
