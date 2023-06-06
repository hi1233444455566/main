package plan;

// 処理用クラスを作成
public class Process {

	// 動物名フィールドを作成
	private String animalName;

	// 動物の体長フィールドを作成
	private double animalBodyLength;

	// 動物の速度フィールドを作成
	private int animalSpeed;

	// 動物名フィールドにgetメソッドでアクセス
	public String getAnimalName() {

		// 戻り値
		return this.animalName;

	}

	// 動物名フィールドにsetメソッドでアクセス
	public void setAnimalName(String animalName) {

		// null判定された場合
		if (animalName == null) {

			// 処理を止めて
			throw new IllegalArgumentException

			// エラーメッセージを表示する
			("setAnimalName()の()に日本語で動物名を入れてください");

		}

		// それ以外の場合、動物名フィールドに代入する
		this.animalName = animalName;

	}

	// 動物の体長フィールドにgetメソッドでアクセス
	public double getAnimalBodyLength() {

		// 戻り値
		return this.animalBodyLength;

	}

	// 動物の体長フィールドにsetメソッドでアクセス
	public void setAnimalBodyLength(double animalBodyLength) {

		// null判定された場合
		if (animalBodyLength == 0.0d) {

			// 処理を止めて
			throw new IllegalArgumentException

			// エラーメッセージを表示する
			("setAnimalBodyLength()の()に動物の体長（小数点あり）を0.0以上入れてください");

		}

		// それ以外の場合、動物の体長フィールドに代入する
		this.animalBodyLength = animalBodyLength;

	}

	// 動物の速度フィールドにgetメソッドでアクセス
	public int getAnimalSpeed() {

		// 戻り値
		return this.animalSpeed;

	}

	// 動物の速度フィールドにsetメソッドでアクセス
	public void setAnimalSpeed(int animalSpeed) {

		// null判定された場合
		if (animalSpeed == 0) {

			// 処理を止めて
			throw new IllegalArgumentException

			// エラーメッセージを表示する
			("setAnimalSpeed()の()に動物の速度（小数点なし）を0以上入れてください");

		}

		// それ以外の場合、動物の速度フィールドに代入する
		this.animalSpeed = animalSpeed;

	}

}
