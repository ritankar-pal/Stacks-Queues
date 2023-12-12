package in.dsa.problems;
import java.util.Stack;

public class MinimumBracketReversal {

	public static int countBracketReversals(String input) {
		//Your code goes here
		if(input.length() % 2 != 0) return -1; 

		Stack<Character> stack = new Stack<>();

		for(int i = 0; i < input.length(); i++){

			if(input.charAt(i) == '{'){
				stack.push(input.charAt(i));
			}
			else{ //if stack has a closing bracket -> '}'
				if(!stack.isEmpty()){
					if(stack.peek() == '{') stack.pop();
					else stack.push(input.charAt(i));
				}
				else{
					stack.push(input.charAt(i));
				}
			}
		}

		int count = 0; 
		
		//If stack has only odd no of brackets::
		if(stack.size() % 2 != 0) return -1;

		while(!stack.isEmpty()){
			char c1 = stack.pop();
			char c2 = stack.pop();

			if(c1 == c2) count++;
			else count = count + 2;
		}

		return count;

	}

}
