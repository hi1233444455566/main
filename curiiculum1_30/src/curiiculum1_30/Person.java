package curiiculum1_30;

public class Person {
	// インスタンスフィールドを定義
	public String name;
	public int age;
	public double height;
	public double weight;

	// 合計人数をカウントする用の変数の宣言と初期化
	public static int num = 0;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	public Person(String name, int age, double height, double weight) {

		// 引数をそれぞれ代入
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;

		// 人数分回数を増やす
		++num;

	}

	// メソッドを定義
	public double bmi() {

		// 計算式を作成
		double bmi = (this.weight / ((this.height) * (this.height)));

		// 値を返す
		return bmi;

	}

	// コンソールに出力するメソッドを定義
	public void print(double bmi) {

		// コンソールに出力する
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		System.out.println("BMIは" + String.format("%.1f", bmi) + "です");
		System.out.println("合計" + num + "人です");

	}

}
