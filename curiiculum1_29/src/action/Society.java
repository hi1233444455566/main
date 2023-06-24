package action;

import java.util.Scanner;

import plan.Judgement;
import plan.Map;

// 社会
public class Society {

	public static void main(String[] args) {

		// インスタンスを生成
		Scanner scanner = new Scanner(System.in);
		Judgement judgement = new Judgement();
		Map map = new Map();

		// コンソールに入力された文字を取得
		String[] number = scanner.nextLine().split(",");

		// 文字列型の配列を型変換するための数値型配列を宣言と初期化
		Integer[] num = new Integer[number.length - 1];

		// 並び替えが昇順か降順か判定するメソッドを呼び出し
		judgement.referee(number.length, number);

		// 昇順・降順に並び替えるメソッドを呼び出し、数値型配列に戻り値を代入
		num = judgement.alignment(number);

		// 情報表示の繰り返し処理
		for (int a : num) {

			// 地図情報を出力するメソッドの呼び出し	
			map.text(a);

		}

		// 閉じる
		scanner.close();

	}
}
