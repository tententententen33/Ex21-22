
public class StringBasicMaster {
	public static void main(String[] args) {
		String text = "ABCDE";

		// 1. substring の範囲抽出検証 
		System.out.println("--- substring(2, 4) の検証 ---");
		String subResult = text.substring(2, 4);
		System.out.println("切り出された文字列: " + subResult); // 「CD」を出力 
		System.out.println("文字数 (4 - 2): " + subResult.length()); // 2 を出力 

		// 2. startsWith(offset) の応用検証 
		String docCode = "2026_EHIME_FACTORY_01";

		System.out.println("--- startsWith のオフセット指定検証 ---");
		System.out.println("先頭が EHIME か: " + docCode.startsWith("EHIME")); // false 
		System.out.println("インデックス 5 からが EHIME か: " +
				docCode.startsWith("EHIME", 5)); // true 

		// 3. indexOf による文字検索と不在時の挙動 
		System.out.println("\n--- indexOf による位置検索検証 ---");
		int indexC = text.indexOf("C");
		int indexZ = text.indexOf("Z"); // 存在しない文字 
		System.out.println("'C' の出現位置: " + indexC); // 2 を出力 
		System.out.println("'Z' の出現位置（不在）: " + indexZ); // -1 を出力 

		// 実務的な検索結果の条件分岐処理パターン 
		if (indexZ == -1) {
			System.out.println("文字 'Z' は見つかりませんでした（安全に制御を継続）。 ");
		}
	}
}