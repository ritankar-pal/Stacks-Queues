package in.dsa.problems;
import java.util.Stack;


public class BracketsAreBalanced {

	public class Solution {

	    public static boolean isBalanced(String expression) {
	        //Your code goes here
	        int n = expression.length();
	        if(n % 2 != 0) return false;

	        if(expression.charAt(0) == ')') return false;
	        
	
	        //creating a stack to store opening brackets::
	        Stack<Character> stack = new Stack<>();

	        for(int i = 0; i < n; i++){
	            if(expression.charAt(i) == '('){
	                stack.push(expression.charAt(i));
	            }
	            else{
	                if( !stack.isEmpty() ){

	                    if(stack.peek() != '(') return false;
	                    else stack.pop();
	                }
	                else{
	                    return false;
	                }
	            }
	        }

	        if(stack.size() == 0) return true;
	        else return false;

	    }
	}
}
