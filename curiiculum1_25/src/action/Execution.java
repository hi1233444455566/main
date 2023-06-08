package action;

import process.Status;

// 実行用クラスを作成
public class Execution {

	public static void main(String[] args) {

		// statusのインスタンスを生成
		Status status = new Status();

		// setに入力された値をnameに代入する
		status.setName("名前");

		// helloを呼び出し
		status.hello();

		// actionを呼び出し
		status.action();

	}

}
