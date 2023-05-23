package curriculum_B;

import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		// 標準入力
		Scanner scn = new Scanner(System.in);
		// 区切り文字の指定
		String[] key = scn.nextLine().split("、|\n");
		// 入力された言葉の数だけ配列の要素数を取得
		int[] num = new int[key.length];
		// ディスプレイのfor文で使用
		int i = 0;
		// ディスプレイの条件演算子で使用
		int a = 0;
		// テレビのフラグ
		boolean t = false;
		// key配列から要素を取り出して、変数nameに格納する
		for (String name : key) {
			// 乱数1の作成
			int count = new java.util.Random().nextInt(12);
			// 条件分岐
			switch (name) {
			// パソコンが格納された場合
			case "パソコン":
			// 冷蔵庫が格納された場合
			case "冷蔵庫":
			// 扇風機が格納された場合
			case "扇風機":
			// 洗濯機が格納された場合
			case "洗濯機":
			// 加湿器が格納された場合
			case "加湿器":
				// メッセージを出力する
				System.out.println(name + "の残り台数は" + count + "台です");
				// 終了
				break;
			// テレビが格納された場合
			case "テレビ":
				// テレビがある時
				t = true;
			// ディスプレイが格納された場合
			case "ディスプレイ":
				// テレビとディスプレイで値を変えるための乱数2を作成する
				for (i = 0; i < key.length; i++) {
					// 乱数の格納
					num[i] = new java.util.Random().nextInt(12);
					// 終了
					break;
				}
				// 条件演算子（テレビがある場合、乱数2と乱数1が同じ場合、乱数2が11以上の場合で結果を変える）
				a = t == true ? num[i] == count ? num[i] >= 11 ? --num[i] : ++num[i] : num[i] : count;
				// メッセージを出力する
				System.out.println(name + "の残り台数は" + a + "台です");
				// 終了
				break;
			// 上記のいずれでもない場合
			default:
				// メッセージを出力する
				System.out.println("『" + name + "』は指定の商品ではありません");
				// 終了
				break;
			}
		}
	}
}