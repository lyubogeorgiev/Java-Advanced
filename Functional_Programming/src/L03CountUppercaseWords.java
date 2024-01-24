import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class L03CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] text = scanner.nextLine().split("\\s+");

        Predicate<String> isUppercase = word -> Character.isUpperCase(word.charAt(0));

        List<String> uppercaseWords = Arrays.stream(text).filter(isUppercase).toList();

        System.out.println(uppercaseWords.size());
        uppercaseWords.forEach(System.out::println);
    }
}
