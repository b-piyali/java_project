package _30_day_challenge.week2.day10;

public class ListNode {
    int value;
    ListNode next;
    int minValue;

    ListNode(ListNode next) {
        this.next = next;
    }

    ListNode(int val, int min) {
        this(val, min, null);
    }

    ListNode(int val, int min, ListNode next) {
        this.value = val;
        this.minValue = min;
        this.next = next;
    }
}
