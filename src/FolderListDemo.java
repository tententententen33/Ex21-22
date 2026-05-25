import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FolderListDemo {
	public static void main(String[] args) {
		Path dir = Paths.get("data");
		try {
			Files.createDirectories(dir);
			Files.writeString(dir.resolve("a.txt"), "A\n");
			Files.writeString(dir.resolve("b.txt"), "B\n");
			Files.writeString(dir.resolve("c.txt"), "C\n");
			try (Stream<Path> stream = Files.list(dir)) {
				stream.forEach(path -> System.out.println(path.getFileName()));
			}
		} catch (IOException e) {
			System.out.println("一覧取得に失敗しました");
			e.printStackTrace();
		}
	}
}