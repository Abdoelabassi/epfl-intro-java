package DataStructuresAndAlgo;
/**
 * this class defines binary trees
 * @author EL Abassi Abderrazaq
 */
public class Btrees<T> {

    private TreeNode<T> root;

    private class TreeNode<T> {
        private T data;
        private TreeNode<T> left;
        private TreeNode<T> right;

        public TreeNode(T data) {
            this.data = data;
        }

    }
    // create a binary tree: ints
    public void createBTree(T[] args) {
        TreeNode<T> First = new TreeNode<>(args[0]);
        TreeNode<T> second = new TreeNode<>(args[1]);
        TreeNode<T> third = new TreeNode<>(args[2]);
        TreeNode<T> fourth = new TreeNode<>(args[3]);
        TreeNode<T> fifth = new TreeNode<>(args[4]);
        TreeNode<T> sixth = new TreeNode<>(args[5]);
        TreeNode<T> seventh = new TreeNode<>(args[6]);

        root = First; // root --> first
        First.left = second;
        First.right = third; // second <--- first ---> third
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;
        third.right = seventh;

    }
}