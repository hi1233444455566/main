package curiiculum1_32;

public class Person {

	// 課題のコピー
	public String name;
	public int age;
	public double height;
	public double weight;
	
	// クラスフィールドの宣言と初期化（問題1）
	public static int count = 0;

	// 課題のコピー
	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		
		// 人数分回数を増やす（問題2）
		++count;
	}

	// 課題のコピー
	public double bmi() {
		return this.weight / this.height / this.height;
	}

	// 課題のコピー
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		
		}

	// クラスメソッドの作成（問題4）
	public static void printCount() {
		
		// コンソールに出力する（問題5）
		System.out.println("合計" + count + "人です");
	
	}
	
}
