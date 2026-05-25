import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Random;

public class ScoreArrayReport {
	public static void main(String[] args) {
		Random random = new Random(100);
		int[] scores = new int[10];
		
		for (int i = 0; i < scores.length; i++) {
			scores[i] = random.nextInt(41) + 60;//60～100点
		}
		
		int total = 0;
		int max = scores[0];
		int min = scores[0];
		
		for (int score : scores) {
			total += score;
			max = Math.max(max, score);
			min = Math.min(min, score);
		}
		
		double average =total/(double)scores.length;
		NumberFormat nf = NumberFormat.getNumberInstance();
		nf.setMaximumFractionDigits(1);
		
		System.out.println("点数一覧" + Arrays.toString(scores));
		System.out.println("合計点" + total);
		System.out.println("平均点" + nf.format(average));
		System.out.println("最高点" + max);
		System.out.println("最低点" + min);
	}
}
