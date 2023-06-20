package process;

import java.util.Objects;

// 名前の保持
public class AnimalName {

	// フィールドを作成
	private String animalName;

	// コンストラクタ（引数なし）を作成
	public AnimalName() {

		// フィールドに代入
		this.animalName = "動物名";

	}

	// コンストラクタ（引数あり）を作成
	public AnimalName(String name) {

		// フィールドに代入
		this.animalName = name;

	}

	// 値を取得するメソッドを作成
	public String getAnimalName() {

		// 戻り値を返す
		return this.animalName;
		
	}

	// 値を代入するメソッドを作成
	public void setAnimalName(String animalName) {
		
		// nullの場合
		if (Objects.isNull(animalName)) {

			// メッセージを表示する
			System.out.print("名前を入力してください");

		// それ以外	
		} else {

			// 値を代入する
			this.animalName = animalName;

		}

	}

}
