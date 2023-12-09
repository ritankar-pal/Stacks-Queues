package in.dsa.stacks;
import java.util.LinkedList;
import java.util.Queue;

//FIFO
public class InBuiltQueue {
	
	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>();
		
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		
		System.out.println(queue.remove());  //1
	}
}
