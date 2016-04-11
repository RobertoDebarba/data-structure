package br.com.robertodebarba.linkedlist;

public class RecursiveList<T> {

    private Node<T> first;

    public void add(final T info) {
	final Node<T> newNode = new Node<T>();
	newNode.setInfo(info);
	newNode.setNext(this.first);
	this.first = newNode;
    }

    public void show() {
	this.show(this.first);
    }

    private void show(final Node<T> node) {
	if (node != null) {
	    System.out.println(node.getInfo());
	    this.show(node.getNext());
	}

    }

    public void remove(final T info) {
	this.first = this.remove(info, this.first);
    }

    private Node<T> remove(final T info, Node<T> node) {
	if (node != null) {
	    if (node.getInfo().equals(info)) {
		node = node.getNext();
	    } else {
		node.setNext(this.remove(info, node.getNext()));
	    }
	}

	return node;
    }

}
