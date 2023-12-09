package in.dsa.custom;

public class TestApp {
	
	public static void main(String[] args) throws Exception {
		
//		CustomStack customStack = new CustomStack(4);
//		
//		customStack.push(4);
//		customStack.push(3);
//		customStack.push(2);
//		customStack.push(1);
		
		DynamicStack dynamicStack = new DynamicStack(4);
		
		dynamicStack.push(6);
		dynamicStack.push(5);
		dynamicStack.push(4);
		dynamicStack.push(3);
		dynamicStack.push(2);
		dynamicStack.push(1);
		
		System.out.println(dynamicStack.pop());
		System.out.println(dynamicStack.pop());
		System.out.println(dynamicStack.pop());
		System.out.println(dynamicStack.pop());
		System.out.println(dynamicStack.pop());
		System.out.println(dynamicStack.pop());
	}
}
