import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class L04ExtractIntegers {
    public static void main(String[] args) {

        String inputPath = "C:\\WGU\\Java-Advanced-1\\Streams_Files_Directories\\Resources\\input.txt";
        String outputPath = "C:\\WGU\\Java-Advanced-1\\Streams_Files_Directories\\Resources\\output2.txt";

        try (FileInputStream fileInputStream = new FileInputStream(inputPath);
             FileOutputStream fileOutputStream = new FileOutputStream(outputPath)) {

            Scanner scanner = new Scanner(fileInputStream);

            while (scanner.hasNext()){
                if (scanner.hasNextInt()){
                    String currentInt = String.valueOf(scanner.nextInt());

                    for (int i = 0; i < currentInt.length(); i++) {

                        fileOutputStream.write(currentInt.charAt(i));
                    }

                    fileOutputStream.write(10);
                }
                scanner.next();
            }

            scanner.close();

        }  catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
