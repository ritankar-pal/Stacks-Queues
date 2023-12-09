package in.dsa.stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class InBuildDeque {
	
	public static void main(String[] args) {
		
		Deque<Integer> deque = new ArrayDeque<>();
		
		deque.add(1);
		deque.add(2);
		deque.add(3);
		deque.add(4);
		
//		System.out.println(deque.removeLast());
		System.out.println(deque.removeFirst());
	}
}
