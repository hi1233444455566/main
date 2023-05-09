package curriculum_A;

public class Qes1_13 {

	     public static void main(String[] args) {
	    	 
		     /* Q1
		       	下記9個をローカル変数として宣言のみしてください
		     	・バイト型・短整数型・整数型・長整数型
		     	・単精度浮動小数点数型・倍精度浮動小数点数型
		     	・文字型・文字列型
		     	・ブーリアン型
		      */ 
	    	 		byte a; //バイト型を宣言
	    	 		short b; //短整数型を宣言
	    	 		int c; //整数型を宣言
	    	 		long d; //長整数型を宣言
	    	 		float e; //単精度浮動小数点数型を宣言
	    	 		double f; //倍精度浮動小数点数型を宣言
	    	 		char g; //文字型を宣言
	    	 		String h; //文字列型を宣言
	    	 		boolean i; //ブーリアン型を宣言
	    	 
		     /* Q2 
	    	 	それぞれのクラス変数をローカル内でそれぞれの初期値を代入し初期化してください
	    	  */
	    	 		a = 0;
	    	 		b = 0;
	    	 		c = 0;
	    	 		d = 0l;
	    	 		e = 0.0f;
	    	 		f = 0.0d;
	    	 		g = '\u0000';
	    	 		h = null;
	    	 		i = false;
	    			
		     /* Q3 
		       	初期化をしたそれぞれの変数に下記の値を代入してください
	    	  */
	    	 				// ↓↓下記↓↓
	    	 		a = 10; //バイト型：10を代入
			    	b = 100; //短整数型：100を代入
			    	c = 1000; //整数型：1000を代入
			    	d = 10000l; //長整数型：10000を代入
			    	e = 9.5f; //単精度浮動小数点数型：9.5を代入
			    	f = 10.5d; //倍精度浮動小数点数型：10.5を代入
			    	g = 'a'; //文字型：aを代入
			    	h = "ハロー"; //文字列型：ハローを代入
			    	i = true; //ブーリアン型：trueを代入
	    	 
		     /* Q4 
		     	下記の通りにコンソール出力されるようにしてください
		     	上記で作成した変数を必ず使用すること
		      */
			    	// 問⚪（題名）
			    	System.out.println("️問4");
			    	// 以下、回答です。
			    								       // ↓↓下記↓↓
			    	System.out.println(a + b + c + d); // 11110と出力
				   	System.out.println((int)(e + f)); // 20と出力
				   	System.out.println(g + " " + h + " " + i); // a ハロー trueと出力
				   	System.out.println((int)(a + b + c + d + e + f));// 11130（数字を全て足す）と出力
				   	System.out.println(a * b * c * d); // 10000000000（小数点以外の数字を全てかける）と出力
				   	System.out.println(f / b);  // 0.105（10.5割る100をする）と出力
				    System.out.println(a - b); // -90（10引く100をする）と出力
	    	 
	    	 /* Q5 
	    	  *	次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
	    	  *	「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
	    	  *　String num="20";
	    	  *　int num1=23;
	    	  *　System.out.println("ハローJAVA"+(num+num1));
	    	  */
			    	// 改行と問⚪（題名）
			    	System.out.println(" ️");
			    	System.out.println("問5"); 
			    	// 以下、回答です。
			    	int num = 20; //String型をint型にする
			    	int num1 = 23; //上記と同じ
			    	System.out.println("ハローJAVA" + (num + num1)); //「ハローJAVA43」と出力
	 		
	    	 /* Q6 
	    	  *	『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
	    	  *	ローカル変数に代入し○○に入れてください
	    	  */
			    	// 改行と問⚪（題名）
			    	System.out.println(" ️");	
			    	System.out.println("問6");
			    	// 以下、回答です。
			    	// 人の情報：『山田太郎 18歳 170.5cm 62.2kg 寿司』
			    												// ↓↓format↓↓
			    	h = "山田太郎"; //文字列型hに代入
			    	System.out.println("初めまして" + h + "です"); //「初めまして○○です」と出力
			    	c = 18; //整数型cに代入
			    	System.out.println("年齢は" + c + "歳です"); //「年齢は○○歳です」と出力
			    	f = 170.5d; //倍精度浮動小数点数型fに代入
			    	System.out.println("身長は" + f + "cmです"); //「身長は○○cmです」と出力
			    	e = 62.2f; //単精度浮動小数点数型eに代入
			    	System.out.println("体重は" + e + "kgです"); //「体重は○○kgです」と出力
			    	h = "寿司"; //文字列型hに再代入
			    	System.out.println("好きな食べ物は" + h + "です"); //「好きな食べ物は○○です」と出力
		 		
	    	 /* Q7 
	    	  *	6で作成した自己紹介に続いてBMIが出力されるようにしてください
	    	  *	ただし計算は数値を直書きせず、全て変数を使ってすること
	    	  */
			    	// 改行と問⚪（題名）
			    	System.out.println(" ️");
			    	System.out.println("問7");
			    	// 以下、回答です。
			    	System.out.println("BMIは" + String.format("%.1f",(e / ((f / 100) * (f / 100)))) + "です"); //「BMIは○○です」と出力
		 		
	    	 /* Q8
	    	  * 6で宣言した変数に再代入し下記の通りコンソールに出力してください
	    	  */
			    	// 改行と問⚪（題名）
			    	System.out.println(" ️");
			    	System.out.println("問8");
			    	// 以下、回答です。
			    												 // ↓↓下記↓↓
			    	h = "鈴木一郎"; //文字列型hに再代入
			    	System.out.println("初めまして" + h + "です");	 //「初めまして鈴木一郎です」と出力
			    	c = 24; //整数型cに再代入
			    	System.out.println("年齢は" + c + "歳です"); //「年齢は24歳です」と出力
			    	f = 168.5d; //倍精度浮動小数点数型fに再代入
			    	System.out.println("身長は" + f + "cmです"); //「身長168.5cmです」と出力
			    	e = 64.2f; //単精度浮動小数点数型eに再代入
			    	System.out.println("体重は" + e + "kgです"); //「体重は64.2kgです」と出力
			    	h = "オムライス"; //文字列型hに再代入
			    	System.out.println("好きな食べ物は" + h + "です"); //「好きな食べ物はオムライスです」と出力	
			    	System.out.println("BMIは" + String.format("%.1f",(e / ((f / 100) * (f / 100)))) + "です"); //「BMIは22.6です」と出力
	    	 
	    	 /* Q9
	    	  * 8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力してください
	    	  */
			    	// 改行と問⚪（題名）
			    	System.out.println(" ️");
			    	System.out.println("問9");
			    	// 以下、回答です。
					 											 // ↓↓下記↓↓			    	
			    	h = "鈴木一郎"; //文字列型hに再代入
			    	System.out.println("初めまして" + h + "です"); // 初めまして鈴木一郎です
			    	c += c; //整数型cに自己代入
			    	System.out.println("年齢は" + c + "歳です");	 // 年齢は48歳です
			    	f += f; //倍精度浮動小数点数型fに自己代入
			    	System.out.println("身長は" + f + "cmです"); // 身長337.0cmです	
			    	e += e; //単精度浮動小数点数型eに自己代入
			    	System.out.println("体重は" + e + "kgです"); // 体重は128.4kgです	
			    	h = "オムライス"; //文字列型hに再代入
			    	System.out.println("好きな食べ物は" + h + "です"); // 好きな食べ物はオムライスです	
			    	System.out.println("BMIは" + String.format("%.2f",(e / ((f / 100) * (f / 100)))) + "です"); // BMIは11.31です
		    	 
	    	 /* Q10
	    	  * 8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません
	    	  */
			    	// 改行と問⚪（題名）
			    	System.out.println(" ️");
			    	System.out.println("問10");
			    	// 以下、回答です。
			    	c = 24; //年齢 整数型cに再代入
			    	i = (c >= 25); //ブーリアン型iに条件設定
			    	System.out.println(i); //結果の出力
	    	 
	    	 /* Q11
	    	  * 8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください
	    	  */
			    	// 改行と問⚪（題名）
			    	System.out.println(" ️");
			    	System.out.println("問11");
			    	// 以下、回答です。
			    	f = 168.5d; // 身長 倍精度浮動小数点数型fに再代入
			    	e = 64.2f; // 体重 単精度浮動小数点数型eに再代入
			    	String z = String.valueOf(c); //年齢を文字列型に変換
			    	String y = String.valueOf(f); //身長を文字列型に変換
			    	String x = String.valueOf(e); //体重を文字列型に変換
			    	System.out.println(z + y + x); //年齢・身長・体重を出力
	    	 
	    	 /* Q12
	    	  * 11で変換した【年齢・身長】を整数型に変換して出力してください
	    	  */
			    	// 改行と問⚪（題名）
			    	System.out.println(" ️");
			    	System.out.println("問12");
			    	// 以下、回答です。
			    	int w = Integer.parseInt(z); //年齢を整数型に変換
			    	double v = Double.parseDouble(y); //身長に小数点が含まれる。int型に直接変換できないため、Double型への変換を記入
			    	int u = (int)v; //身長を整数型に変換
			    	System.out.println(w); //年齢を出力
			    	System.out.println(u); //身長を出力
	    	 
	    	 /* Q13
	    	  * 12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください
	    	  * ただしif文は使わないでください
	    	  */
			    	// 改行と問⚪（題名）
			    	System.out.println("　️");
			    	System.out.println("問13");
			    	// 以下、回答です。
			    	i = (w >= 25) || (u >= 160); //ブーリアン型iに年齢が25もしくは身長が160以上の条件設定
			    	System.out.println(i); //結果の出力
	     }

	}
