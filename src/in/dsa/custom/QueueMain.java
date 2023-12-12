package in.dsa.custom;

public class QueueMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		CustomQueue queue = new CustomQueue(5);
//		
//		queue.insert(1);
//		queue.insert(2);
//		queue.insert(3);
//		queue.insert(4);
//		queue.insert(5);
//		
//		queue.display();
		
		CustomCircularQueue queue = new CustomCircularQueue(5);
		
		queue.insert(1);
		queue.insert(2);
		queue.insert(3);
		queue.insert(4);
		queue.insert(5);
		queue.display();
		
		queue.remove();
		queue.display();
		
		queue.insert(6);
		queue.display();
		
	}

}
