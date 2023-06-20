package process;

// 動物の生態内容
public class Ecology {

	// フィールドを作成
	private String[] animalName;
	private double[] animalBodyLength;
	private int[] animalSpeed;
	private String[] animalScientificName;

	// コンストラクタを作成
	public Ecology() {

		// 配列に値を代入
		this.animalName = new String[] { "ライオン", "ゾウ", "パンダ", "チンパンジー", "シマウマ", "インコ" };

		// 配列に値を代入
		this.animalBodyLength = new double[] { 2.1, 3.2, 1.9, 0.94, 2.4, 0.1 };

		// 配列に値を代入
		this.animalSpeed = new int[] { 80, 40, 30, 25, 65, 50 };

		// 配列に値を代入
		this.animalScientificName = new String[] { "パンテラ レオ", "ロキソドンタ・サイクロティス", "アイルロポダ・メラノレウカ", "パン・トゥログロディテス",
				"チャップマンシマウマ", "不明" };

	}

	// 動物の情報を出力するメソッド（引数あり）を作成
	public void searchResults(int number) {

		// 検索結果の数字が配列の個数より小さい場合
		if (number < this.animalName.length) {

			// 検索結果に対応した動物の情報をメッセージに出力する
			System.out.println("動物名：" + this.animalName[number]);
			System.out.println("体長：" + this.animalBodyLength[number] + "m");
			System.out.println("速度：" + this.animalSpeed[number] + "km/h");
			System.out.println("学名：" + this.animalScientificName[number] + "\n");

		// それ以外の場合	
		} else {

			// メッセージを出力する
			System.out.println("登録がありません");

		}

	}

}