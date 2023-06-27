package curiiculum1_31;

public class Person {
	// インスタンスフィールドを定義
	public String firstName;
	public String lastName;
	public int age;
	public double height;
	public double weight;

	// 合計人数をカウントする用の変数の宣言と初期化
	public static int num = 0;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	public Person(String firstname, String lastName, int age, double height, double weight) {

		// 引数をそれぞれ代入
		this.firstName = firstname;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;

		// 人数分回数を計測する
		++num;
	}

	// 名前結合メソッドを定義
	public String fullName() {

		// 結合した名前を返す
		return this.firstName + this.lastName;

	}

	// 計算メソッドを定義
	public double bmi() {

		// 計算式を作成
		double bmi = (this.weight / ((this.height) * (this.height)));

		// 値を返す
		return bmi;

	}

	// コンソールに出力するメソッドを定義
	public void print(double bmi) {

		// コンソールに出力する
		System.out.println("名前は" + this.firstName + "です");
		System.out.println("年は" + this.age + "です");
		System.out.println("BMIは" + String.format("%.1f", bmi) + "です");
		System.out.println("合計" + num + "人です");

	}

	// 購入メソッドを作成（問題6）
	public void buy(Car car) {

		// 引数を渡す（問題7）
		car.setOwner(this.fullName());

		// コンソールに出力する（問題8）
		System.out.println(car.getOwner() + "が購入しました");
	}

	// 購入メソッドを作成する（問題9）
	public void buy(Bicycle bicycle) {

		// 引数を渡す（問題9）
		bicycle.setOwner(this.fullName());

		// コンソールに出力する（問題9）
		System.out.println(bicycle.getOwner() + "が購入しました");
	}
}
