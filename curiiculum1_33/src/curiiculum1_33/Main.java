package curiiculum1_33;

public class Main {

	public static void main(String[] args) {

		// インスタンス1の生成
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);

		// 出力メソッドの呼び出し
		person1.print();

		// インスタンス2の生成
		Person person2 = new Person("山田", "花子", 22, 1.5, 40);

		// 出力メソッドの呼び出し
		person2.print();

		// 合計メソッドの呼び出し
		Person.printCount();

	}

}
