package process;

// 図鑑の目次
public class TableOfContents {

	// フィールドを作成
	private int searchNumber;

	// コンストラクタ（引数なし）の作成
	public TableOfContents() {

		// 値を代入
		this.searchNumber = 0;

	}

	// コンストラクタ（引数あり）の作成
	public TableOfContents(int number) {

		// 値を代入
		this.searchNumber = number;

	}

	// 値を取得するメソッドを作成
	public int getSearchNumber() {

		// 戻り値
		return this.searchNumber;

	}

	// 入力された動物名を検索するメソッドを作成
	public void SearchNumber(String name) {

		// 条件分岐
		switch (name) {

		// ライオンの場合
		case "ライオン":

			// 値を代入する
			this.searchNumber = 0;

			// 終了
			break;

		// ゾウの場合	
		case "ゾウ":

			// 値を代入する
			this.searchNumber = 1;

			// 終了
			break;

		// パンダの場合
		case "パンダ":

			// 値を代入する
			this.searchNumber = 2;

			// 終了
			break;

		// チンパンジーの場合	
		case "チンパンジー":

			// 値を代入する
			this.searchNumber = 3;

			// 終了
			break;

		// シマウマの場合
		case "シマウマ":

			// 値を代入する
			this.searchNumber = 4;

			// 終了
			break;

		// インコの場合
		case "インコ":

			// 値を代入する
			this.searchNumber = 5;

			// 終了
			break;

		// それ以外の場合
		default:

			// 値を代入する
			this.searchNumber = 6;

			// 終了
			break;

		}

	}

}
