package com.ds.algo.main;

import com.ds.algo.sll.SinglyLinkedList;

public class SinglyLinkedListMain {

	public static void main(String[] args) {
		SinglyLinkedList sll=new SinglyLinkedList();
		sll.insert(10);
		sll.insert(20);
		sll.insert(30);
		sll.insert(40);
		sll.insert(50);
		sll.insert(60);
		sll.insert(70);
		sll.insert(80);
		
		sll.printSLL();
		System.out.println("\nSize of SLL = "+sll.getSize());
		sll.delete(10);
		sll.printSLL();
	}

}
