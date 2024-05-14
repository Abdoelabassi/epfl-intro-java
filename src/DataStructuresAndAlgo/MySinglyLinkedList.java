package DataStructuresAndAlgo;

public class MySinglyLinkedList {

    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }

    }

    public void Traverse(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public int Length(){
        ListNode current = head;
        int length = 0;
        while(current != null){
            length++;
            current = current.next;
        }
        return length;
    }

    public void Insert(int data){
        ListNode newNode = new ListNode(data);
        if(head == null){
            head = newNode;
        }
        newNode.next = head;
        head = newNode;
    }


    public static void main(String[] args){
        MySinglyLinkedList list = new MySinglyLinkedList();
        list.head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(10);
        // connect the list
        list.head.next = second; // 1 --> 2
        second.next = third; // 1 --> 2 --> 3
        third.next = fourth; // 1 --> 2 --> 3 --> 10

        list.Traverse();
        list.Insert(7);
        list.Traverse();
        System.out.println("Length: " + list.Length());

    }

}

