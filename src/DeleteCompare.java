import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteCompare {
	public static void main(String[] args) {
		Path file = Paths.get("data", "no_such_file.txt");

		try {
			boolean deleted = Files.deleteIfExists(file);
			System.out.println("deleteIfExists の結果: " + deleted);

			// 次の行は、存在しないファイルでは例外になる可能性があります。  
			// Files.delete(file); 
		} catch (IOException e) {
			System.out.println("削除に失敗しました");
			e.printStackTrace();
		}
	}
}