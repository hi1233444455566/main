package process;

import java.util.Random;

// 処理用サブクラスを作成する
public class Status extends UserName {

	// フィールドの作成
	private String[] status;
	private int[] statusValue;

	// コンストラクタ（引数なし）の作成
	public Status() {

		// 親コンストラクタの呼び出し
		super();

		// 初期値と値の代入
		this.status = new String[] { "HP：", "MP：", "攻撃力：", "素早さ：", "防御力：" };

		// 初期値を作成
		this.statusValue = new int[this.status.length];

	}

	// コンストラクタ（引数あり）の作成
	public Status(String name) {

		// 親コンストラクタに引数を代入する
		super(name);

	}

	// 能力値を作成・表示するメソッド
	public void status() {

		// インスタンスの生成
		Random random = new Random();

		// メッセージを表示
		System.out.println("ステータス");

		// 繰り返し処理
		for (int i = 0; i < this.status.length; i++) {

			// 能力値を配列に格納
			this.statusValue[i] = random.nextInt(999) + 1;

			// 各能力の能力値をコンソールに出力する
			System.out.println(this.status[i] + this.statusValue[i]);

		}

	}

}