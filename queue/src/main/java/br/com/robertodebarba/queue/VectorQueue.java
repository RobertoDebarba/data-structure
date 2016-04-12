package br.com.robertodebarba.queue;

public class VectorQueue<T> {

    private final T[] info;
    private final int limit;
    private int currentSize;
    private int startPosition;

    @SuppressWarnings("unchecked")
    public VectorQueue(final int limit) {
	this.limit = limit;
	this.info = (T[]) new Object[limit];
	this.currentSize = 0;
	this.startPosition = 0;
    }

    public void enqueue(final T info) {
	if (this.currentSize == this.limit) {
	    throw new RuntimeException("Queue overflow!");
	}

	this.info[(this.startPosition + this.currentSize) % this.limit] = info;
	this.currentSize++;
    }

    public T dequeue() {
	if (this.isEmpty()) {
	    throw new RuntimeException("Queue is empty!");
	}

	final T value = this.info[this.startPosition];
	this.startPosition = (this.startPosition + 1) % limit;
	this.currentSize--;
	return value;
    }

    public T peek() {
	if (this.isEmpty()) {
	    throw new RuntimeException("Queue is empty!");
	}

	return this.info[this.startPosition];
    }

    public boolean isEmpty() {
	return this.currentSize == 0;
    }

    public void free() {
	this.currentSize = 0;
	this.startPosition = 0;
    }

}
