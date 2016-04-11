package br.com.robertodebarba.queue;

import java.util.ArrayList;
import java.util.List;

public class ListQueue<T> {

    private final List<T> info = new ArrayList<T>();

    public void push(final T info) {
	this.info.add(info);
    }

    public T pop() {
	if (this.isEmpty()) {
	    throw new RuntimeException("Queue is empty.");
	}

	final T lastInfo = this.info.get(this.info.size() - 1);
	this.info.remove(lastInfo);
	return lastInfo;
    }

    public T peek() {
	if (this.isEmpty()) {
	    throw new RuntimeException("Queue is empty.");
	}

	return this.info.get(this.info.size() - 1);
    }

    public boolean isEmpty() {
	return this.info.isEmpty();
    }

    public void free() {
	this.info.clear();
    }

}
