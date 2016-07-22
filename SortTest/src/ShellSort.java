public class ShellSort {
	/**
	 * ��С�������� ����˼�룺�Ƚ�����������ļ�¼���зָ��Ϊ����
	 * �����зֱ����ֱ�Ӳ�������
	 * �����������еļ�¼����������ʱ���ٶ�ȫ���¼��������ֱ�Ӳ�������
	 *  eg: 49 ,38, 65, 97, 76 ,13 ,27 ,49, 55 ,04 
	 *  ������Ϊn/2 = 5ʱ��
	 * ������Ϊ�� {{49,13},{38,27},{65,49},{97,55},{76,04}};
	 * ���⼸�������н���ֱ�Ӳ��������������� n/4,n/8...
	 * 
	 * @param args
	 */
	/**
	 * ʵ�ַ�����ʹ�������Ȱ�һ�����зֳɼ���С���У� Ȼ����⼸��С����ʹ��ֱ�Ӳ�������Ȼ���������ϼ��٣�֪����������Ϊ1ʱ��
	 * ����������ʹ��ֱ�Ӳ������� ��������n/2,n/4,n/8...��
	 * 
	 * @param args
	 */
	
	/**
	 * ע������㷨�ھ���ʵ��ʱ��
	 * �������ȶ�һ��������������в�������������ٶ���һ�������н��У�
	 * ���Ǵӵ�1�������еĵ�2����¼��ʼ��˳��ɨ���������ż�¼���У�
	 * ��ǰ���ż�¼������һ�������У���������Ӧ���������н��С�����
	 * ���������еļ�¼���������֣����㷨����ÿһ�����������������в�������
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = { 3, 1, 5, 7, 2, 4, 9, 6 };
		// ShellInsertSort(a,8,1); //ֱ�Ӳ�������
		ShellSort shellSort = new ShellSort();
		// ϣ����������
		shellSort.print(shellSort.shellSort(a, 8));

	}

	public int[] shellSort(int[] a, int n) {
		int dk = n / 2;
		while (dk >= 1) {
			shellInsertSort(a, n, dk);
			dk = dk / 2;
		}
		return a;

	}

	public void shellInsertSort(int[] a, int n, int dk) {
		for (int i = dk; i < n; i++) {
			if (a[i] < a[i - dk]) {
				int x = a[i];
				int j = i - dk;
				while (j >= 0 && x < a[j]) {
					a[j + dk] = a[j];
					j -= dk;
				}
				a[j + dk] = x;
			} else {

			}

		}

	}

	public void print(int a[]) {
		for (int j = 0; j < 8; j++) {
			System.out.println(a[j]);
		}
	}
}
