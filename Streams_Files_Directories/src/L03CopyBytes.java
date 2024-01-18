import java.io.FileInputStream;
import java.io.IOException;

public class L03CopyBytes {
    public static void main(String[] args) {
        String path = "C:\\WGU\\Java-Advanced-1\\Streams_Files_Directories\\Resources\\input.txt";

        try (FileInputStream fileInputStream = new FileInputStream(path)) {
            int nextByte = fileInputStream.read();

            while (nextByte != -1){

                if (nextByte != 32 && nextByte != 10){

                    System.out.print(nextByte);
                } else {
                    System.out.print((char) nextByte);
                }

                nextByte = fileInputStream.read();
            }

            System.out.println();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
