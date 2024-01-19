import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class L06SortLines {
    public static void main(String[] args) throws IOException {
        Path inputPath = Paths.get("C:\\WGU\\Java-Advanced-1\\Streams_Files_Directories\\Resources\\input.txt");
        Path outputPath = Paths.get("C:\\WGU\\Java-Advanced-1\\Streams_Files_Directories\\Resources\\output4.txt");

        List<String> lines = Files.readAllLines(inputPath);

        List<String> sortedLines = lines.stream().sorted().toList();

        Files.write(outputPath, sortedLines);
    }
}
