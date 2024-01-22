import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;

public class Ex04CountCharacterTypes {
    public static void main(String[] args) {
        String systemPath = System.getProperty("user.dir");
        String inputPath = systemPath + "\\Streams_Files_Directories/Resources/input_sum_lines.txt";
        String outputPath = systemPath + "\\Streams_Files_Directories/Resources/output6.txt";

        //create a lookup table
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        Set<Character> punctuationMarks = new HashSet<>(Arrays.asList('!', ',', '.', '?'));

        Map<String, Integer> characterTypesCount = new LinkedHashMap<>() {{
            put("Vowels", 0);
            put("Other symbols", 0);
            put("Punctuation", 0);
        }};

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputPath));
             PrintStream printStream = new PrintStream(outputPath)
        ){
            int nextByte = bufferedReader.read();
            char currentChar = (char) nextByte;

            while (nextByte != -1){

                if (vowels.contains(currentChar)){
                    characterTypesCount.put("Vowels", characterTypesCount.get("Vowels") + 1);
                } else if (punctuationMarks.contains(currentChar)){
                    characterTypesCount.put("Punctuation", characterTypesCount.get("Punctuation") + 1);
                } else if (nextByte != 32 && nextByte != 13 && nextByte != 10){
                    characterTypesCount.put("Other symbols", characterTypesCount.get("Other symbols") + 1);
                }

                nextByte = bufferedReader.read();
                currentChar = (char) nextByte;
            }

            for (Map.Entry<String, Integer> entry : characterTypesCount.entrySet()) {
                printStream.printf("%s: %d%n", entry.getKey(), entry.getValue());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
