package datastructures;

public class Node {
	
	
	Node prev;
	Node next;
	int value;
	
	//Singly Linked
	public Node(Node next, int value) {
		this.next = next;
		this.value = value;
	}
	
	//Doubly Linked
	public Node(Node prev, Node next, int value) {
		this.prev = prev;
		this.next = next;
		this.value = value;
	}

	public Node getLeft() {
		return prev;
	}

	public void setLeft(Node left) {
		this.prev = left;
	}

	public Node getRight() {
		return next;
	}

	public void setRight(Node right) {
		this.next = right;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
	
}
