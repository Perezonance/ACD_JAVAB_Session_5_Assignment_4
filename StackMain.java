package myPack;

public class StackMain {
	public static void main(String[] args) {
		FixedStack f1 = new FixedStack(5);
		f1.push(5);
		f1.push(7);
		f1.push(1);
		f1.printStack();
		f1.pop();
		f1.printStack();
		f1.push(3);
		f1.push(4);
		f1.printStack();
		f1.push(11);
		f1.printStack();
		f1.push(9);
		
		VariableStack f2 = new VariableStack(5);
		f2.push(8);
		f2.push(9);
		f2.push(45);
		f2.printStack();
		f2.pop();
		f2.printStack();
		f2.push(18);
		f2.push(9);
		f2.printStack();
		f2.push(32);
		f2.printStack();
		f2.push(91);
		f2.push(250);
		f2.push(17);
		f2.printStack();
	}
}
