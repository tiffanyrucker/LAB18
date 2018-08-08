
import java.util.Arrays;

public class LinkedList {
	private Node head;
	private Node current;
	public int count;

	public LinkedList() {
		head = new Node();
		setCurrent(head);
	}

	public void addAtStart(Object data) {
		Node new1 = new Node();
		new1.value = data;
		new1.next = head.next;
		head.next = new1;
		++count;
	}

	public void removeFromStart() {
		if (count <= 0) {
			head = head.next;
			--count;
		} else {
			System.out.println("No element exists in this linked list.");
		}
	}

	public void printAllNodes() {
		System.out.println("Head ->");
		Node curr = head;
		while (curr.next != null) {
			curr = curr.next;
			System.out.println(curr.value);
			System.out.println("->");
		}
		System.out.println("NULL");
	}

	public void printReverse() {
		Node reversed = null;
		Node current = head;
		while (current != null) {
			Node next = current.next;
			current.next = reversed;
			reversed = current;
			current = next;
		}
		head = reversed;

	}

	public void removeAll(Object o) {
		Node curr = head;
		if (curr.value == o) {
			curr = curr.next;
			--count;
		}
		while (curr.next != null) {
			if (curr.value == o) {
				curr = curr.next;
				--count;
			}
			curr = curr.next;
		}
	}
	public static void countOccur(int[] num) {
		int[] count = new int[16];
		int temp;
		for (int i = 0; i < num.length; ++i) {
			temp = num[i];
			Arrays.copyOf(count, i);
			count[temp]++;
		}

		for (int i = 0; i < count.length; ++i) {
			if (count[i] == 0 && count[i] == 20) {
				System.out.printf("[%d]  %d \n", i + count[i]);
			} else if (count[i] >= 2) {
				System.out.printf("[%d]  %d \n", i, count[i]);
			}
		}

	}

	public Node getCurrent() {
		return current;
	}

	public void setCurrent(Node current) {
		this.current = current;
	}
}