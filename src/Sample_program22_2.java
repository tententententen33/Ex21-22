
// 第22_02_sample_program
import java.util.ArrayList;
import java.util.List;

public class Sample_program22_2 {
    public static void main(String[] args) {

        List<String> sampleList = new ArrayList<>();

        sampleList.add("Java");
        sampleList.add("Python");
        sampleList.add("C");

        sampleList.add("Go");
        sampleList.remove("Python");
        System.out.println(sampleList);
    }
}

