import java.io.FileInputStream;
import java.io.IOException;

public class L01ReadFile {
    public static void main(String[] args) {
        String path = "C:\\WGU\\Java-Advanced-1\\Streams_Files_Directories\\Resources\\input.txt";

        try(FileInputStream fileInputStream = new FileInputStream(path)) {
            int nextByte = fileInputStream.read();

            while (nextByte != -1){

                System.out.print(Integer.toBinaryString(nextByte) + " ");

                nextByte = fileInputStream.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
