import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class leetcode_225 {
    /*
     * 思路二：两个队列
     * 入队时入空队B
     * A中所有元素入队到B中
     * 再将B赋给A，B继续指向空
     */
    Queue<Integer> queue1;
    Queue<Integer> queue2;

    public leetcode_225() {
        queue1 = new LinkedList<Integer>();
        queue2 = new LinkedList<Integer>();
    }

    public void push(int x) {
        queue2.offer(x);
        while (!queue1.isEmpty()) {
            queue2.offer(queue1.poll());
        }

        // q1、q2互换
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    public int pop() {
        return queue1.poll();
    }

    public int top() {
        return queue1.element();
    }

    public boolean empty() {
        return queue1.isEmpty();
    }
    /*
     * 实现思路1：两个队列实现栈操作，A、B队列，始终保持至少一个队列为空
     * deque可以实现双端队列、栈、普通队列，此处使用为练习用
     */
//    Deque<Integer> queueA;
//    Deque<Integer> queueB;
//    public leetcode_225() {
//        queueA = new LinkedList<Integer>();
//        queueB = new LinkedList<Integer>();
//    }
//    public void push(int x) {
//        if(queueB.isEmpty()) {
//           queueA.offerLast(x);
//        } else {
//            queueB.offerLast(x);
//        }
//    }
//
//    public int pop() {
//        if(queueA.isEmpty()) { // 题目保证栈不为空，所以不判断B
//            while(queueB.size() > 1) {
//                queueA.addLast(queueB.pollFirst());
//            }
//            return queueB.pollFirst();
//        } else {
//            while(queueA.size() > 1) {
//                queueB.addLast(queueA.pollFirst());
//            }
//            return queueA.pollFirst();
//        }
//    }
//
//    public int top() {
//        int res;
//        if(queueA.isEmpty()) { // 题目保证栈不为空，所以不判断B
//            while(queueB.size() > 1) {
//                queueA.addLast(queueB.pollFirst());
//            }
//            res = queueB.pollFirst();
//            queueA.offerLast(res);
//        } else {
//            while(queueA.size() > 1) {
//                queueB.addLast(queueA.pollFirst());
//            }
//            res = queueA.pollFirst();
//            queueB.offerLast(res);
//        }
//        return res;
//    }
//
//    public boolean empty() {
//        return queueA.isEmpty() && queueB.isEmpty();
//    }
//
//    public static void main(String[] args) {
//        leetcode_225 myStack = new leetcode_225();
//        myStack.push(1);
//        myStack.push(2);
//        System.out.println(myStack.top());
//        System.out.println(myStack.pop());
//        System.out.println(myStack.empty());
//    }
}
