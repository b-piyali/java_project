package problem82;// created by: bandypiy
// Date: 10/16/2018

import java.util.NoSuchElementException;

public class RemoveDuplicatesfromSortedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    ListNode headNode = null;
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return null;
        ListNode previousNode = head;
        ListNode nextNode = head.next;
        ListNode tempNode = previousNode;
        while(nextNode!=null){
            if(previousNode.val == nextNode.val){
                nextNode = nextNode.next;
                previousNode = nextNode;
                tempNode.next = nextNode;
                nextNode = nextNode.next;
            }else {
                tempNode = previousNode;
                previousNode = nextNode;
                nextNode = nextNode.next;
            }
        }
        return head;
    }
    public void add(int value){
        ListNode newNode = new ListNode(value);
        if(headNode != null)
            newNode.next = headNode;
        headNode = newNode;
    }

    private void print(){
        for(ListNode curr = headNode; curr != null; curr = curr.next)
            System.out.println(curr.val);
        System.out.println("*********************");
    }
    public static void main(String[] args) {
        RemoveDuplicatesfromSortedList linkedList = new RemoveDuplicatesfromSortedList();
        linkedList.add(0);
        for(int i=1; i<5; i++) {
            linkedList.add(i);
            linkedList.add(i);
            linkedList.add(i);
        }
        linkedList.add(6);
        linkedList.print();
        linkedList.deleteDuplicates(linkedList.headNode);
        linkedList.print();
    }
}
