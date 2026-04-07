import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileManager {
    public static void createFile(String fileName, String content) throws IOException {
        Path filepath = Paths.get(fileName);
        Path newFile = Files.createFile(filepath);
        Files.writeString(newFile, content);
    }

    public static String getContentFile(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        return Files.readString(path);
    }

    public static void deleteFile(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        Files.delete(path);
    }

}
