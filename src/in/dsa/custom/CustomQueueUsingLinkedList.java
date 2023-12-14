package in.dsa.custom;

import java.util.LinkedList;
import java.util.Queue;

public class CustomQueueUsingLinkedList {	

	//Define the data members
	private Node head; 
	private Node tail; 
	private int size;

	public CustomQueueUsingLinkedList() {
		//Implement the Constructor
		this.head = null;
		this.tail = null; 
		this.size = 0;
	}


	/*----------------- Public Functions of Stack -----------------*/

	public int getSize() { 
		//Implement the getSize() function
		return size;
	}


	public boolean isEmpty() { 
		//Implement the isEmpty() function
		if(size == 0) return true; 
		else return false;
	}


	public void enqueue(int data) {
		//Implement the enqueue(element) function
		Node node = new Node(data);
		
		if(size == 0){
			head = node; 
			tail = node;
			size++;
			return;
		}

		tail.next = node;
		tail = tail.next;
		size++;
	}


	public int dequeue() {
		//Implement the dequeue() function
		if(size == 0) return -1;

		int removed = head.data;
		head = head.next;
		size--;

		if(size == 0){
			head = null;
			tail = null;
		} 

		return removed;
	}


	public int front() {
		//Implement the front() function
		if(size == 0) return -1; 
		else return head.data;
	}

	private class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

}

