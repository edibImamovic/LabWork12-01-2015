package com.bitcamp.stack.queues.ADT;

public class QueueInt {

	private Node head;
	private Node tail;

	public QueueInt() {
		head = null;
		tail = null;
	}

	public void push(int value) {
		Node newNode = new Node(value);

		if (tail == null) {
			tail = newNode;
			head = newNode;
			return;
		}

		tail.nextNode = newNode;
		tail = newNode;

	}

	public int getSize() {
		if (head == null) {
			return 0;
		}
		return getSize(head, 0);
	}

	private int getSize(Node current, int counter) {
		if (current == null) {
			return counter;
		}
		return getSize(current.nextNode, counter + 1);
	}

	public boolean contains(int value) {

		return contains(head, value);

	}

	private boolean contains(Node current, int value) {
		if (current == null)
			return false;

		if (current.value == value)
			return true;

		return contains(current.nextNode, value);

	}

	public int pop() {

		int value = head.value;
		Node current = head;
		head = head.nextNode;
		current = null;
		return value;

	}

	public int peek() {
		return head.value;
	}

	private class Node {

		public int value;
		public Node nextNode;

		public Node(int value) {
			this.value = value;
			nextNode = null;

		}
	}
}
