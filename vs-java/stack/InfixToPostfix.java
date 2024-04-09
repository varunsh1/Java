package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class InfixToPostfix {

    static int Precedence(char ch){
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    static String infixToPostfix(String exp){
        int n = exp.length();
        Deque<Character>  stack = new ArrayDeque<>();
        StringBuilder str = new StringBuilder();
        for(int i=0; i<n; i++){
            char c = exp.charAt(i);
            if(Character.isLetterOrDigit(c)){
                str.append(c);
            }else if(c=='('){
                stack.push(c);
            }else if(c==')'){
                while(!stack.isEmpty()&&stack.peek()!='('){
                    str.append(stack.peek());
                    stack.pop();
                }
                stack.pop(); // pop ( symbol
            }else {
                // pop all symbols, if low precedence symbol is encountered in string than stack
                while(!stack.isEmpty() && Precedence(c)<=Precedence(stack.peek())){
                    str.append(stack.peek());
                    stack.pop();
                }
                // Push High Precedence symbols
                stack.push(c);
            }
        }
        // pop all symbols at the end of the string
        while(!stack.isEmpty()){
            str.append(stack.peek());
            stack.pop();
        }
        return str.toString();
    }
    public static void main(String[] args) {
        String exp = "a+b*(c^d-e)^(f+g*h)";
        System.out.println(infixToPostfix(exp));
    }
}
