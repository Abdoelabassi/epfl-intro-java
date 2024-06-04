package DataStructuresAndAlgo;

/**
 * This class defines a doubly linked list
 * @author EL Abassi Abderrazaq
 */

public class DoublyLinkedList {
    private ListNode head;
    private ListNode tail;
    private int size;

    // node constructor
    private class ListNode{
        private int data;
        private ListNode next;
        private ListNode prev;

        public ListNode(int data){
            this.data = data;
        }
    }
    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    // checks is the dll is empty
    public boolean isEmpty(){
        return size == 0;
    }
    // get the length of dll
    public int size(){
        return size;
    }
    }
