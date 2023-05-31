package curriculum_new_1_18;

public class Curriculum_New_1_18 {

	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください

	// greetingメソッドを作成する
	public static void greeting(String hello, int a) {

		// コンソールに出力する
		System.out.println(hello + a);

	}

	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください

	// multiplyメソッドを作成する
	public static void multiply(int x, int y) {

		// コンソールに出力する
		System.out.println(x * y);

	}

	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください

	// orderメソッドを作成する
	public static void order(int[] a) {

		// aの要素の数だけ繰り返す
		for (int i : a) {

			// コンソールに出力する
			System.out.println(i);

		}

	}

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください

	// multiplyメソッドをオーバーロードする
	public static void multiply(double x, double y) {

		// コンソールに出力する
		System.out.println(x + y);

	}

	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください
	// ※0は出力＆格納しないようにしてください

	// randOrderメソッドを作成する
	public static int[] randOrder(int a) {

		// ランダムな数字の格納先
		int[] num = new int[a];

		// 引数の回数分繰り返しの処理
		for (int i = 0; i < a; i++) {

			// 1〜100までのランダムな数字を作成する
			int count = new java.util.Random().nextInt(100) + 1;

			// num配列に数値を格納する
			num[i] = count;

			// num配列に格納された値をコンソールに出力する
			System.out.println(num[i]);

		}

		// 結果を返す
		return num;

	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。

	// avgメソッドを作成する
	public static double avg(int[] a) {

		// 平均値を受け取るための初期化
		double avg = 0.0d;

		// 配列の数だけ繰り返し足し算を行う
		for (double add : a) {

			// 配列の数値を順番にavgに足しながら代入する
			avg += add;

		}

		// 平均値を計算する
		avg /= a.length;

		// コンソールに出力する
		System.out.println(avg);

		// 計算結果を返す
		return avg;

	}

	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください

	// judgeメソッドを作成する
	public static void judge(double a) {

		// 判定を初期化
		boolean judge = true;

		// 受け取った値が50以上の場合
		if (a >= 50) {

			// コンソールに出力する
			System.out.println(judge);

			// 受け取った値が50未満の場合	
		} else {

			// 判定にfalseを代入
			judge = false;

			// コンソールに出力する
			System.out.println(judge);

		}

	}

	// mainメソッド
	public static void main(String[] args) {

		// 作成したメソッドをここで呼び出してください。

		// greetingメソッドを呼び出す
		greeting("Hello JavaSE ", 11);

		// multiplyメソッドを呼び出す
		multiply(3, 4);

		// 整数の配列を作成する
		int[] a = { 5, 6, 7 };

		// orderメソッドを呼び出す
		order(a);

		// multiplyメソッドを呼び出す
		multiply(3.0, 4.0);

		// 戻り値を配列に格納する = randOrderメソッドを呼び出す
		int[] b = randOrder(3);

		// 戻り値を受け取る = avgメソッドを呼び出す
		double c = avg(b);

		// judgeメソッドを呼び出す
		judge(c);

	}
	
}