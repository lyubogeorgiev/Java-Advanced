import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class L02WriteToFile {
    public static void main(String[] args) {
        String inputPath = "C:\\WGU\\Java-Advanced-1\\Streams_Files_Directories\\Resources\\input.txt";
        String outputPath = "C:\\WGU\\Java-Advanced-1\\Streams_Files_Directories\\Resources\\output.txt";

        String prohibitedSymbols = ".,!?";

        try (FileInputStream fileInputStream = new FileInputStream(inputPath);
                FileOutputStream fileOutputStream = new FileOutputStream(outputPath)) {

            int nextByte = fileInputStream.read();

            while (nextByte != -1){
                if (prohibitedSymbols.indexOf((char)nextByte) == -1) {
                    fileOutputStream.write(nextByte);
                }
                nextByte = fileInputStream.read();
            }

            fileOutputStream.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
