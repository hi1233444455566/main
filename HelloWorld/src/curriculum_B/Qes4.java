package curriculum_B;

public class Qes4 {
	
	public static void main(String[] args) {
		
		// 外のループ
		for (int i = 1; i < 10; i++) {
			
			// 内のループ
			for (int j = 1; j < 10; j++) {
				
				// 表示桁を合わせて結果の出力
				System.out.printf("%02d * " + "%02d = " + "%02d", i, j, i * j);
				
				// 09を掛ける後ろだけ「｜｜」をつけないようにする
				if (j == 9) {
					
					// 処理の中断
					break;
					
				}
				
				// 九九の結果の間に「｜｜」を出力
				System.out.print(" || ");
				
			}
			
			// 九九の段ごとに改行をする
			System.out.println("");
			
		}
		
	}
	
}
