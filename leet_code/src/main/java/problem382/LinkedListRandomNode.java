package problem382;

import java.util.Random;

public class LinkedListRandomNode {
    ListNode head;
    int listLength = 0;
    int lastFetchedElementIndex;
    ListNode lastFetchedElement;
    Random random;

    public LinkedListRandomNode(ListNode head) {
        random = new Random();
        this.head = head;
        lastFetchedElementIndex = 1;
        lastFetchedElement = head;

        while (head != null) {
            listLength++;
            head = head.next;
        }
    }

    public int getRandom() {
        int randomIndex = random.nextInt(listLength) + 1;
        if (randomIndex < lastFetchedElementIndex) {
            lastFetchedElementIndex = 1;
            lastFetchedElement = head;
        }

        while (lastFetchedElementIndex < randomIndex) {
            lastFetchedElementIndex++;
            lastFetchedElement = lastFetchedElement.next;
        }

        return lastFetchedElement.val;
    }
}
