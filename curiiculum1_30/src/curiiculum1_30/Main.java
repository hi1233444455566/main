package curiiculum1_30;

public class Main {
	public static void main(String[] args) {

		// 課題のコピー（インスタンスの生成）
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);

		// 課題のコピー（コンソールに出力）
		System.out.println(person1.name);
		System.out.println(person1.age);
		System.out.println(person1.height);

		// メソッドの呼び出し、戻り値の取得
		double bmi = person1.bmi();

		// コンソールに出力
		person1.print(bmi);
	}

}
