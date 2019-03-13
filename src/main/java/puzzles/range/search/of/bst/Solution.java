package puzzles.range.search.of.bst;

public class Solution {
    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) {
            return 0;
        }

        int summ = 0;
        if (root.val <= R && root.val >= L) {
            summ = root.val;
        }

        summ += rangeSumBST(root.left, L, R);
        summ += rangeSumBST(root.right, L, R);


        return summ;
    }
}
