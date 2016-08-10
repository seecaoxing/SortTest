public class MergeSortTest {

	public static void main(String[] args) {
		int[] a = { 3, 1, 5, 7, 2, 4, 9, 6 };
		int[] b = new int[8];
		MergeSortTest mergeSortTest = new MergeSortTest();
		mergeSortTest.print(mergeSortTest.MergeSort(a, b, 0, 7));

	}

	/**
	 * 
	 * @param l
	 * @param copyL同类型的记录用于复制保存原记录序列
	 * @param left
	 * @param right
	 * @return
	 */
	public int[] MergeSort(int[] l, int[] copyL, int left, int right) {
		int middle;
		if (left < right) {
			middle = (left + right) / 2;
			MergeSort(l, copyL, left, middle);
			MergeSort(l, copyL, middle + 1, right);
			Merge(l, copyL, left, right, middle);
		}

		return l;
	}

	
	public int[] Merge(int[] l, int[] copyL, int left, int right, int middle) {
		int i, p1, p2;
		for (int j = left; j <= right; j++) {
			copyL[j] = l[j];        //临时存放记录
		}
		p1 = left;   //左部分有序记录的起始位置
		p2 = middle + 1;   //右部分有序记录的起始位置
		i = left;          //从左边开始归并
		while (p1 <= middle && p2 <= right) {
			// 取两个序列中小的那个记录
			if (copyL[p1] <= copyL[p2]) {
				l[i] = copyL[p1];
				p1++;
			} else {
				l[i] = copyL[p2];
				p2++;
			}
			i++;
		}
		// 将剩下的记录放入序列中，直接复制就行
		while (p1 <= middle) {
			l[i] = copyL[p1];
			i++;
			p1++;
		}
		while (p2 <= right) {
			l[i] = copyL[p2];
			i++;
			p2++;
		}
		return l;
	}

	public void print(int a[]) {
		for (int j = 0; j < 8; j++) {
			System.out.println(a[j]);
		}
	}

}
