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
			
			// 各教科の配列の要素数を取得
			int[][] tensu = new int[kamoku.length][a];
			
			// 生徒の人数だけ繰り返し点数の入力ができるようにする
			for (int b = 0; b < a; b++) {
				
				// 科目の数だけ繰り返し点数の入力ができるようにする
				for(int c = 0; c < kamoku.length; c++) {
					
				// メッセージを出力
				System.out.print(b + 1 + "人目の『" + kamoku[c] + "』の点数を入力してください :");
				
				// 点数の入力
				tensu[c][b] = scn.nextInt();
				
				}
				
				// 一人ずつ最後に改行を出力する
				System.out.print("\n");
				
			}
			
			// 各生徒の科目平均点数を繰り返し算出する
			for (int i = 0; i < a; i++) {
				
				// 各生徒の合計点数を算出するために使用する
				double sumA = 0.0d;
				
				// 各生徒の平均点数を算出するために使用する
				double avgA = 0.0d;
				
				// 科目の数だけ合計点数と平均点数を繰り返し算出する
				for(int g = 0; g < kamoku.length; g++) {
					
				// 各生徒の合計点数を算出する
				sumA += tensu[g][i];
				
				// 各生徒の平均点数を算出する
				avgA = sumA / kamoku.length;
				
				}
				
				// メッセージを出力
				System.out.println(i + 1 + String.format("人目の平均点は%.2f", avgA) + "点です。");
				
			}
			
			// 各生徒の平均点数を出力したら、最後に改行を出力する
			System.out.print("\n");
			
			// 各教科の合計点数を格納する要素数を取得する
			double[] sumB = new double[kamoku.length];
			
			// 各科目の平均点数を繰り返し算出する
			for (int k = 0; k < kamoku.length; k++) {
				
				// 生徒の人数だけ平均点数を繰り返し算出する
				for (int z = 0; z < a; z++) {
					
					// 科目ごとの合計点数を算出する
					sumB[k] += tensu[k][z];
					
				}
				
				// 科目ごとの平均点数を算出する
				double avgB = sumB[k] / a;
				
				// メッセージを出力する
				System.out.println(kamoku[k] + String.format("の平均点は%.2f", avgB) + "点です。");
				
			}
			
			// 全体の合計点数を算出するために使用する
			double sumC = 0;
			
			// 全体の平均点数を繰り返し算出する
			for (int e = 0; e < kamoku.length; e++) {
				
				// 全体の合計点数を算出する
				sumC += sumB[e];
				
			}
			
			// 全体の平均点数を求める
			double avgC = sumC / (kamoku.length * a);
			
			// メッセージを出力
			System.out.println(String.format("全体の平均点は%.2f", avgC) + "点です。");
			
			// do whileの繰り返しを終了する
			y = false;
			
		// 繰り返しを続ける条件
		} while (y == true);
		
	}
	
}
