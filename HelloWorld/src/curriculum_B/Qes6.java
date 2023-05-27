package curriculum_B;

import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		
		// 標準入力
		Scanner scn = new Scanner(System.in);
		
		// 区切り文字の指定
		String[] key = scn.nextLine().split("、|\n");
		
		// key配列から要素を取り出して、変数nameに格納する
		for (String name : key) {
			
			// 乱数の作成
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
				System.out.println(name + "の残り台数は" + count + "台です" + "\n");
				
				// 終了
				break;
				
			// テレビが格納された場合
			case "テレビ":
				
			// ディスプレイが格納された場合
			case "ディスプレイ":
				
				// ディスプレイのフラグ
				String flag = "ディスプレイ";
				
				// 条件演算子で使用する数値型
				int judgement = 0;
				
				// ディスプレイと入力された場合は、11からランダムな数値を引いた数値を出力する
				judgement = flag.equals(name) ? (11 - count): count;
				
				// メッセージを出力する
				System.out.println(name + "の残り台数は" + judgement + "台です" + "\n");
				
				// 終了
				break;
				
			// 上記のいずれでもない場合
			default:
				
				// メッセージを出力する
				System.out.println("『 " + name + " 』は指定の商品ではありません" + "\n");
				
				// 終了
				break;
				
			}
			
		}
		
	}
	
}