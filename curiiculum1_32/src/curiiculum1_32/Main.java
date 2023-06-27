package curiiculum1_32;

public class Main {

	public static void main(String[] args) {
		
		// インスタンス1の生成
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		
		// 出力メソッドの呼び出し
		person1.print();

		// インスタンス2の生成
		Person person2 = new Person("山田花子", 22, 1.5, 40);
		
		// 出力メソッドの呼び出し
		person2.print();
		
		// コンソールに合計人数を出力する（問題3）
		System.out.println("合計" + Person.count + "人です");
		
		// クラスメソッドの呼び出し（問題6）
		Person.printCount();
		
	}

}
