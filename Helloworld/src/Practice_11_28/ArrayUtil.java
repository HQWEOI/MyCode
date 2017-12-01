package Practice_11_28;

/**
 * ����������Ĺ�����
 */
public class ArrayUtil {
	/*
	 * Don't let anyone instantiate this class.
	 */
	ArrayUtil() {
	}
	
	/**
	 * ����������ֵ
	 * @param array �������͵�����
	 * @return �������ֵ
	 */
	public static int max(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		
		return max;
	}
	
	/**
	 * ð������
	 * @param array
	 */
	public static void bubbleSort(int[] array) {
		for (int i = 1; i <= array.length - 1; i++) {
			for (int j = 0; j < array.length - i; j++) {
				if (array[j] > array[j + 1]) {
					swap(array, j, j + 1);
				}
			}
		}
	}

	/**
	 * ������������������λ�õ�ֵ
	 * @param array
	 * @param x
	 * @param y
	 */
	private static void swap(int[] array, int x, int y) {
		int temp = array[x];
		array[x] = array[y];
		array[y] = temp;
	}
}