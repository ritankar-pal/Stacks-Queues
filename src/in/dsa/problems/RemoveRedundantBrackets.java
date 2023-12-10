package in.dsa.problems;
import java.util.*;


public class RemoveRedundantBrackets {

	private static boolean findChar(char ch){
		if(ch == '+' || ch == '-' || ch == '*' || ch == '/') return true;
		else return false;
	}

	public static boolean checkRedundantBrackets(String expression) {
		//Your code goes here
		Stack<Character> stack = new Stack<>();

		for(int i = 0; i < expression.length(); i++){

			if(expression.charAt(i) == '(' || findChar(expression.charAt(i))){
				stack.push(expression.charAt(i));
			}
			else if(expression.charAt(i) == ')'){

				boolean hasOperator = false;

				while(!stack.isEmpty() && stack.peek() != '('){
					stack.pop();
					hasOperator = true;
				}

				if(hasOperator == false){
					return true;
				}

				if(!stack.isEmpty()) stack.pop();

			}	

		}

		return false;
	}
}
