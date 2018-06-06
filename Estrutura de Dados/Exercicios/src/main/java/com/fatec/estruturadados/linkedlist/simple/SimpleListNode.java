package com.fatec.estruturadados.linkedlist.simple;

public class SimpleListNode {

	private int data;
	private SimpleListNode next;

	public SimpleListNode(int data) {
		this.data = data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public int getData() {
		return this.data;
	}

	public void setNext(SimpleListNode next) {
		this.next = next;
	}

	public SimpleListNode getNext() {
		return this.next;
	}

}
