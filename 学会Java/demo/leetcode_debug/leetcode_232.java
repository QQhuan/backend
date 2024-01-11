import java.util.ArrayList;
import java.util.Stack;

public class leetcode_232 {
    // 双栈实现队列
    /*
     * 实现思路，栈A、栈B
     * 栈A用来入栈，栈B用来出栈
     * @suiation1：A不为空，B为空，A中元素全部输入B中，再有B出栈，等同于出队;
     * @suiation2：A不为空，B不为空，B出栈，等同于出队;
     * @suiation3：A、B为空，return null;
     */
    Stack<Integer> stackA;
    Stack<Integer> stackB;
    public leetcode_232() {
        stackA = new Stack<Integer>();
        stackB = new Stack<Integer>();
    }

    public void push(int x) {
        stackA.push(x);
    }

    public int pop() {
        if (stackB.isEmpty()) {
            while (!stackA.isEmpty()) {
                stackB.push(stackA.pop());
            }
        }
        return stackB.pop();
    }

    public int peek() {
        if(stackB.isEmpty()) {
            while(!stackA.isEmpty()) {
                stackB.push(stackA.pop());
            }
        }
        return stackB.peek();
    }

    public boolean empty() {
        if(stackA.isEmpty() && stackB.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        leetcode_232 myQueue = new leetcode_232();
        myQueue.push(1); // queue is: [1]
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
        myQueue.peek(); // return 1
        myQueue.pop(); // return 1, queue is [2]
        myQueue.empty(); // return false
        System.out.println(myQueue.empty());
    }
}
