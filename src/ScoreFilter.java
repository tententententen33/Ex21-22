import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Random;

public class ScoreFilter {
	public static void main(String[] args) {
		Random random = new Random(300);
		int[] scores = new int[10];

		for (int i = 0; i < scores.length; i++) {
			scores[i] = random.nextInt(41) + 60;
		}

		int total = 0;
		for (int score : scores) {
			total += score;
		}
		double average = total / (double) scores.length;

		int[] passed = new int[scores.length];
		int count = 0;
		for (int score : scores) {
			if (score >= average) {
				passed[count] = score;
				count++;
			}
		}

		int[] result = Arrays.copyOf(passed, count);
		Arrays.sort(result);

		NumberFormat nf = NumberFormat.getNumberInstance();
		nf.setMaximumFractionDigits(1);

		System.out.println("全点数      : " + Arrays.toString(scores));
		System.out.println("平均点      : " + nf.format(average));
		System.out.println("平均点以上  : " + Arrays.toString(result));
	}
}