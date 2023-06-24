package process;

import java.util.Objects;

// 処理用スーパークラスを作成
public class UserName {

	// フィールドの作成
	private String name;

	// コンストラクタ（引数なし）の作成
	public UserName() {

		// 値を代入
		this.name = "名前";

	}

	// コンストラクタ（引数あり）の作成
	public UserName(String name) {

		// 引数を代入
		this.name = name;

	}

	// フィールドにメソッドでアクセス
	public void setName(String name) {

		// nullの場合
		if (Objects.isNull(name)) {

			// メッセージを表示する
			System.out.print("名前を入力してください");

			// それ以外	
		} else {

			// 値を代入する
			this.name = name;

		}

	}

	// フィールドにメソッドでアクセス
	public String getName() {

		// 戻り値
		return this.name;

	}

}
