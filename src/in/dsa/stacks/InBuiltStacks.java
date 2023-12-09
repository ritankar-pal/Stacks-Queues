package in.dsa.stacks;
import java.util.Stack;

//LIFO
public class InBuiltStacks {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(4);
		stack.push(3);
		stack.push(2);
		stack.push(1);
		
		stack.peek();
		
		System.out.println(stack.pop());	//4
		System.out.println(stack.pop());	//3
//		stack.forEach(System.out::println);
	}

}
