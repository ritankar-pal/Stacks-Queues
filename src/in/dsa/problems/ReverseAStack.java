package in.dsa.problems;
import java.util.Stack;



public class ReverseAStack {

	public static void reverseStack(Stack<Integer> input, Stack<Integer> helper) {
		//Your code goes here

		//base condition::
		if(input.isEmpty() || input.size() == 1) return;

		int temp = input.pop();

		reverseStack(input, helper);

		while(!input.isEmpty()){
			helper.push(input.pop());
		}

		input.push(temp);

		while(!helper.isEmpty()){
			input.push(helper.pop());
		}

	}

}
