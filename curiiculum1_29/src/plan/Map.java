package plan;

// 地図情報
public class Map {

	// フィールドを作成する
	private String[] prefectures;
	private String[] location;
	private double[] area;

	// コンストラクタを作成
	public Map() {

		// 配列に値を代入
		prefectures = new String[] { "北海道", "青森県", "岩手県", "宮城県", "秋田県", "山形県", "福島県", "茨城県", "栃木県", "群馬県", "埼玉県" };
		location = new String[] { "札幌市", "青森市", "盛岡市", "仙台市", "秋田市", "山形市", "福島市", "水戸市", "宇都宮市", "前橋市", "さいたま市" };
		area = new double[] { 83424.0, 9646.0, 15275.0, 7282.0, 11638.0, 9323.0, 13784.0, 6097.0, 6408.0, 6362.0,3798.0 };

	}

	// 地図情報を出力するメソッド
	public void text(int num) {
		
		// コンソールに地図情報を出力する
		System.out.println("都道府県名：" + this.prefectures[num]);
		System.out.println("県庁所在地：" + this.location[num]);
		System.out.println("面積：" + this.area[num] + "km2" + "\n");
		
	}

}