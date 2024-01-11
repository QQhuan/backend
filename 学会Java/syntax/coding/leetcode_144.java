import java.util.ArrayList;
import java.util.List;


public class leetcode_144 {
    static List<Integer> res = new ArrayList<Integer>();
    public static List<Integer> preorderTraversal(TreeNode root) {
        preOrder(root);
        return res;
    }

    public static void preOrder(TreeNode root) {
        if(root == null) return;
        res.add(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        List<Integer> res = preorderTraversal(root);
        System.out.print(res);
    }
}
