package process;

// 動物の生態内容
public class Ecology {

	// フィールドを作成
	private String[] animalScientificName;

	// コンストラクタを作成
	public Ecology() {

		// 配列に値を代入
		this.animalScientificName = new String[] { "パンテラ レオ", "ロキソドンタ・サイクロティス", "アイルロポダ・メラノレウカ", "パン・トゥログロディテス",
				"チャップマンシマウマ", "不明" };

	}

	// 動物の情報を出力するメソッド（引数あり）を作成
	public void searchResults(String animalName,String bodyLength,String speed,int number) {

			// 検索結果に対応した動物の情報をメッセージに出力する
			System.out.println("動物名：" + animalName);
			System.out.println("体長：" + bodyLength + "m");
			System.out.println("速度：" + speed + "km/h");
			System.out.println("学名：" + this.animalScientificName[number] + "\n");

	}

}