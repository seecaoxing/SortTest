public class HeadSort {
	/**
	 * ����С���ѵķ����� 1������m
	 * ��Ԫ�صĶѣ�����Ѷ�Ԫ�غ�ʣ��m-1��Ԫ�ء����ѵ�Ԫ������Ѷ��������һ��Ԫ����Ѷ����н��������ѱ��ƻ�����ԭ����Ǹ���㲻����ѵ����ʡ�
	 * 2��������������������н�СԪ�صĽ��н����� 3����������������������������ѱ��ƻ������������ĸ���㲻����ѵ����ʣ����ظ����� ��2��.
	 * 4����������������������������ѱ��ƻ������������ĸ���㲻����ѵ����ʡ����ظ����� ��2��.
	 * 5�������Բ���������ʵ�����������������������ֱ��Ҷ�ӽ�㣬�ѱ����ɡ�
	 * 
	 * @param args
	 */
	/**
	 * ע����������Ҳ����˳���С����
	 * Ҫ�����󶥶ѣ���Ϊ�������ŵ�˳���Ƿ������ģ�
	 * @param args
	 */

	public static void main(String[] args) {
		int[] a = {3, 1, 5, 7, 2, 4, 9, 6 };
		HeadSort headSort = new HeadSort();
		int[] b = headSort.creatHeap(a);

		for (int i = a.length-1; i > 0; i--) {
			int t = a[0];
			a[0] = a[i];
			a[i] = t;
			headSort.headAdjust(b, 0, i);
		}
		headSort.print(b);

	}

	public int[] creatHeap(int[] a) {
		for (int i = (a.length -1)/ 2; i >= 0; i--) {
			headAdjust(a, i, a.length);
		}
		return a;
	}

	public void headAdjust(int[] a, int i, int length) {
		int temp = a[i];
		int child = 2*i+1;
		for (int j = child; j < length;) {

			if (j < length-1 && a[j] > a[j+1]) {
				j++;
			}
			if (temp < a[j]) {
				break;
			}
			a[i] = a[j];
			i = j;
			j= (j*2) +1;
		}
		a[i] = temp;

	}

	public void print(int a[]) {
		for (int j = 0; j < 8; j++) {
			System.out.println(a[j]);
		}
	}

}
