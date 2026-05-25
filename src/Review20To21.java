import java.text.Normalizer;
import java.util.Arrays;

public class Review20To21 {
	public static void main(String[] args) {
		String[] words = { "ｷﾞｶﾞ", "メガ", "㌐", "ギガ", "テラ" };
		String[] normalized = new String[words.length];

		for (int i = 0; i < words.length; i++) {
			normalized[i] = Normalizer.normalize(words[i], Normalizer.Form.NFKC);
		}

		System.out.println("正規化前: " + Arrays.toString(words));
		System.out.println("正規化後: " + Arrays.toString(normalized));

		Arrays.sort(normalized);
		System.out.println("ソート後: " + Arrays.toString(normalized));

		int index = Arrays.binarySearch(normalized, "ギガ");
		System.out.println("ギガの検索結果: " + index);
	}
}