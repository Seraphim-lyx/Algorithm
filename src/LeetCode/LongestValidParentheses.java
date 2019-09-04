package LeetCode;

import java.util.Stack;

public class LongestValidParentheses {

    public static void main(String[] args) {
        LongestValidParentheses.longestValidParentheses("(()");
    }

    public static int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int longest = 0;
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
           if (c == '('){
               stack.push(i);
           }else {
               stack.pop();
               if (!stack.isEmpty()) {
                   longest = Math.max(longest, i - stack.peek());
               }else {
                   stack.push(i);
               }
           }

        }

        return longest;
    }
}
