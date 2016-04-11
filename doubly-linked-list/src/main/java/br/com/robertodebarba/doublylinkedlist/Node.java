package br.com.robertodebarba.doublylinkedlist;

public class Node<T> {

    private T info;
    private Node<T> previous;
    private Node<T> next;

    public T getInfo() {
	return info;
    }

    public void setInfo(final T info) {
	this.info = info;
    }

    public Node<T> getPrevious() {
	return previous;
    }

    public void setPrevious(final Node<T> previous) {
	this.previous = previous;
    }

    public Node<T> getNext() {
	return next;
    }

    public void setNext(final Node<T> next) {
	this.next = next;
    }

}
