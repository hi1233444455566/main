package curriculum_1_19;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Animal {

	public static void main(String[] args) {

		// Dogインスタンスを生成
		Dog d = new Dog(3);

		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。

		// コンソールに出力
		System.out.println(d.name);

		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。

		// コンソールに出力
		System.out.println(d.num);

		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください

		// 現在日時情報で初期化されたインスタンスの生成
		Date now = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd H:m:s");
		
		// 日時情報を指定フォーマットの文字列で取得
		String display = format.format(now);
		
		// コンソールに出力
		System.out.println(display);

	}
}
