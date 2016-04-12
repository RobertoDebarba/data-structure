package br.com.robertodebarba.stack;

public class Main {

    public static void main(final String[] args) {
	System.out.println("Vector Stack");

	final VectorStack<Integer> stack1 = new VectorStack<Integer>(5);
	stack1.push(0);
	stack1.push(1);
	stack1.push(2);
	stack1.push(3);
	stack1.push(4);

	System.out.println(stack1.peek());

	System.out.println(stack1.pop());
	System.out.println(stack1.pop());
	System.out.println(stack1.pop());
	System.out.println(stack1.pop());
	System.out.println(stack1.pop());

	System.out.println(stack1.isEmpty());

	stack1.push(0);
	stack1.free();
	System.out.println(stack1.isEmpty());

	System.out.println("List Stack");

	final ListStack<Integer> stack2 = new ListStack<Integer>();
	stack2.push(0);
	stack2.push(1);
	stack2.push(2);
	stack2.push(3);
	stack2.push(4);

	System.out.println(stack2.peek());

	System.out.println(stack2.pop());
	System.out.println(stack2.pop());
	System.out.println(stack2.pop());
	System.out.println(stack2.pop());
	System.out.println(stack2.pop());

	System.out.println(stack2.isEmpty());

	stack2.push(0);
	stack2.free();
	System.out.println(stack2.isEmpty());
    }

}
