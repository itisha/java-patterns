package puzzles.range.search.of.bst;

public class Demo {

    public static void main(String[] args) {
        TreeNode treeNode = TreeNode.fromArray(new Integer[]{10, 5, 15, 3, 7, null, 18});
        int result = new Solution().rangeSumBST(treeNode, 7, 15);
        System.out.println(result);
    }


}
