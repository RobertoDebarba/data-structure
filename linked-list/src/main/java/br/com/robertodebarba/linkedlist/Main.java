package br.com.robertodebarba.linkedlist;

public class Main {

    public static void main(final String[] args) {
	final List<Integer> list = new List<Integer>();
	list.add(0);
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);

	list.show();

	System.out.println(list.isEmpty());

	System.out.println(list.get(2).getInfo());

	System.out.println(list.getSize());

	System.out.println(list.getLast());

	System.out.println(list.getFirst().getInfo());

	System.out.println(list.getNode(2).getInfo());

	list.remove(2);

	list.show();

	list.getReverse().show();

	list.addOrderly(2);

	list.show();

    }

}
