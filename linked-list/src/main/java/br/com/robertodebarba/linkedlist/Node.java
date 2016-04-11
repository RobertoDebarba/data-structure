package br.com.robertodebarba.linkedlist;

public class Node<T> {

    private T info;
    private Node<T> next;

    public T getInfo() {
	return info;
    }

    public void setInfo(final T info) {
	this.info = info;
    }

    public Node<T> getNext() {
	return next;
    }

    public void setNext(final Node<T> nextNode) {
	this.next = nextNode;
    }

}
