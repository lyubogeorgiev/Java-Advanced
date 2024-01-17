import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class L02WriteToFile {
    public static void main(String[] args) {
        String inputPath = "C:\\WGU\\Java-Advanced-1\\Streams_Files_Directories\\Resources\\input.txt";
        String outputPath = "C:\\WGU\\Java-Advanced-1\\Streams_Files_Directories\\Resources\\output.txt";

        String textToBeWritten = "Some text here";

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
            fileInputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
