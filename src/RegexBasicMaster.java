public class RegexBasicMaster { 
    public static void main(String[] args) { 
 // 1. 量指定子「*」の動作検証（0 回以上の繰り返し） 
 String p1 = "ab*"; // a の後ろに b が 0 回以上 
        System.out.println("--- 量指定子 * のマッチング ---"); 
 System.out.println("a".matches(p1)); // b が 0 回なので true 
 System.out.println("ab".matches(p1)); // b が 1 回なので true 
 System.out.println("abbb".matches(p1));// b が 3 回なので true 
 
        // 2. 文字クラス否定形 [^A-Z] の検証 
 String p2 = "[^A-Z]"; // 英大文字「以外」の任意の 1 文字 
        System.out.println("--- 文字クラス否定 [^A-Z] の検証 ---"); 
        System.out.println("A".matches(p2));   // 英大文字なので false 
        System.out.println("a".matches(p2));   // 英小文字（大文字以外）なので true 
        System.out.println("9".matches(p2));   // 数字（大文字以外）なので true 
 
        // 3. String.matches の完全一致の罠の実証 
 String text = "住所は 790-8578 です"; 
 String rx = "\\d{3}-\\d{4}"; // 数字 3 桁-数字 4 桁の郵便番号パターン 
 
        System.out.println("--- String.matches 完全一致の罠 ---"); 
        System.out.println("単なるパターン指定: " + text.matches(rx)); // 部分一致しないため false 
         
        // 前後を .* で包むことで全体一致（疑似的な部分一致）に持ち込む 
        String wrappedRx = ".*" + rx + ".*"; 
        System.out.println("前後を.*で包んだ指定: " + text.matches(wrappedRx)); // 全体がマッチするため true 
    } 
} 