package DataStructuresAndAlgo;

import java.util.LinkedList;

/**
 * This class defines a singly linked list
 * @author Abderrazaaq El Abassi
 */

public class MySinglyLinkedList {

    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        /**
         * ListNode Constructor
         * @param data
         */
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }

    }

    /**
     * Traverses the singly linked list
     */

    public void Traverse(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    /**
     * Get the length of the singly linked list
     * @return length length od the string
     */

    public int Length(){
        ListNode current = head;
        int length = 0;
        while(current != null){
            length++;
            current = current.next;
        }
        return length;
    }

    /**
     * insert a node at the start of the list
     * @param data
     */

    public void Insert(int data){
        ListNode newNode = new ListNode(data);
        if(head == null){
            head = newNode;
        }
        newNode.next = head;
        head = newNode;
    }

    /**
     * searches a values inside a singly linked list
     * @param data
     * @return true if the value exists
     */

    public Boolean search(int data){
        ListNode current = head;
        while(current != null){
            if(current.data == data){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    /**
     * create a loop inside a singly linked list
     */

    public void createAloopLinkedList(){
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);

        // connect the list
        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;
    }


    /**
     * is the list contains a loop
     * @return true
     */
    public boolean containsLoop(){
        ListNode fastNode = head;
        ListNode slowNode = head;
        while(fastNode != null && fastNode.next != null){
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
            if(slowNode == fastNode){
                return true;
            }
        }
        return false;
    }

    /**
     * gets the starting node
     * @param slownode
     * @return
     */
    private ListNode getStartingNode(ListNode slownode){
        ListNode tmp = head;
        while(tmp != slownode){
            tmp = tmp.next;
            slownode = slownode.next;
        }
        return tmp;
    }

    /**
     * gets the slow node of a loop is detected: Floyd cycle algorithm
     * @return slownode
     */
    public ListNode getStartingNodeLoop(){
        ListNode fastNode = head;
        ListNode slowNode = head;
        while(fastNode != null && fastNode.next != null){
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
            if(fastNode == slowNode){
                return getStartingNode(slowNode);
            }
        }
        return null;
    }

    /**
     * delete a ndde at the start
     * @return ListNode
     */

    public ListNode deleteFirst(){
        if (head == null){
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    /**
     * reverses the list
     * @param head
     * @return
     */
    public ListNode reverse(ListNode head){
        if (head == null){
            return null;
        }
        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    /**
     * the main method
     * @param args
     */
    public static void main(String[] args){
        MySinglyLinkedList list = new MySinglyLinkedList();
        list.createAloopLinkedList();


        //list.Traverse();
        System.out.println("is it contains a loop: " + list.containsLoop());
        System.out.println("The starting node in this loop, with the value data = " + list.getStartingNodeLoop().data);


    }

}

