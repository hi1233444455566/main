package action;

import java.util.Scanner;

import process.Status;

// 実行用クラスを作成
public class Execution {

	public static void main(String[] args) {

		// インスタンスを生成
		Status status = new Status();

		// インスタンスを生成
		Scanner scanner = new Scanner(System.in);
		
		// コンソールに入力された文字を取得する
		String name = scanner.nextLine();

		// 入力された値を代入する
		status.setName(name);

		// メッセージを表示する
		System.out.println("こんにちは 「 " + status.getName() + " 」 さん");
		
		// ステータス値を表示する呼び出し
		status.status();
		
		// メッセージを表示する
		System.out.println("\n" + "さあ冒険に出かけよう！");

	}

}