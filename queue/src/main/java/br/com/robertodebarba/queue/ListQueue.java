package br.com.robertodebarba.queue;

import java.util.ArrayList;
import java.util.List;

public class ListQueue<T> {

    private final List<T> info = new ArrayList<T>();

    public void enqueue(final T info) {
	this.info.add(info);
    }

    public T dequeue() {
	if (this.isEmpty()) {
	    throw new RuntimeException("Queue is empty!");
	}

	final T value = this.info.get(0);
	this.info.remove(0);
	return value;
    }

    public T peek() {
	if (this.isEmpty()) {
	    throw new RuntimeException("Queue is empty!");
	}

	return this.info.get(0);
    }

    public boolean isEmpty() {
	return this.info.size() == 0;
    }

    public void free() {
	this.info.clear();
    }

}
