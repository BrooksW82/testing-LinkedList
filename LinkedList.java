package framework;

public class LinkedList {
	
	private Node head;
	private int size;

	private class Node {
		
		int value;
		Node next;
		
		Node(int value){
			this.value = value;
			next = null;
		}
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean add(int newValue) {
			Node newNode = new Node(newValue);
			if(head == null) {
				head = newNode;
				newNode.next = null;
				size++; 
			}
			else {
				Node ptr = head;
				for(int i = 0; i < size; i++) {
					if(ptr.value == newValue)
						return false;
					ptr = ptr.next;
				}
				ptr.next = newNode;
				newNode.next = null; 
			}
			return true;
	}
	
	public boolean remove(int removeValue) {
		Node ptr = head;
		
		if(head == null) {
			return false;
		}
		
		if(head.value == removeValue && head.next == null) {
			head = null;
			return true;
		}
		
		while(ptr.next != null) {
			if(ptr.next.value == removeValue) {
				ptr.next = ptr.next.next;
				size--;
				return true;
			}
		}
		return false;
	}
	
	public boolean checkEquals(LinkedList testList) {
		
		Node firstPtr = testList.head;
		Node secondPtr = head;
		
		if(testList.getSize() != size) {
			return false;
		}
		
		for(int i = 0; i < size; i++) {
			if(firstPtr.value != secondPtr.value) {
				return false;
			}
			firstPtr = firstPtr.next;
			secondPtr = secondPtr.next;
		}
		return true;
	}
}
	














	