package br.com.robertodebarba.optimizedbubblesort;

public class OptimizedBubbleSort<T extends Comparable<T>> {

	public void sort(final T[] info) {
		boolean changed = false;
		final int n = info.length;
		for (int i = n - 1; i >= 1; i--) {
			changed = false;
			for (int j = 0; j <= i - 1; j++) {
				if (info[j].compareTo(info[j + 1]) > 0) {
					final T temp = info[j];
					info[j] = info[j + 1];
					info[j + 1] = temp;
					changed = true;
				}
			}
			if (!changed) {
				return;
			}
		}
	}

}
