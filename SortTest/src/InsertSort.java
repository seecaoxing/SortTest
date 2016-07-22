public class InsertSort {

	/**
	 * �����������Ҫ���̾���ʹ��������ѭ����
	 * ��һ��ѭ���ǰ�������˳��һ��һ�������ߣ�
	 * �ڶ���ѭ���������ǵ�����һ����ǰ��С�����֣�
	 * Ȼ��鿴���ǲ��ǻ�������ǰ������������ʹ����һ��ѭ���� 
	 * ʱ�临�Ӷȣ�O��n^2��
	 * 
	 * @param args
	 */
	
	
	
	/**
	 * ʵ��˼�룺��һ����¼���뵽������õ�������У��Ӷ��õ�һ���£���¼����1������������Ƚ����еĵ�1����¼������һ������������У�
	 * Ȼ��ӵ�2����¼������в��룬ֱ��������������Ϊֹ�� Ҫ�㣺�����ڱ�����Ϊ��ʱ�洢���ж�����߽�֮�á�
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		int[] array = { 3, 1, 5, 7, 2, 4, 9, 6 };
		InsertSort insertSort = new InsertSort();
		insertSort.print(insertSort.insertSort(array, 8));
	}

	public int[] insertSort(int[] a, int n) {
		for (int i = 1; i < n; i++) {
			if (a[i] < a[i - 1]) {// ��һ��ѭ��ʱ����������ǲ���Ҫ��ǰ�ơ�
				int j = i - 1;
				int x = a[i]; // �����ڱ��������Ϊ����������
				a[i] = a[i - 1];
				while (x < a[j]) {
					a[j + 1] = a[j];
					j--;
					if (j == -1) { // ��ֹ����Խ��
						break;
					}
				}
				a[j + 1] = x;
			} else {

			}
		}
		return a;
	}

	public void print(int a[]) {
		for (int j = 0; j < 8; j++) {
			System.out.println(a[j]);
		}
	}
}
