import java.io.*;

public class Ex03AllCapitals {
    public static void main(String[] args){
        String systemDir = System.getProperty("user.dir");
        String inputPath = systemDir + "\\Streams_Files_Directories\\Resources\\input_sum_lines.txt";
        String outputPath = systemDir + "\\Streams_Files_Directories\\Resources\\output5.txt";

        try (FileReader fileReader = new FileReader(inputPath);
             PrintStream printStream = new PrintStream(new FileOutputStream(outputPath))
        ){
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();

            while (line != null){
                printStream.println(line.toUpperCase());

                line = bufferedReader.readLine();
            }

            bufferedReader.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
