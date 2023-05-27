package curriculum_B;

import java.util.Objects;

public class Qes1_3 {

	public static void main(String[] args) {

		// ループの条件
		boolean loopFlag = true;

		// 全体のループ
		while (loopFlag == true) {

			// 標準入力
			String name = new java.util.Scanner(System.in).nextLine();

			// 文字数の取得
			int num = name.length();

			// 入力された文字数が0文字以下もしくはnullの場合
			if ((num <= 0) || (Objects.isNull(name))) {

				// エラーメッセージを出力
				System.out.println("「名前を入力してください」" + "\n");

				// 最初に戻る
				loopFlag = true;

			// 入力された文字数が10文字より多い場合
			} else if (num > 10) {

				// エラーメッセージを出力
				System.out.println("「名前を10文字以内にしてください」" + "\n");

				// 最初に戻る
				loopFlag = true;

			// 入力された文字が半角英数字以外の場合	
			} else if (!name.matches("^[a-zA-Z0-9]+$")) {

				// エラーメッセージを出力
				System.out.println("「半角英数字のみで名前を入力してください」" + "\n");

				// 最初に戻る
				loopFlag = true;

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
					System.out.printf("相手の手は「%s」" + "%n" + "\n", janken[pc]);

					// じゃんけんの分岐
					// あいこの場合
					if ((user == 0 && pc == 0) || (user == 1 && pc == 1) || (user == 2 && pc == 2)) {

						// メッセージを出力
						System.out.println("DRAW あいこ もう一回しましょう！" + "\n");

						// もう一回戦
						loopFlag = true;

						// じゃんけん回数にプラス
						count++;

					// userが勝ちの場合
					} else if ((user == 0 && pc == 1) || (user == 1 && pc == 2) || (user == 2 && pc == 0)) {

						// メッセージを出力
						System.out.println("やるやん。");
						System.out.println("次は俺にリベンジさせて" + "\n");

						// じゃんけん終了
						loopFlag = false;

						// じゃんけん回数にプラス
						count++;

						// じゃんけん回数のメッセージを出力
						System.out.println("勝つまでにかかった合計回数は" + count + "回です");

						// 終了
						break;

					// userが負けの場合	
					} else {

						// pcが勝った時のメッセージの分岐
						switch (pc) {

						// pcがグーで勝った場合
						case 0:

							// メッセージを出力
							System.out.println("俺の勝ち！");
							System.out.println("負けは次につながるチャンスです！");
							System.out.println("ネバーギブアップ！" + "\n");

							// もう一回戦
							loopFlag = true;

							// じゃんけん回数にプラス
							count++;

							// 終了
							break;

						// pcがチョキで勝った場合
						case 1:

							// メッセージを出力
							System.out.println("俺の勝ち！");
							System.out.println("たかがじゃんけん、そう思ってないですか？");
							System.out.println("それやったら次も、俺が勝ちますよ" + "\n");

							// もう一回戦
							loopFlag = true;

							// じゃんけん回数にプラス
							count++;

							// 終了
							break;

						// pcがパーで勝った場合
						case 2:

							// メッセージを出力
							System.out.println("俺の勝ち！");
							System.out.println("なんで負けたか、明日まで考えといてください。");
							System.out.println("そしたら何かが見えてくるはずです" + "\n");

							// もう一回戦
							loopFlag = true;

							// じゃんけん回数にプラス
							count++;

							// 終了
							break;

						}

					}

				// じゃんけんのループの条件	
				} while (loopFlag == true);
				
			// 全体ループを終了する
			loopFlag = false;

			}
			
		}

	}

}
