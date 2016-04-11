package br.com.robertodebarba.doublylinkedlist;

public class DoublyLinkedList<T> {

    private Node<T> first;

    public void add(final T info) {
	final Node<T> newNode = new Node<T>();
	newNode.setInfo(info);
	newNode.setNext(this.first);
	newNode.setPrevious(null);
	if (this.first != null) {
	    this.first.setPrevious(newNode);
	}

	this.first = newNode;
    }

    public void show() {
	Node<T> currentNode = this.first;
	while (currentNode != null) {
	    System.out.println(currentNode.getInfo());
	    currentNode = currentNode.getNext();
	}
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
	final Node<T> currentNode = this.get(info);

	if (currentNode != null) {
	    if (currentNode.equals(this.first)) {
		this.first = currentNode.getNext();
	    } else {
		currentNode.getPrevious().setNext(currentNode.getNext());
	    }

	    if (currentNode.getNext() != null) {
		currentNode.getNext().setPrevious(currentNode.getPrevious());
	    }
	}
    }

    public void clear() {
	Node<T> currentNode = this.first;
	while (currentNode != null) {
	    final Node<T> nextNode = currentNode.getNext();
	    currentNode.setPrevious(null);
	    currentNode.setNext(null);
	    currentNode = nextNode;
	}

	this.first = null;
    }

    public void showReverse() {
	Node<T> currentNode = this.first;
	while (currentNode != null && currentNode.getNext() != null) {
	    currentNode = currentNode.getNext();
	}

	while (currentNode != null) {
	    System.out.println(currentNode.getInfo());
	    currentNode = currentNode.getPrevious();
	}
    }

}
