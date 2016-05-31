package br.com.robertodebarba.bubblesort;

public class BubbleSort<T extends Comparable<T>> {

	public static void main(final String[] args) {
		final Integer[] info = new Integer[] { 1, 4, 7, 2, 5, 3 };
		new BubbleSort<Integer>().sort(info);
		for (final int i : info) {
			System.out.println(i);
		}
	}

	public void sort(final T[] info) {
		for (int i = info.length - 1; i >= 1; i--) {
			for (int j = 0; j <= i - 1; j++) {
				if (info[j].compareTo(info[j + 1]) > 0) {
					final T temp = info[j];
					info[j] = info[j + 1];
					info[j + 1] = temp;
				}
			}
		}
	}

}
