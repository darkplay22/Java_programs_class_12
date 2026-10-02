import java.util.*;

class bracket {
    char arr[];
    int top;
    int max;
    int d;

    bracket(int size) {
        max = size;
        arr = new char[max];
        top = -1;
        d=0;
    }
int push(char val) {
    if (top == max - 1) {
        System.out.println("Stack Overflow");
    } else {
        top++;
        arr[top] = val;
    }
    return top+1;
}
boolean isEmpty() {
    return (top == -1);
}
char pop() {
    if (top == -1) {
        System.out.println("Stack Underflow");
        return ' ';
    } else {
        char val = arr[top];
        top--;
        return val;
    }
}
     boolean isBalanced(String str) {

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                int MaxDepth = push(ch);
                if (MaxDepth > d)
                  d = MaxDepth;
            }
            // Check closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (isEmpty())
                    return false;

                char top = pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        // If stack is empty → balanced
        //System.out.println("Max depth:"+d);
        return isEmpty();
        
    }

    public static void main(String[] args) {
        //String input = "This (is [very {deep}]) indeed!";
        String input="Simple {{{()}}} test ((((())))) ((())).";
    bracket ob=new bracket(input.length());
        if (ob.isBalanced(input))
            System.out.println("Balanced"+"\nMax Depth:"+ob.d);
        else
            System.out.println("Not Balanced");
    }
}