import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileCopyMoveDelete {
	public static void main(String[] args) {
		Path dir = Paths.get("data");
		Path source = dir.resolve("report.txt");
		Path backup = dir.resolve("report_backup.txt");
		Path moved = dir.resolve("report_moved.txt");

		try {
			Files.createDirectories(dir);
			Files.writeString(source, "ファイル操作の演習です。\n");

			Files.copy(source, backup, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("コピーしました: " + backup);

			Files.move(backup, moved, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("移動しました  : " + moved);

			Files.deleteIfExists(moved);
			System.out.println("削除しました  : " + moved);
		} catch (IOException e) {
			System.out.println("ファイル操作に失敗しました");
			e.printStackTrace();
		}
	}
}