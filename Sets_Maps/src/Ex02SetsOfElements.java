import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex02SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] setsLength = scanner.nextLine().split("\\s+");

        int n = Integer.parseInt(setsLength[0]);
        int m = Integer.parseInt(setsLength[1]);

        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();

        while (n-- > 0){
            firstSet.add(Integer.parseInt(scanner.nextLine()));
        }

        while (m-- > 0){
            secondSet.add(Integer.parseInt(scanner.nextLine()));
        }

        firstSet.retainAll(secondSet);

        firstSet.forEach(a -> System.out.print(a + " "));
    }
}
