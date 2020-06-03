package Q0020;

import java.util.Stack;

/*
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

Example 1:

Input: "()"
Output: true
Example 2:

Input: "()[]{}"
Output: true
Example 3:

Input: "(]"
Output: false
Example 4:

Input: "([)]"
Output: false
Example 5:

Input: "{[]}"
Output: true
 */
public class Q0020 {
    public static void main(String[] args) {
        String input = "{}";
        System.out.println(isValid(input));

    }

//    public static boolean isValid(String s) {
//        Stack<Character> stack = new Stack<Character>();
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
//                stack.push(s.charAt(i));
//            } else if ((!stack.isEmpty() && (s.charAt(i) == '}') && (stack.peek() == '{')) ||
//                    (!stack.isEmpty() && (s.charAt(i) == ']') && (stack.peek() == '[')) ||
//                    (!stack.isEmpty() && (s.charAt(i) == ')') && (stack.peek() == '('))
//            ) {
//                stack.pop();
//            } else {
//                return false;
//            }
//        }
//        return stack.isEmpty();
//    }

    public static boolean isValid(String s){
        while(s.contains("{}")||s.contains("[]")||s.contains("()")){
        s=s.replaceAll("\\{}","");
        s=s.replaceAll("\\[]","");
        s=s.replaceAll("()","");

        }
        return s.length()==0;
        }
        }
