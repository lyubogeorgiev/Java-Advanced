import java.io.*;

public class Ex05LineNumbers {
    public static void main(String[] args) {
        String userDir = System.getProperty("user.dir");

        String inputPath = userDir + "\\Streams_Files_Directories\\Resources\\inputLineNumbers.txt";
        String outputPath = userDir + "\\Streams_Files_Directories\\Resources\\outputLineNumbers.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputPath));
             PrintWriter printWriter = new PrintWriter(outputPath)
        ){
            String line = bufferedReader.readLine();
            int lineCount = 1;

            while (line != null){
                printWriter.printf("%d. %s%n", lineCount, line);

                lineCount++;
                line = bufferedReader.readLine();
            }
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
