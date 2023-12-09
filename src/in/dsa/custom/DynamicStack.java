package in.dsa.custom;

public class DynamicStack extends CustomStack {
	
	public DynamicStack() {
		super();
	}
	
	public DynamicStack(int size) {
		super(size);
	}
	
	@Override
	public boolean push(int item) {
		
		if(this.isFull()) {
			
			//double the array size and copy all the elements of previous to the new array:: 
			int[] temp = new int[data.length * 2];
			
			for(int i = 0; i < data.length; i++) {
				temp[i] = data[i];
			}
			
			data = temp;
		}
		
		return super.push(item);
		
	}
	
	
	
	
}
