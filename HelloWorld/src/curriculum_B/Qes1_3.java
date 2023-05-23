package curriculum_B;

public class Qes1_3 {
	public static void main(String[] args) {
		// ループの条件
		int win = 1;
		// 全体のループ
		while (win == 1) {
			// 標準入力
			String name = new java.util.Scanner(System.in).nextLine();
			// 文字数の取得
			int num = name.length();
			// 入力された文字数が10文字より多い場合
			if (num >= 10) {
				// エラーメッセージを出力
				System.out.println("「名前を10文字以内にしてください」");
				// 最初に戻る
				win = 1;
				// 入力された文字数が0文字以下もしくはnullの場合
			} else if ((num <= 0) || (name.equals(null))) {
				// エラーメッセージを出力
				System.out.println("「名前を入力してください」");
				// 最初に戻る
				win = 1;
				// 入力された文字が半角英数字以外の場合	
			} else if (!name.matches("^[a-zA-Z0-9]+$")) {
				// エラーメッセージを出力
				System.out.println("「半角英数字のみで名前を入力してください」");
				// 最初に戻る
				win = 1;
				// 正常に登録された場合	
			} else {
				// 登録完了のメッセージを出力
				System.out.println("ユーザー名「" + name + "」を登録しました");
				// じゃんけん回数
				int count = 0;
				// じゃんけんのループ
				do {
					// userの手を乱数で作成する。
					int user = new java.util.Random().nextInt(3);
					// pcの手を乱数で作成する。
					int pc = new java.util.Random().nextInt(3);
					// じゃんけんの手を配列で定義
					String[] janken = { "グー", "チョキ", "パー" };
					// userの結果表示
					System.out.printf(name + "の手は「%s」" + "%n", janken[user]);
					// pcの結果表示
					System.out.printf("相手の手は「%s」" + "%n", janken[pc]);
					// じゃんけんの分岐（user）
					switch (user) {
						// userの手がグーの場合
						case 0:
							// じゃんけんの分岐（pc）
							switch (pc) {
							// pcの手がグーの場合
							case 0:
								// あいこのメッセージを出力
								System.out.println("DRAW あいこ もう一回しましょう！");
								// もう一回戦
								win = 1;
								// じゃんけん回数にプラス
								count++;
								// 終了
								break;
							// pcの手がチョキの場合
							case 1:
								// 勝ちのメッセージを出力
								System.out.println("やるやん。");
								System.out.println("次は俺にリベンジさせて");
								// じゃんけん終了
								win = 0;
								// じゃんけん回数にプラス
								count++;
								// じゃんけん回数のメッセージを出力
								System.out.println("勝つまでにかかった合計回数は" + count + "回です");
								// 終了
								break;
							// pcの手がパーの場合
							case 2:
								// 負けのメッセージを出力
								System.out.println("俺の勝ち！");
								System.out.println("なんで負けたか、明日まで考えといてください。");
								System.out.println("そしたら何かが見えてくるはずです");
								// もう一回戦
								win = 1;
								// じゃんけん回数にプラス
								count++;
								// 終了
								break;
							}
							// 終了
							break;
						// userの手がチョキの場合
						case 1:
							// じゃんけんの分岐（pc）
							switch (pc) {
							// pcの手がグーの場合
							case 0:
								// 負けのメッセージを出力
								System.out.println("俺の勝ち！");
								System.out.println("負けは次につながるチャンスです！");
								System.out.println("ネバーギブアップ！");
								// もう一回戦
								win = 1;
								// じゃんけん回数にプラス
								count++;
								// 終了
								break;
							// pcの手がチョキの場合
							case 1:
								// あいこのメッセージを出力
								System.out.println("DRAW あいこ もう一回しましょう！");
								// もう一回戦
								win = 1;
								// じゃんけん回数にプラス
								count++;
								// 終了
								break;
							// pcの手がパーの場合
							case 2:
								// 勝ちのメッセージを出力
								System.out.println("やるやん。");
								System.out.println("次は俺にリベンジさせて");
								// じゃんけん終了
								win = 0;
								// じゃんけん回数にプラス
								count++;
								// じゃんけん回数のメッセージを出力
								System.out.println("勝つまでにかかった合計回数は" + count + "回です");
								// 終了
								break;
							}
							// 終了
							break;
						// userの手がパーの場合	
						case 2:
							// じゃんけんの分岐（pc）
							switch (pc) {
							// pcの手がグーの場合
							case 0:
								// 勝ちのメッセージを出力
								System.out.println("やるやん。");
								System.out.println("次は俺にリベンジさせて");
								// じゃんけん終了
								win = 0;
								// じゃんけん回数にプラス
								count++;
								// じゃんけん回数のメッセージを出力
								System.out.println("勝つまでにかかった合計回数は" + count + "回です");
								// 終了
								break;
							// pcの手がチョキの場合
							case 1:
								// 負けのメッセージを出力
								System.out.println("俺の勝ち！");
								System.out.println("たかがじゃんけん、そう思ってないですか？");
								System.out.println("それやったら次も、俺が勝ちますよ");
								// もう一回戦
								win = 1;
								// じゃんけん回数にプラス
								count++;
								// 終了
								break;
							// pcの手がパーの場合
							case 2:
								// あいこのメッセージを出力
								System.out.println("DRAW あいこ もう一回しましょう！");
								// もう一回戦
								win = 1;
								// じゃんけん回数にプラス
								count++;
								// 終了
								break;
							}
							// 終了
							break;
						}
				// じゃんけんのループの条件	
				} while (win == 1);
				// 全体ループの最初に戻る
				win = 1;
			}
		}
	}
}
