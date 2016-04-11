package br.com.robertodebarba.linkedlist;

public class Main {

    public static void main(final String[] args) {
	System.out.println("LinkedList");

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

	System.out.println("Recursive LinkedList");

	final RecursiveList<Integer> recursiveList = new RecursiveList<Integer>();

	recursiveList.add(0);
	recursiveList.add(1);
	recursiveList.add(2);
	recursiveList.add(3);
	recursiveList.add(4);

	recursiveList.show();

	recursiveList.remove(4);
	recursiveList.remove(2);

	recursiveList.show();

    }

}
