package problem21;

import listNode.ListNode;

import java.util.Objects;

public class Merge2SortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (Objects.isNull(list1) && Objects.isNull(list2))
            return null;
        if (Objects.isNull(list1))
            return list2;
        if (Objects.isNull(list2))
            return list1;
        ListNode mergeNode = new ListNode(0);
        ListNode newNode = null;
        ListNode currNode = mergeNode;
        /*if (list1.val < list2.val) {
            newNode = new ListNode(list1.val);
            list1 = list1.next;
        } else {
            newNode = new ListNode(list2.val);
            list2 = list2.next;
        }*/

        while (Objects.nonNull(list1) && Objects.nonNull(list2)) {
            if (list1.val < list2.val) {
                newNode = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                newNode = new ListNode(list2.val);
                list2 = list2.next;
            }
            currNode.next = newNode;
            currNode = currNode.next;
        }
        if (list1 != null)
            currNode.next = list1;
        if (list2 != null)
            currNode.next = list2;

        return mergeNode.next;
    }
}
