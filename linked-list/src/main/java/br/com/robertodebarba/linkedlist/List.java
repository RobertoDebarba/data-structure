package br.com.robertodebarba.linkedlist;

public class List<T> {

    private Node<T> first;
    private int size;

    public void add(final T info) {
	final Node<T> newNode = new Node<T>();
	newNode.setInfo(info);
	newNode.setNext(this.first);
	this.first = newNode;

	this.size++;
    }

    public void show() {
	Node<T> currentNode = this.first;
	while (currentNode != null) {
	    System.out.println(currentNode.getInfo());
	    currentNode = currentNode.getNext();
	}
    }

    public boolean isEmpty() {
	return this.first == null;
    }

    public Node<T> get(final T info) {
	Node<T> currentNode = this.first;
	while (currentNode != null) {
	    if (currentNode.getInfo().equals(info)) {
		return currentNode;
	    }
	    currentNode = currentNode.getNext();
	}

	return null;
    }

    public void remove(final T info) {
	Node<T> previousNode = null;
	Node<T> currentNode = this.first;
	while (currentNode != null && !currentNode.getInfo().equals(info)) {
	    previousNode = currentNode;
	    currentNode = currentNode.getNext();
	}

	if (currentNode != null) {
	    if (previousNode == null) {
		this.first = currentNode.getNext();
	    } else {
		previousNode.setNext(currentNode.getNext());
	    }

	    this.size--;
	}

    }

    public int getSize() {
	return this.size;
    }

    public T getLast() {
	Node<T> currentNode = this.first;
	while (currentNode != null && currentNode.getNext() != null) {
	    currentNode = currentNode.getNext();
	}

	return currentNode.getInfo();
    }

    public Node<T> getFirst() {
	return this.first;
    }

    public Node<T> getNode(final int index) {
	Node<T> currentNode = this.first;
	int indexCount = 0;
	while (currentNode != null) {
	    if (indexCount == index) {
		return currentNode;
	    }
	    currentNode = currentNode.getNext();
	    indexCount++;
	}

	return null;
    }

    public List<T> getReverse() {
	final List<T> reverseList = new List<T>();
	Node<T> currentNode = this.first;
	while (currentNode != null) {
	    reverseList.add(currentNode.getInfo());
	    currentNode = currentNode.getNext();
	}

	return reverseList;
    }

}
