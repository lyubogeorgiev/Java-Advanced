import java.io.*;
import java.nio.Buffer;
import java.nio.file.FileSystems;

public class Ex01SumLines {
    public static void main(String[] args) throws IOException {

        String path = System.getProperty("user.dir") + "\\" + "Streams_Files_Directories\\Resources\\input_sum_lines.txt";

//        System.out.println(path);

        File file = new File(path);

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        String line = bufferedReader.readLine();
        while (line != null){

//            System.out.println(line);
            int sum = 0;
            for (int i = 0; i < line.length(); i++) {
                int value = (int) line.charAt(i);

//                System.out.print(value + " ");

                sum += value;
            }

            System.out.println(sum);

            line = bufferedReader.readLine();
        }
    }
}
