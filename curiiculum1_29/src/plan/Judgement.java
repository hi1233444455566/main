package plan;

import java.util.Arrays;
import java.util.Collections;

// 昇順・降順の判断
public class Judgement {

	// フィールドを作成
	private boolean judge;

	// コンストラクタを作成
	public Judgement() {

		// 値を代入
		this.judge = true;

	}

	// 並び替えが昇順か降順かを判定するメソッド
	public void referee(int p, String[] sortBy) {

		// 判定の繰り返し
		for (int i = 0; i < p; i++) {

			// 昇順と入力されている場合
			if (sortBy[i].equals("昇順")) {

				// 真を代入
				this.judge = true;

				// 降順と入力されている場合
			} else if (sortBy[i].equals("降順")) {

				// 偽を代入
				this.judge = false;

				// それ以外の場合
			} else {

				// 次の繰り返しへ
				continue;

			}

		}

	}

	// 昇順・降順に並び替えるメソッド
	public Integer[] alignment(String[] number) {

		// 並び替えた後の配列を格納する配列を宣言と初期化
		Integer[] house = new Integer[number.length - 1];

		// 昇順と判定された場合
		if (this.judge == true) {

			// 昇順に並び替え
			Arrays.sort(number);

			// 配列に格納する繰り返し
			for (int i = 0; i < number.length - 1; i++) {

				// 配列に代入（型変換）
				house[i] = Integer.parseInt(number[i]);

			}

			// 再度、昇順に並び替え
			Arrays.sort(house);

			// 降順と判定された場合
		} else {

			// 降順に並び替え
			Arrays.sort(number, Collections.reverseOrder());

			// 配列に格納する繰り返し
			for (int i = 1; i < number.length; i++) {

				// 配列に代入（型変換）
				house[i - 1] = Integer.parseInt(number[i]);

			}

			// 再度、降順に並び替え
			Arrays.sort(house, Collections.reverseOrder());

		}

		// 戻り値を返す
		return house;

	}

}
