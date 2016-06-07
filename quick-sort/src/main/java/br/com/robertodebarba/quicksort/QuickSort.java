package br.com.robertodebarba.quicksort;

public class QuickSort<T extends Comparable<T>> {

	private final T[] info;

	public QuickSort(final T[] info) {
		this.info = info;
	}

	public void sort() {
		this.sort(0, info.length - 1);
	}

	public void sort(final int begin, final int end) {
		if (begin < end) {
			final int pivotIndex = this.partition(begin, end);
			this.sort(begin, pivotIndex - 1);
			this.sort(pivotIndex + 1, end);
		}
	}

	public int partition(final int begin, final int end) {
		int a = begin;
		int b = end + 1;
		final T pivot = info[begin];

		while (true) {
			do {
				a++;
			} while (a <= end && info[a].compareTo(pivot) < 0);

			do {
				b--;
			} while (b >= begin && info[b].compareTo(pivot) > 0);

			if (a >= b) {
				break;
			}

			this.swap(a, b);
		}

		this.swap(b, begin);
		return b;
	}

	public void swap(final int a, final int b) {
		final T temp = this.info[a];
		this.info[a] = this.info[b];
		this.info[b] = temp;
	}

}
