import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesStatusCheck {
	public static void main(String[] args) {
		Path path = Paths.get("data", "report.txt");
		
		System.out.println("対象: " + path);
        System.out.println("存在するか      : " + Files.exists(path));  
        System.out.println("通常ファイルか  : " + Files.isRegularFile(path));  
        System.out.println("フォルダーか    : " + Files.isDirectory(path));  
        System.out.println("読み取り可能か  : " + Files.isReadable(path));  
        System.out.println("書き込み可能か  : " + Files.isWritable(path)); 
	}
}
