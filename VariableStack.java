package myPack;

public class VariableStack implements IStack {

	private int[] stack;
	private int index;
	
	public VariableStack(int size){
		this.stack = new int[size];
		this.index = 0;
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

	@Override
	public void push(int i) {
		// TODO Auto-generated method stub
		if(this.index >= this.stack.length){
			int[] tempStack = new int[this.stack.length + 1];
			for(int j = 0; j < this.stack.length; j++){
				tempStack[j] = this.stack[j];
			}
			stack = tempStack;
		}
		this.stack[index] = i;
		index++;
	}
	
	@Override
	public void printStack(){
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
