import java.util.Deque;
import java.util.LinkedList;

public class leetcode_150 {
    public static int evalRPN(String[] tokens) {
        Deque<Integer> stack = new LinkedList<Integer>();
        for(String ch : tokens) {
            if("+".equals(ch)) {
                stack.push(stack.pop()+stack.pop());
            } else if("-".equals(ch)) {
                stack.push(-stack.pop()+stack.pop());
            } else if("*".equals(ch)) {
                stack.push(stack.pop()*stack.pop());
            } else if("/".equals(ch)) {
                int divisor = stack.pop();
                int dividend = stack.pop();
                stack.push(dividend/divisor);
            } else {
                stack.push(Integer.valueOf(ch));
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        String[] input = new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(evalRPN(input));
    }
}
