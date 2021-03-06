package Algorithm.Bilibili.BasicSort;

/**
 * Created by Elvis on 2019/12/5.
 */
public class InsertionSort {
	public static void main (String[] args) {
		int[] array = new int[] {3, 6, 13, 5, 3, 2, 7, 9};
		insertionSort(array);
		for (int i : array) {
			System.out.print(i + " ");
		}
	}

	public static void insertionSort(int[] array) {
		if (array == null || array.length < 2) {
			return;
		}

		for (int i = 1; i < array.length; i++) {
			int index = i - 1;
			int tmp = array[i];
			while (index >= 0 && tmp < array[index]) {
				array[index + 1] = array[index];
				index--;
			}
			array[index + 1] = tmp;
		}
	}

	public static void insertionSort1(int[] array) {
		if (array == null || array.length < 2) {
			return;
		}

		for (int i = 1; i < array.length; i++) {
			for (int j = i - 1; j >= 0 && array[j] > array[j + 1]; j--) {
				swap(array, j, j + 1);
			}
		}
	}

	public static void swap(int[] array, int i, int j) {
		if (i == j) {
			return;
		}
		array[i] ^= array[j];
		array[j] ^= array[i];
		array[i] ^= array[j];
	}
}
