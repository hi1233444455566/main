package action;

import plan.Process;

// 実行用クラスを作成
public class Execution {

	public static void main(String[] args) {

		// インスタンスを生成
		Process process = new Process();

		// 動物名を代入
		process.setAnimalName("ライオン");

		// 動物の体長を代入
		process.setAnimalBodyLength(2.1);

		// 動物の速度を代入
		process.setAnimalSpeed(80);

		// 動物名を取得し、代入
		String animalName = process.getAnimalName();

		// 動物の体長を取得し、代入
		double animalBodyLength = process.getAnimalBodyLength();

		// 動物の速度を取得し、代入
		int animalSpeed = process.getAnimalSpeed();

		// コンソールに出力
		System.out.println("動物名：" + animalName);

		// コンソールに出力
		System.out.println("体長：" + animalBodyLength + "m");

		// コンソールに出力
		System.out.println("速度：" + animalSpeed + "km/h");

	}

}
