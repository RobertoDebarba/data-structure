package br.com.robertodebarba.queue;

public class Main {

    public static void main(final String[] args) {
	System.out.println("Vector Queue");

	final VectorQueue<Integer> queue1 = new VectorQueue<Integer>(5);
	queue1.push(0);
	queue1.push(1);
	queue1.push(2);
	queue1.push(3);
	queue1.push(4);

	System.out.println(queue1.peek());

	System.out.println(queue1.pop());
	System.out.println(queue1.pop());
	System.out.println(queue1.pop());
	System.out.println(queue1.pop());
	System.out.println(queue1.pop());

	System.out.println(queue1.isEmpty());

	queue1.push(0);
	queue1.free();
	System.out.println(queue1.isEmpty());

	System.out.println("List Queue");

	final ListQueue<Integer> queue2 = new ListQueue<Integer>();
	queue2.push(0);
	queue2.push(1);
	queue2.push(2);
	queue2.push(3);
	queue2.push(4);

	System.out.println(queue2.peek());

	System.out.println(queue2.pop());
	System.out.println(queue2.pop());
	System.out.println(queue2.pop());
	System.out.println(queue2.pop());
	System.out.println(queue2.pop());

	System.out.println(queue2.isEmpty());

	queue2.push(0);
	queue2.free();
	System.out.println(queue2.isEmpty());
    }

}
