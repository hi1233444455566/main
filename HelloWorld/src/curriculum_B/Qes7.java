package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		// do whileの条件を定義する
		boolean y = true;
		// do whileの開始
		do {
			// 標準入力
			Scanner scn = new Scanner(System.in);
			// メッセージを出力
			System.out.print("生徒の人数を入力してください（2以上）: ");
			// 人数の入力
			int a = scn.nextInt();
			// 科目の配列を初期化と代入
			String[] kamoku = { "英語", "数学", "理科", "社会" };
			// 英語の配列の要素数を取得
			int[][] tensu = new int[kamoku.length][a];
			// 生徒の人数だけ点数を繰り返し入力できるようにする
			for (int b = 0; b < a; b++) {
				// メッセージを出力
				System.out.print(b + 1 + "人目の『英語』の点数を入力してください :");
				// 点数の入力
				tensu[0][b] = scn.nextInt();
				// メッセージを出力
				System.out.print(b + 1 + "人目の『数学』の点数を入力してください :");
				// 点数の入力
				tensu[1][b] = scn.nextInt();
				// メッセージを出力
				System.out.print(b + 1 + "人目の『理科』の点数を入力してください :");
				// 点数の入力
				tensu[2][b] = scn.nextInt();
				// メッセージを出力
				System.out.print(b + 1 + "人目の『社会』の点数を入力してください :");
				// 点数の入力
				tensu[3][b] = scn.nextInt();
			}
			// 各生徒の科目平均点数を算出するための繰り返し
			for (int i = 0; i < a; i++) {
				// 各生徒の合計点数を求める
				double sumA = tensu[0][i] + tensu[1][i] + tensu[2][i] + tensu[3][i];
				// 各生徒の平均点数を算出する
				double avgA = sumA / kamoku.length;
				// メッセージを出力
				System.out.println(i + 1 + String.format("人目の平均点は%.2f", avgA) + "点です。");
			}
			// 各教科の合計点数を格納する要素数を取得する
			double[] sumB = new double[kamoku.length];
			// 各教科の平均点数を求めるための繰り返し（科目数）
			for (int k = 0; k < kamoku.length; k++) {
				// 各教科の平均点数を求めるための繰り返し（人数分）
				for (int z = 0; z < a; z++) {
					// 科目ごとの合計点数を求める
					sumB[k] += tensu[k][z];
				}
				// 科目ごとの平均点数を求める
				double avgB = sumB[k] / a;
				// メッセージを出力する
				System.out.println(kamoku[k] + String.format("の平均点は%.2f", avgB) + "点です。");
			}
			// 全体の合計点数を求めるために使う
			double sumC = 0;
			// 全体の平均点数を求めるための繰り返し
			for (int e = 0; e < kamoku.length; e++) {
				// 全体の合計点数を求める
				sumC += sumB[e];
			}
			// 全体の平均点数を求める
			double avgC = sumC / (kamoku.length * a);
			// メッセージを出力
			System.out.println(String.format("全体の平均点は%.2f", avgC) + "点です。");
			// do whileの繰り返しを抜ける
			y = false;
		// 繰り返しを続ける条件
		} while (y == true);
	}
}
