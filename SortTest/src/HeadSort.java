public class HeadSort {
	/**
	 * 调整小顶堆的方法： 1）设有m
	 * 个元素的堆，输出堆顶元素后，剩下m-1个元素。将堆底元素送入堆顶（（最后一个元素与堆顶进行交换），堆被破坏，其原因仅是根结点不满足堆的性质。
	 * 2）将根结点与左、右子树中较小元素的进行交换。 3）若与左子树交换：如果左子树堆被破坏，即左子树的根结点不满足堆的性质，则重复方法 （2）.
	 * 4）若与右子树交换，如果右子树堆被破坏，即右子树的根结点不满足堆的性质。则重复方法 （2）.
	 * 5）继续对不满足堆性质的子树进行上述交换操作，直到叶子结点，堆被建成。
	 * 
	 * @param args
	 */
	/**
	 * 注：升序排序，也就是顺序从小到大；
	 * 要做出大顶堆，因为数组最后放的顺序是反过来的；
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
