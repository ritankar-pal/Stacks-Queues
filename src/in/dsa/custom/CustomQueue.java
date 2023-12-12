package in.dsa.custom;

public class CustomQueue {

	private static final int DEFAULT_SIZE = 10; 
	
	int[] data; 
	int end = 0;

	public CustomQueue() {
		this(DEFAULT_SIZE);
	}

	public CustomQueue(int size) {
		this.data = new int[size];
	}

	public boolean isFull() {
		return end == data.length; //ptr is at last index
	}
	
	public boolean insert(int item) {

		if(isFull()) {
			System.out.println("Queue is Full");
			return false;
		}
		
		data[end++] = item;
		return true;
		
	}
	
	
	public int remove() throws Exception {
		if(isEmpty()) throw new Exception("Empty Queue");
		
		int removed = data[0];
		
		for(int i = 1; i < end; i++) {
			data[i-1] = data[i];
		}
		end--;
		
		return removed;
	}
	
	
	public int front() throws Exception {
		if(isEmpty()) throw new Exception("Empty Queue");
		return data[0];
	}
	
	public void display() {
		for(int i = 0; i < end; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.print("END");
	}
	
	public boolean isEmpty() {
		return end == 0;
	}

}
