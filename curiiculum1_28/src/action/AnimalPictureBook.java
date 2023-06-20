package action;

import java.util.Scanner;

import process.AnimalName;
import process.Ecology;
import process.TableOfContents;

// 動物図鑑
public class AnimalPictureBook {

	public static void main(String[] args) {

		// インスタンスを生成
		Scanner scanner = new Scanner(System.in);
		AnimalName animalName = new AnimalName();
		TableOfContents tableOfCoontents = new TableOfContents();
		Ecology ecology = new Ecology();

		// 繰り返し処理用の変数を初期化する
		boolean judgement = false;

		// 検索結果用の変数を初期化する
		int number = 0;

		// メッセージを出力
		System.out.println("コンソールに文字を入力してください");

		// 入力の繰り返し処理
		do {

			// コンソールに入力された文字を代入
			String name = scanner.nextLine();

			// メソッド（引数あり）を呼び出し
			animalName.setAnimalName(name);

			// 検索するメソッド（引数あり）を呼び出し
			tableOfCoontents.SearchNumber(name);

			// 検索結果の数字を代入
			number = tableOfCoontents.getSearchNumber();

			// 動物の情報を出力するメソッド（引数あり）を呼び出し
			ecology.searchResults(number);

		// 繰り返し処理の条件
		} while (judgement == false);

		// 閉じる
		scanner.close();
	}

}
