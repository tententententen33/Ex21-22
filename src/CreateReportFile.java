import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateReportFile {
	public static void main(String[] args) {
		Path dir = Paths.get("date");
		Path file = dir.resolve("report.txt");
		
		try {
			Files.createDirectories(dir);
			Files.writeString(file, "第21回のレポートです \nFilesクラスで作成しました \n");
			System.out.println("作成しました: " + file.toAbsolutePath());
		}catch (IOException e) {
			System.out.println("ファイル操作でエラーが発生しました");
			e.printStackTrace();
		}
	}
}
