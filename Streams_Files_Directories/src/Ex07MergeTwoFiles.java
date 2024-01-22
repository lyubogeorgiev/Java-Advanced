import java.io.*;
import java.nio.Buffer;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Ex07MergeTwoFiles {
    public static void main(String[] args) {
        String userDir = System.getProperty("user.dir");
        String inputFirstFile =  userDir + "\\Streams_Files_Directories\\resources\\inputOne.txt";
        String inputSecondFile =  userDir + "\\Streams_Files_Directories\\Resources\\inputTwo.txt";
        String outputFilePath =  userDir + "\\Streams_Files_Directories\\Resources\\output_merged.txt";

        try (
                BufferedReader firstFileReader = new BufferedReader(new FileReader(inputFirstFile));
                BufferedReader secondFileReader = new BufferedReader(new FileReader(inputSecondFile));
                PrintWriter printWriter = new PrintWriter(outputFilePath)
                ){
//            List<String> mergedFilesLines = new ArrayList<>();

            String firstFileLine = firstFileReader.readLine();
            while (firstFileLine != null){
//                mergedFilesLines.add(firstFileLine);
                printWriter.println(firstFileLine);
                firstFileLine = firstFileReader.readLine();
            }

            String secondFileLine = secondFileReader.readLine();
            while (secondFileLine != null){
//                mergedFilesLines.add(secondFileLine);
                printWriter.println(secondFileLine);
                secondFileLine = secondFileReader.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
