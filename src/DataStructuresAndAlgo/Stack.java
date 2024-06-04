package DataStructuresAndAlgo;

/**
 * This class defines the stack data structure
 * @author El Abassi Abderrazaq
 */

public class Stack {

    private Node top;
    private int size;
    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    // push to the stack
    public void push(int data) {
        Node tmp = new Node(data);
        tmp.next = top;
        top = tmp;
        size++;
    }
    // pop out of dll
    public int pop() {
        int result = top.data;
        top = top.next;
        size--;
        return result;
    }

}