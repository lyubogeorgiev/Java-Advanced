import java.io.*;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex06WordCount {
    public static void main(String[] args) {
        String userDir = System.getProperty("user.dir");

        String inputWords = userDir + "\\Streams_Files_Directories\\Resources\\words.txt";
        String inputText = userDir + "\\Streams_Files_Directories\\Resources\\text_diff_order.txt";

        String outputText = userDir + "\\Streams_Files_Directories\\Resources\\results.txt";

        Map<String, Integer> wordsCount = new LinkedHashMap<>();

        try (BufferedReader wordReader = new BufferedReader(new FileReader(inputWords));
            BufferedReader textReader = new BufferedReader(new FileReader(inputText));
            PrintWriter printWriter = new PrintWriter(outputText);
        ) {
            String[] words = wordReader.readLine().split("\\s+");

            for (String word : words) {
                wordsCount.put(word, 0);
            }

            String line = textReader.readLine();

            while (line != null){
                String[] currentLineWords = line.split("[\\s+.,!?]");

                for (String currentWord : currentLineWords) {
                    if (wordsCount.containsKey(currentWord)){
                        wordsCount.put(currentWord, wordsCount.get(currentWord) + 1);
                    }
                }

                line = textReader.readLine();
            }

            //sort the map by value -- Marting explains that in the video.
            //Sort the words by frequency in descending order.
            Map<String, Integer> sortedMap = wordsCount.entrySet().stream()
                            .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                                    .collect(Collectors.toMap(
                                            Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

            sortedMap.forEach((k, v) -> printWriter.printf("%s - %d%n", k, v));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
