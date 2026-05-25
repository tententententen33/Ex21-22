
// 第22_03_sample_program
import java.util.ArrayList;
import java.util.List;

public class Sample_program22_3 {
	public static void main(String[] args) {

		List<String> sampleList = new ArrayList<>();

		sampleList.add("田中");
		sampleList.add("鈴木");
		sampleList.add("田中");
		
		boolean flag = false;
		int count = 0;

		for (String name : sampleList) {
			System.out.println(name);
		}

		for (String name : sampleList) {
			if (name.equals("田中")) {
				flag = true;
//				count++;
			}
		}

		if(flag) System.out.println("見つかりました");
		
		System.out.println("田中の件数:" + count + "件");
		
//		for (int i = sampleList.size() - 1; i >= 0; i--) {
//			if (sampleList.get(i).equals("田中")) {
//				sampleList.remove(i);
//			}
//		}
		
		while(sampleList.contains("田中")) {
			count++;
			sampleList.remove("田中");
		}
		
		System.out.println(sampleList.toString());
	}
}
