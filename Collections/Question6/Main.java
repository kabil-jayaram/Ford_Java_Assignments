package Collections.Question6;

import java.util.*;

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the first linked list: ");
        int size1 = scanner.nextInt();
        System.out.println("Enter the elements of the first linked list");
        int i;
        ListNode firstList = new ListNode(scanner.nextInt());
        ListNode current = firstList;
        for (i = 1; i < size1; i++) {
            current.next = new ListNode(scanner.nextInt());
            current = current.next;
        }
        System.out.print("Enter the number of elements in the second linked list: ");
        int size2 = scanner.nextInt();
        System.out.println("Enter the elements of the first linked list");
        ListNode secondList = new ListNode(scanner.nextInt());
        current = secondList;
        for (i = 1; i < size2; i++) {
            current.next = new ListNode(scanner.nextInt());
            current = current.next;
        }
        ListNode mergedList = mergeSortedLists(firstList, secondList);

        System.out.println("Merged linked list:");
        displayList(mergedList);

        scanner.close();
    }

    private static ListNode mergeSortedLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.val < l2.val) {
            l1.next = mergeSortedLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeSortedLists(l1, l2.next);
            return l2;
        }
    }

    private static void displayList(ListNode node) {
        if (node == null) return;
        System.out.print(node.val + " -> ");
        displayList(node.next);
    }
}