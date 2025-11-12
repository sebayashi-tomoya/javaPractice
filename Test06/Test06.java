/**
 * 最小値、最大値、平均値を求める
 */
public class Test06 {
	public static void main(String[] args) {
		int[] scoreList = { 59, 86, 67, 25, 56, 93, 45 };

		System.out.println("最小値は " + min(scoreList));
		System.out.println("最大値は " + max(scoreList));
		System.out.println("平均値は " + average(scoreList));
	}

	/**
	 * 最小値を求める
	 * 
	 * @param list 数値配列
	 * @return 最小値
	 */
	private static int min(int[] list) {
		// 最大値を仮置き
		int minValue = Integer.MAX_VALUE;

		/* 解答記入位置ここから */

		// listの要素を一つ一つ確認するためのループ
		for (int i : list) {

			// minValueと比較して要素の方が小さければ変数に入れて値を保持しておく
			if (minValue > i) {
				minValue = i;
			}
		}

		// 保持しておいた最小値を返す
		return minValue;

		/* 解答記入位置ここまで */
	}

	/**
	 * 最大値を求める
	 * 
	 * @param list 数値配列
	 * @return 最大値
	 */
	private static int max(int[] list) {
		// 最小値を仮置き
		int maxValue = 0;

		/* 解答記入位置ここから */

		// listの要素を一つ一つ確認するためのループ
		for (int i : list) {

			// maxValueと比較して要素の方が小さければ変数に入れて値を保持しておく
			if (maxValue < i) {
				maxValue = i;
			}
		}

		// 保持しておいた最小値を返す
		return maxValue;

		/* 解答記入位置ここまで */
	}

	/**
	 * 平均値を求める
	 * 
	 * @param list 数値配列
	 * @return 平均値
	 */
	private static double average(int[] list) {
		double total = 0;

		/* 解答記入位置ここから */

		// listの要素の合計を求めるためのループ
		for (int i : list) {
			total += i;
		}

		// 合計値 ÷ listの個数 を計算して返す
		return total / list.length;

		/* 解答記入位置ここまで */
	}
}
