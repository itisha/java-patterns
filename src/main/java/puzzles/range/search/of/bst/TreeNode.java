package puzzles.range.search.of.bst;

public class TreeNode {
    Integer val;
    TreeNode left;
    TreeNode right;

    private TreeNode(int x) {
        val = x;
    }

    public static TreeNode fromArray(Integer[] array) {
        TreeNode root = new TreeNode(array[0]);
        for (int i = 1; i < array.length; i++) {
            if (array[i] == null) {
                continue;
            }
            root.add(array[i]);
        }
        return root;
    }

    private void add(Integer i) {
        if (val == null || i == null)
            throw new IllegalArgumentException();

        if (i <= val) {
            if (left == null) {
                left = new TreeNode(i);
            } else {
                left.add(i);
            }
        }


        if (i > val) {
            if (right == null) {
                right = new TreeNode(i);
            } else {
                right.add(i);
            }
        }
    }

}
