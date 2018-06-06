package com.fatec.estruturadados.linkedlist.simple;

public class SimpleLinkedList {
	
	private SimpleListNode head;
	
	public SimpleLinkedList() {
		head = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void addToHead(int data) {
		SimpleListNode node = new SimpleListNode(data);
		node.setNext(head);
		head = node;
	}
	
	public void addToTail(int data) {
		if (!(head==null)){
			SimpleListNode aux = head;
			
			while (aux.getNext()!=null){
			   aux=aux.getNext();
			}
			
			aux.setNext(new SimpleListNode(data));
			
		} else head = new SimpleListNode(data);
	}
	
	public void addToMiddle(int data, int position) {
		if(position == 1) {
			addToHead(data);
		} else {
			if (isEmpty()) {
				throw new RuntimeException("Empty list");
			} else {
				try {
					SimpleListNode aux = getPosition(position);
					SimpleListNode node = new SimpleListNode(data);
					node.setNext(aux.getNext());
					aux.setNext(node);
				} catch(RuntimeException ex) {
					System.out.println(ex.getMessage());
				}
			}
		}
	}
	
	public int removeHead() {
		int removed = -1;
		
		if(isEmpty()) {
			throw new RuntimeException("Empty list");
		} else {
			removed = head.getData();
			head = head.getNext();
		}
		
		return removed;
	}
	
	public int removeTail() {
		int removed = -1;
		
		if(isEmpty()) {
			throw new RuntimeException("Empty list");
		} else if (head.getNext() == null) {
			removed = head.getData();
			head = null;
		} else {
			SimpleListNode aux1 = head;
			SimpleListNode aux2 = null;
			
			while (aux1.getNext() != null) {
				aux2 = aux1;
				aux1 = aux1.getNext();
			}
			
			removed = aux1.getData();
			aux2.setNext(null);
		}
		
		return removed;
	}
	
	public String getAllNodes() {
		StringBuffer sb = new StringBuffer();
		SimpleListNode aux = head;
		
		while (aux != null) {
			sb.append(aux.getData()).append(" ");
			aux = aux.getNext();
		}
		
		return sb.toString();
	}	
	
	public SimpleListNode getTail(SimpleListNode aux) {
		if (aux.getNext() == null) {
			return aux;
		}
		return getTail(aux.getNext());
	}
	
	/**
	 * 
	 * @param position
	 * @return SimpleListNode
	 * @throws RuntimeException
	 */
	public SimpleListNode getPosition(int position) 
			throws RuntimeException{
		SimpleListNode aux = head;
		int counter = 1;
		
		while (aux.getNext() != null && counter < position-1) {
			aux = aux.getNext();
			counter++;
		}
		
		if (!(counter == position - 1)) throw new RuntimeException("Position does not exist");
		return aux;
	}
	
}
