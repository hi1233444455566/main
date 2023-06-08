package process;

import java.util.Random;

// 処理用サブクラスStatusを作成する
public class Status extends UserName {

	// HPフィールドの作成
	private int hp;

	// MPフィールドの作成
	private int mp;

	// 攻撃力フィールドの作成
	private int offensivePower;

	// 素早さフィールドの作成
	private int agility;

	// 防御力フィールドの作成
	private int defensePower;

	// コンストラクタを作成
	public Status() {

		// ランダムのインスタンスを生成
		Random random = new Random();

		// 能力値をランダムに代入（1〜999）
		hp = random.nextInt(998) + 1;
		mp = random.nextInt(998) + 1;
		offensivePower = random.nextInt(998) + 1;
		agility = random.nextInt(998) + 1;
		defensePower = random.nextInt(998) + 1;

	}

	// HPフィールドにgetメソッドでアクセス
	public int getHp() {

		// 戻り値
		return this.hp;
	}

	// MPフィールドにgetメソッドでアクセス
	public int getMp() {

		// 戻り値
		return this.mp;
	}

	// 攻撃力フィールドにgetメソッドでアクセス
	public int getOffensivePower() {

		// 戻り値
		return this.offensivePower;
	}

	// 素早さフィールドにgetメソッドでアクセス
	public int getAgility() {

		// 戻り値
		return this.agility;
	}

	// 守備力フィールドにgetメソッドでアクセス
	public int gerDefensePower() {

		// 戻り値
		return this.defensePower;
	}

	// 呼び出し用メソッドを作成
	public void action() {

		// コンソールに出力する
		System.out.println("ステータス");
		System.out.println("HP：" + getHp());
		System.out.println("MP：" + getMp());
		System.out.println("攻撃力：" + getOffensivePower());
		System.out.println("素早さ：" + getAgility());
		System.out.println("防御力：" + gerDefensePower() + "\n");
		System.out.println("さあ冒険に出かけよう！");

	}

}
