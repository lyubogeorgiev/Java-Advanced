import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class L05WriteEveryThirdLine {
    public static void main(String[] args) {
        Path inputPath = Paths.get("C:\\WGU\\Java-Advanced-1\\Streams_Files_Directories\\Resources\\input.txt");
        Path outputPath = Paths.get("C:\\WGU\\Java-Advanced-1\\Streams_Files_Directories\\Resources\\output3.txt");

        try {

            List<String> lines = Files.readAllLines(inputPath);

            List<String> modifiedLines = new ArrayList<>();

            for (int i = 2; i < lines.size(); i += 3) {
                modifiedLines.add(lines.get(i));
            }

            Files.write(outputPath, modifiedLines);
        } catch (IOException e){
            System.out.println(e);
        }
    }
}
