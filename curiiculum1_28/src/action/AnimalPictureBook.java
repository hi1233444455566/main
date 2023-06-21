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

		// 検索結果用の変数を初期化する
		int number = 0;

		// メッセージを出力
		System.out.println("コンソールに文字を入力してください");

		// コンソールに入力された文字を配列に代入
		String[] name = scanner.nextLine().split(",");

		// 配列の中身をさらに分割する配列を宣言
		String[] name2;

		// 動物の情報を呼び出す繰り返し
		for (int i = 0; i < name.length; i++) {
			
			// 配列の中身を分割
			name2 = name[i].split(":");
			
			// メソッド（引数あり）を呼び出し
			animalName.setAnimalName(name2[0]);

			// 検索するメソッド（引数あり）を呼び出し
			tableOfCoontents.SearchNumber(animalName.getAnimalName());

			// 検索結果の数字を代入
			number = tableOfCoontents.getSearchNumber();

			// 動物の情報を出力するメソッド（引数あり）を呼び出し
			ecology.searchResults(name2[0], name2[1], name2[2], number);

		}

		// 閉じる
		scanner.close();
	}

}
