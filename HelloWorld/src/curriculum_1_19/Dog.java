package curriculum_1_19;

public class Dog {
	// Q1：フィールドに動物の名前の変数を定義してください。

	// フィールドを追加
	public String name;

	// Q2：フィールドに動物の数の変数を定義してください。

	// フィールドを追加
	public int num;

	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。

	// コンストラクタを作成
	public Dog() {

		// 犬を代入
		this.name = "犬";

	}

	public Dog(int num) {
		
		// 引数を代入
		this.num = num;
		
	}

}
