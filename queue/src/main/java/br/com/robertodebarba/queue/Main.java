package br.com.robertodebarba.queue;

public class Main {

    public static void main(final String[] args) {
	System.out.println("Vector Queue");

	final VectorQueue<Integer> vectorQueue = new VectorQueue<Integer>(5);

	vectorQueue.enqueue(0);
	vectorQueue.enqueue(1);
	vectorQueue.enqueue(2);
	vectorQueue.enqueue(3);
	vectorQueue.enqueue(4);

	System.out.println(vectorQueue.peek());

	System.out.println(vectorQueue.dequeue());
	System.out.println(vectorQueue.dequeue());
	System.out.println(vectorQueue.dequeue());
	System.out.println(vectorQueue.dequeue());
	System.out.println(vectorQueue.dequeue());

	System.out.println(vectorQueue.isEmpty());

	vectorQueue.enqueue(2);
	vectorQueue.free();

	System.out.println(vectorQueue.isEmpty());

	System.out.println("List Queue");

	final ListQueue<Integer> listQueue = new ListQueue<Integer>();

	listQueue.enqueue(0);
	listQueue.enqueue(1);
	listQueue.enqueue(2);
	listQueue.enqueue(3);
	listQueue.enqueue(4);

	System.out.println(listQueue.peek());

	System.out.println(listQueue.dequeue());
	System.out.println(listQueue.dequeue());
	System.out.println(listQueue.dequeue());
	System.out.println(listQueue.dequeue());
	System.out.println(listQueue.dequeue());

	System.out.println(listQueue.isEmpty());

	listQueue.enqueue(2);
	listQueue.free();

	System.out.println(listQueue.isEmpty());
    }

}
