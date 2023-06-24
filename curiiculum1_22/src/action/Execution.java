package action;

import java.text.SimpleDateFormat;
import java.util.Date;

import plan.Process;

// 実行用クラスの作成
public class Execution {

	public static void main(String[] args) {

		// インスタンスを生成
		Process process = new Process();

		// 変数に代入する
		String hello = process.hello;

		// 変数に代入する
		String country = process.country;

		// 変数に代入する
		String food = process.food;

		// 変数に代入する
		String genre = process.genre;

		// こんにちは！ここは日本です！
		System.out.println(hello + "ここは" + country + "です！");

		// この寿司はうまい
		System.out.println("この" + food + "はうまい");

		// 寿司は和食です
		System.out.println(food + "は" + genre + "です");

		// 現在日時情報で初期化されたインスタンスの生成
		Date date = new Date();
		SimpleDateFormat timesDay = new SimpleDateFormat("yyyy-MM-dd H:m:s");

		// 日時情報を指定フォーマットの文字列で取得
		String display = timesDay.format(date);

		// コンソールに出力
		System.out.println("今の現在日時は" + display + "です");

	}

}
