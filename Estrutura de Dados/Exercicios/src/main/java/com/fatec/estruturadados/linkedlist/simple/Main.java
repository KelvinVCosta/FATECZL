package com.fatec.estruturadados.linkedlist.simple;

public class Main {

	public static void main(String[] args) {
		SimpleLinkedList sll = new SimpleLinkedList();
		
		sll.addToHead(210914);
		System.out.println("sll.addToHead(210914);");
		System.out.println(sll.getAllNodes() + "\n");
		
		sll.addToHead(120914);
		System.out.println("sll.addToHead(120914);");
		System.out.println(sll.getAllNodes() + "\n");
		
		sll.addToTail(2512);
		System.out.println("sll.addToTail(2512);");
		System.out.println(sll.getAllNodes() + "\n");
		
		sll.addToMiddle(30288, 2);
		System.out.println("sll.addToMiddle(30288, 2);");
		System.out.println(sll.getAllNodes() + "\n");
		
		sll.removeHead();
		System.out.println("sll.removeHead();");
		System.out.println(sll.getAllNodes() + "\n");
		
		sll.removeTail();
		System.out.println("sll.removeTail();");
		System.out.println(sll.getAllNodes() + "\n");
	}
}
