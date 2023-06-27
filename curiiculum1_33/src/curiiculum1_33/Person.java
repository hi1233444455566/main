package curiiculum1_33;

public class Person {

	// クラスフィールドの宣言と初期化
	public static int count = 0;
	
	// インスタンスフィールドの定義
	public String firstName;
	public int age;
	public double height, weight;

	// インスタンスフィールドの定義（問題1）
	public String lastName;

	// コンストラクタの作成（引数あり）
	Person(String firstName, int age, double height, double weight) {

		// 人数分数を増やす
		Person.count++;
		
		// 引数を代入する
		this.firstName = firstName;
		this.age = age;
		this.height = height;
		this.weight = weight;

	}

	// コンストラクタのオーバーロード（問題2）
	Person(String firstName,String lastName,int age, double height, double weight) {

			// 人数分数を増やす（問題3）
			Person.count++;
			
			// 引数を代入する
			this.firstName = firstName;
			
			// 引数を代入する（問題3）
			this.lastName = lastName;

			// 引数を代入する
			this.age = age;
			this.height = height;
			this.weight = weight;

		}

	// 名前結合メソッドを作成
	public String fullName() {

		// 名前を返す
		return this.firstName + this.lastName;
	}

	// 出力するメソッドを作成
	public void print() {

		// コンソールに出力
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "です");
	}

	// 計算メソッドの作成
	public double bmi() {

		// 計算結果を返す
		return this.weight / this.height / this.height;
	}

	// 合計メソッドの作成
	public static void printCount() {

		// コンソールに出力する
		System.out.println("合計" + Person.count + "人です");
	}

}
