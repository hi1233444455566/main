package curiiculum1_31;

public class Main {

	public static void main(String[] args) {

		// インスタンスの生成
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
		Person person2 = new Person("山田", "花子", 22, 1.5, 40);
		Car car = new Car();
		Bicycle bicycle = new Bicycle();

		// メソッドに値を渡す（問題4）
		car.setOwner(person1.fullName());
		bicycle.setOwner(person2.fullName());

		// コンソールに出力する（問題5）
		System.out.println(car.getOwner());
		System.out.println(bicycle.getOwner());

		// 購入メソッドを呼び出す（問題10）
		person1.buy(car);
		person2.buy(bicycle);
	}

}
