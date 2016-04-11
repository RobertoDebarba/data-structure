package br.com.robertodebarba.doublylinkedlist;

public class Main {

    public static void main(final String[] args) {
	final DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();

	list.add(0);
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);

	list.show();

	System.out.println(list.get(2).getInfo());

	list.remove(2);

	list.show();

	list.showReverse();

	list.clear();

	list.show();

    }

}
