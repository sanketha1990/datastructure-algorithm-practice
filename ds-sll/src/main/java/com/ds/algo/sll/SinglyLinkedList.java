package com.ds.algo.sll;

import com.ds.algo.bean.Node;

public class SinglyLinkedList {
	Node head = null;

	private int size = 0;

	public void insert(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(node);
		}
		size++;
	}

	public int getSize() {
		return size;
	}

	public void printSLL() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + "->");
			temp = temp.getNext();
		}
	}

	public void delete(int data) {
		if (head == null) {
			System.out.println("There are no node to delete");
			return;
		}
		if (head.getData() == data) {
			Node temp=head;
			head=temp.getNext();
			temp = null;
			return;
		} else {
			Node previous = head;
			Node current = previous.getNext();
			while (current != null) {
				if (current.getData() == data) {
					previous.setNext(current.getNext());
					current.setNext(null);
					return;
				}
				previous = current;
				current = current.getNext();
			}
		}
	}

}
