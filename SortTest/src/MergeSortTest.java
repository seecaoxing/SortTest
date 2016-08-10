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
	 * @param copyLͬ���͵ļ�¼���ڸ��Ʊ���ԭ��¼����
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
			copyL[j] = l[j];        //��ʱ��ż�¼
		}
		p1 = left;   //�󲿷������¼����ʼλ��
		p2 = middle + 1;   //�Ҳ��������¼����ʼλ��
		i = left;          //����߿�ʼ�鲢
		while (p1 <= middle && p2 <= right) {
			// ȡ����������С���Ǹ���¼
			if (copyL[p1] <= copyL[p2]) {
				l[i] = copyL[p1];
				p1++;
			} else {
				l[i] = copyL[p2];
				p2++;
			}
			i++;
		}
		// ��ʣ�µļ�¼���������У�ֱ�Ӹ��ƾ���
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
