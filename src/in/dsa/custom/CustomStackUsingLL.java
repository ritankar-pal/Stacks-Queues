package in.dsa.custom;

public class CustomStackUsingLL {

	/*
    Following is the structure of the node class for a Singly Linked List
	 */
	private class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

	}


	public class Stack {

		//Define the data members
		private Node head;
		private Node tail;
		private int size; 

		public Stack() {
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
			if(getSize() > 0) return false;
			return true;
		}

		public void push(int element) {
			//Implement the push(element) function

			Node node = new Node(element);

			node.next = head;
			head = node;
			size++;
			return;

		}

		public int pop() {
			//Implement the pop() function
			if(getSize() == 0) return -1; 

			int removed = head.data; 
			head = head.next;
			size--;
			return removed;
		}

		public int top() {
			//Implement the top() function
			if(getSize() == 0) return -1; 

			int fetch = head.data; 
			return fetch;
		}
	}
}
