package utils;

public class ListNode {
    public int value;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int value) {
        this.value = value;
    }

    public ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }

    public static int[] toArray(ListNode node) {
        int size = 0;
        for (ListNode current = node; current != null; current = current.next) {
            size++;
        }
        var values = new int[size];
        for (int i = 0; i < size; i++) {
            values[i] = node.value;
            node = node.next;
        }
        return values;
    }

    public static ListNode create(int[] values) {
        if (values == null || values.length == 0) {
            return null;
        }
        var head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

}
