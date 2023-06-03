package curriculum_1_19;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Animal {

	public static void main(String[] args) {

		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。

		// Dogインスタンスを生成
		Dog f = new Dog();

		// 変数に代入する
		String name = f.name;

		// コンソールに出力
		System.out.println(name);

		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。

		// Dogインスタンスを生成
		Dog d = new Dog(3);

		// 変数に代入する
		int num = d.num;

		// コンソールに出力
		System.out.println(num);

		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください

		// 現在日時情報で初期化されたインスタンスの生成
		Date clock = new Date();
		SimpleDateFormat timesDay = new SimpleDateFormat("yyyy-MM-dd H:m:s");

		// 日時情報を指定フォーマットの文字列で取得
		String display = timesDay.format(clock);

		// コンソールに出力
		System.out.println(display);

	}
}
