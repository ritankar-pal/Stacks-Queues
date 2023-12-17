package in.dsa.custom;
import java.util.Queue;


public class QueueReverse {

	public static void reverseQueue(Queue<Integer> input) {
		//Your code goes here
		
		//base condition::
		if(input.isEmpty() || input.size() == 1) return;

		int elem = input.poll();

		reverseQueue(input);

		input.add(elem);

	}
}
