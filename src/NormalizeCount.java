import java.text.Normalizer;
import java.util.Arrays;

public class NormalizeCount {
	public static void main(String[] args) {
		String[] plans = { "ｷﾞｶﾞ", "メガ", "㌐", "ギガ", "テラ", "ｷﾞｶﾞ" };
		String[] normalized = new String[plans.length];

		for (int i = 0; i < plans.length; i++) {
			normalized[i] = Normalizer.normalize(plans[i], Normalizer.Form.NFKC);
		}

		int gigaCount = 0;
		for (String plan : normalized) {
			if (plan.equals("ギガ")) {
				gigaCount++;
			}
		}

		System.out.println("正規化前: " + Arrays.toString(plans));
		System.out.println("正規化後: " + Arrays.toString(normalized));
		System.out.println("ギガ件数: " + gigaCount);
	}
}