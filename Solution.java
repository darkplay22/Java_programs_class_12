import java.util.*;

class Parser {

    private char[] arr;
    private int top;

    Parser(int size) {
        arr = new char[size];
        top = -1;
    }

    void push(char c) {
        arr[++top] = c;
    }

    char pop() {
        return arr[top--];
    }

    boolean isEmpty() {
        return top == -1;
    }

    static String isBalanced(String s) {
        Parser stack = new Parser(s.length());

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty() || stack.pop() != '(')
                    return "false";
            } else if (ch == '}') {
                if (stack.isEmpty() || stack.pop() != '{')
                    return "false";
            }
        }

        return stack.isEmpty() ? "true" : "false";
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            System.out.println(Parser.isBalanced(in.next()));
        }

        in.close();
    }
} {
    
}
