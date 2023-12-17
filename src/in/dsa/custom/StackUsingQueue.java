package in.dsa.custom;
import java.util.LinkedList;
import java.util.Queue;


public class StackUsingQueue {
	
	private static class Stack{
		
		Queue<Integer> q1;
		Queue<Integer> q2;
		
		public Stack() {
			q1 = new LinkedList<>();
			q2 = new LinkedList<>();
		}
		
		public int getSize() { 
	        //Implement the getSize() function
	        return q1.size();
	    }

	    public boolean isEmpty() {
	        //Implement the isEmpty() function
	        return q1.size() == 0;
	    }

	    public void push(int element) {
	        //Implement the push(element) function
	        q1.add(element);
	    }

	    public int pop() {
	        //Implement the pop() function
	        if(isEmpty()) return -1; 

	        //removing the elems q1 to q2 until 1 elem is left in q1::
	        while(q1.size() != 1){
	            q2.add(q1.poll());
	        }

	        int removed = q1.poll();

	        //refilling q1 with the elements of q2::
	        while(q2.size() != 0){
	            q1.add(q2.poll());
	        }

	        return removed;
	    }

	    public int top() {
	        //Implement the top() function
	        if(isEmpty()) return -1;

	        //removing the elems q1 to q2 until 1 elem is left in q1::
	        while(q1.size() != 1){
	            q2.add(q1.poll());
	        }

	        int elem = q1.poll();

	        //refilling q1 with the elements of q2::
	        while(q2.size() != 0){
	            q1.add(q2.poll());
	        }   

	        q1.add(elem);

	        return elem;
	    }
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack stack = new Stack();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		System.out.println(stack.top());
		System.out.println(stack.getSize());
	
	}

}
