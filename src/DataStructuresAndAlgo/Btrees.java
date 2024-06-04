package DataStructuresAndAlgo;
/**
 * this class defines binary trees
 * @author EL Abassi Abderrazaq
 */
public class Btrees<T> {



    private class TreeNode<T> {
        private T data;
        private TreeNode<T> left;
        private TreeNode<T> right;

        public TreeNode(T data) {
            this.data = data;
        }

    }
}