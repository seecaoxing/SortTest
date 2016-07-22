public class ShellSort {
	/**
	 * 缩小增量排序 基本思想：先将整个待排序的记录序列分割成为若干
	 * 子序列分别进行直接插入排序，
	 * 待整个序列中的记录“基本有序”时，再对全体记录进行依次直接插入排序。
	 *  eg: 49 ,38, 65, 97, 76 ,13 ,27 ,49, 55 ,04 
	 *  当增量为n/2 = 5时，
	 * 子序列为： {{49,13},{38,27},{65,49},{97,55},{76,04}};
	 * 对这几个子序列进行直接插入排序，依次下来 n/4,n/8...
	 * 
	 * @param args
	 */
	/**
	 * 实现方法：使用增量先把一个序列分成几个小序列， 然后给这几个小序列使用直接插入排序，然后增量不断减少，知道增量减少为1时，
	 * 整个序列来使用直接插入排序。 （增量：n/2,n/4,n/8...）
	 * 
	 * @param args
	 */
	
	/**
	 * 注意事项：算法在具体实现时，
	 * 并不是先对一个子序列完成所有插入排序操作，再对另一个子序列进行，
	 * 而是从第1个子序列的第2条记录开始，顺序扫描整个待排记录序列，
	 * 当前待排记录属于哪一个子序列，就在它相应的子序列中进行。所以
	 * 各个子序列的记录会轮流出现，既算法将在每一个子序列中轮流进行插入排序。
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = { 3, 1, 5, 7, 2, 4, 9, 6 };
		// ShellInsertSort(a,8,1); //直接插入排序
		ShellSort shellSort = new ShellSort();
		// 希尔插入排序
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
