package br.com.robertodebarba.queue;

public class VectorQueue<T> {

    private final T[] info;
    private final int limit;
    private int currentSize;

    @SuppressWarnings("unchecked")
    public VectorQueue(final int limit) {
	this.currentSize = 0;
	this.limit = limit;
	this.info = (T[]) new Object[limit];
    }

    public void push(final T info) {
	if (this.limit == this.currentSize) {
	    throw new RuntimeException("Queue overflow.");
	}

	this.info[this.currentSize++] = info;
    }

    public T pop() {
	if (this.isEmpty()) {
	    throw new RuntimeException("Queue is empty.");
	}

	return this.info[--this.currentSize];
    }

    public T peek() {
	if (this.isEmpty()) {
	    throw new RuntimeException("Queue is empty.");
	}

	return this.info[this.currentSize - 1];
    }

    public boolean isEmpty() {
	return this.currentSize == 0;
    }

    public void free() {
	this.currentSize = 0;
    }
}
