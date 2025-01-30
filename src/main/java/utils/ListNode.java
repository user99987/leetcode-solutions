package utils;

import java.util.ArrayList;
import java.util.List;

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
        List<Integer> list = new ArrayList<>();
        while (node != null) {
            list.add(node.value);
            node = node.next;
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    public static ListNode create(int[] values) {
        if (values == null || values.length == 0) {
            return null;
        }
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

}
