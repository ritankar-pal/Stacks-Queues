package in.dsa.custom;
import java.util.*;


public class QueueReverseFirstKElements {
	
	private static Queue<Integer> reverseQueue(Queue<Integer> queue){

		if(queue.isEmpty() || queue.size() == 1) return queue;

		int elem = queue.poll();

		Queue<Integer> output = reverseQueue(queue);

		output.add(elem);

		return output;
	}
	
	
	public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
		//Your code goes here

		if(k == 0 || k > input.size()) return input;
		
		if(k == input.size()){
			return reverseQueue(input);
		}

		Queue<Integer> queue = new LinkedList<>();
		Queue<Integer> remQueue = new LinkedList<>();

		for(int i = 0; i < k; i++){
			queue.add(input.poll());
		}

		while(!input.isEmpty()){
			remQueue.add(input.poll());
		}

		Queue<Integer> revQueue = reverseQueue(queue);

		while(!revQueue.isEmpty()){
			input.add(revQueue.poll());
		}

		while(!remQueue.isEmpty()){
			input.add(remQueue.poll());
		}

		return input;

	}
}
