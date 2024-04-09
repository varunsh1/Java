package stack;
import java.util.*;
public class Stack1 {
    public static void arrayDeque(){
        ArrayDeque<Integer> st = new ArrayDeque<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.pop();
        st.pop();
        st.isEmpty();
        

    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println("Is empty "+stack.isEmpty());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        if(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    

        System.out.println("Is empty "+stack.isEmpty());
        if(!stack.isEmpty()){
            System.out.println(stack.peek());
        }
        System.out.println(stack);
        stack.push(10);
        stack.push(300);
        stack.push(20);
        System.out.println("stack search 30 = "+stack.search(30));
    }
}
