public class InsertSort {

	/**
	 * 插入排序的主要流程就是使用了两层循环，
	 * 第一层循环是按照数组顺序一个一个往后走，
	 * 第二层循环的作用是当遇到一个比前面小的数字，
	 * 然后查看它是不是还可以往前移所以在这又使用了一层循环。 
	 * 时间复杂度：O（n^2）
	 * 
	 * @param args
	 */
	
	
	
	/**
	 * 实现思想：将一个记录插入到已排序好的有序表中，从而得到一个新，记录数增1的有序表。即：先将序列的第1个记录看成是一个有序的子序列，
	 * 然后从第2个记录逐个进行插入，直至整个序列有序为止。 要点：设立哨兵，作为临时存储和判断数组边界之用。
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
			if (a[i] < a[i - 1]) {// 第一层循环时，看这个数是不是要往前移。
				int j = i - 1;
				int x = a[i]; // 设置哨兵，这个数为待排序数字
				a[i] = a[i - 1];
				while (x < a[j]) {
					a[j + 1] = a[j];
					j--;
					if (j == -1) { // 防止数组越界
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
