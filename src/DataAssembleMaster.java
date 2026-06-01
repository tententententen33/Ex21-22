public class DataAssembleMaster {
	public static void main(String[] args) {
		// 1. split による分解とループ操作 
		String rawCsv = "リンゴ , バナナ , ミカン ";
		String[] fruits = rawCsv.split(","); // カンマで分割。要素数は 3 の配列になる 

		System.out.println("--- split による分割とループ処理（トリミング付） ---");
		String[] processedFruits = new String[fruits.length];
		for (int i = 0; i < fruits.length; i++) {
			// 各要素の前後に残った不要な空白を除去して新しい配列に格納 
			processedFruits[i] = fruits[i].strip();
			System.out.println("インデックス " + i + " の要素: [" +
					processedFruits[i] + "]");
		}

		// 2. String.join によるスマートな結合 
		System.out.println("\n--- String.join による再結合 ---");
		String joinedText = String.join(" -> ", processedFruits);
		System.out.println("結合結果: " + joinedText); // 「リンゴ -> バナナ -> ミカン」を出力（文末に余計な矢印は付かない） 

		// 3. 整形出力 API の三変化（printf, format, formatted） 

		System.out.println("\n--- 整形出力 API の比較検証 ---");
		int price = 250;
		String name = "リンゴ";

		// ① System.out.printf : 画面に直接出力 
		System.out.printf("[printf] 商品名: %s, 価格: %d 円\n", name, price);

		// ② String.format : 整形された文字列の生成（変数に代入可能） 
		String formatResult = String.format("[format] 商品名: %s, 価格: %d 円",
				name, price);
		System.out.println(formatResult);

		// ③ 文字列インスタンスに対する .formatted() : 最もスマートな現代的記述 
		String formattedResult = "[formatted] 商品名: %s, 価格: %d 円".formatted(name, price);
		System.out.println(formattedResult);
	}
}