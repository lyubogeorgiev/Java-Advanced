import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex02SumBytes {
    public static void main(String[] args) {
        String path = System.getProperty("user.dir") + "\\" + "Streams_Files_Directories\\Resources\\input_sum_lines.txt";


        int sum = 0;

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            int nextByte = bufferedReader.read();


            while (nextByte != -1){
                if (nextByte != 10 && nextByte != 13){

                    sum += nextByte;
                }


                nextByte = bufferedReader.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(sum);
    }
}
