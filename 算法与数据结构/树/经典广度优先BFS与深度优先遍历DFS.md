【力扣112】给你二叉树的根节点 `root` 和一个表示目标和的整数 `targetSum` 。判断该树中是否存在 **根节点到叶子节点** 的路径，这条路径上所有节点值相加等于目标和 `targetSum` 。如果存在，返回 `true` ；否则，返回 `false` 。

1. 广度优先遍历实现，每一层遍历时，存下每一个节点往下时当前“路径”的总和

​		当前仅当，某个节点为叶节点，且路径之和等于`targetSum`

```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) {
            return false;
        }

        // 两个队列，一个存节点，一个存值
        Queue<TreeNode> queNode = new LinkedList<TreeNode>();
        Queue<Integer> queVal = new LinkedList<Integer>();
        queNode.offer(root);
        queVal.offer(root.val);
        while(!queNode.isEmpty()) {
            TreeNode cur = queNode.poll();
            int temp = queVal.poll();
            if(cur.left == null && cur.right == null) {
                if(temp == targetSum) {
                    return true;
                }
                continue;
            }
            if(cur.left != null) {
                queNode.offer(cur.left);
                queVal.offer(cur.left.val+temp);
            }
            if(cur.right != null) {
                queNode.offer(cur.right);
                queVal.offer(cur.right.val+temp);
            }
        }
        return false;   
    }
}
```

2. 深度优先遍历

   递归方式，直观易理解

   ```java
   class Solution {
       public boolean hasPathSum(TreeNode root, int targetSum) {
           if(root == null) {
               return false;
           }
           if(root.left == null && root.right == null) {
               return targetSum == root.val;
           }
           return hasPathSum(root.left, targetSum-root.val) || hasPathSum(root.right, targetSum-root.val); 
       }
   }
   ```

   非递归方式，需要借助栈实现

   ```java
   class Solution {
   	public boolean hasPathSum(TreeNode root, int targetSum) {
           if(root == null) {
               return false;
           }
           Stack<TreeNode> myStack = new Stack<TreeNode>();
           Stack<Integer> myVal = new Stack<Integer>();
           myStack.push(root);
           myVal.push(root.val);
           
           while(!myStack.isEmpty()) {
               TreeNode node = myStack.pop();
               int value = myVal.pop();
               if(node.left == null && node.right == null && value == targetSum){
                   return true;
               }
               if(node.right != null) {
                   myStack.push(node.right);
                   myVal.push(node.right.val+value);
               }
               if(node.left != null) {
                   myStack.push(node.left);
                   myVal.push(node.left.val+value);
               }
               
           }
           return false;
       }
   }
   ```

   