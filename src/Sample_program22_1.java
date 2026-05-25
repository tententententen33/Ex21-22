// 第22_01_sample_program

import java.util.ArrayList;
import java.util.List;

public class Sample_program22_1 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("田中");
        names.add("鈴木");
        names.add("山本");

        // 追加
        names.add("佐藤");

        // 表示
        for (String name : names) {
            System.out.println(name);
        }
    }
}