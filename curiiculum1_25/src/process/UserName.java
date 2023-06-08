package process;

// 処理用スーパークラスUserNameを作成
public class UserName {

	// nameフィールドの作成
	private String name;

	// nameフィールドにsetメソッドでアクセス
	public void setName(String name) {

		// 空白の場合、数字のみの場合、null判定された場合
		if(("".equals(name)) || (name.matches("^[0-9]+$")) || (name == null)) {

			// 処理を止めて
			throw new IllegalArgumentException

			// エラーメッセージを表示する
			("\n" + "\n" + "setName()の()に名前を入れてください" + "\n" + "なお、数字のみを入力することはできません" + "\n");

		} 

		// それ以外の場合は、nameフィールドに代入する
		this.name = name;
	}

	// nameフィールドにgetメソッドでアクセス
	public String getName() {

		// 戻り値
		return this.name;

	}

	// 呼び出し用メソッドを作成
	public void hello() {
		
		// コンソールに出力する
		System.out.println("こんにちは 「 " + getName() + " 」 さん");
		
	}

}
