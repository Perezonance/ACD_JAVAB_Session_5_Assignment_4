package myPack;

public class FixedStack implements IStack{
	private int[] stack;
	private int index = 0;
	//The Fixed Stack Size is 5
	public FixedStack(int size){
		stack = new int[size];
	}
	
	
	@Override
	public void push(int i) {
		// TODO Auto-generated method stub
		if(index >= stack.length){
			System.out.println("Stack Overflow!");
		}else{
			this.stack[index] = i;
			index++;
		}
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		if(index == 0){
			return 0;
		}else{
			index--;
			return stack[index];	
		}
	}


	public void printStack() {
		// TODO Auto-generated method stub
		System.out.print("[");
		for(int i = 0; i < index; i++){
			if(i == index-1)
				System.out.print(stack[i]);
			else
				System.out.print(stack[i] + ", ");
		}
		System.out.println("]");
		
	}

}
