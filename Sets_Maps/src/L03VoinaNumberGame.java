import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class L03VoinaNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> playerOne = new LinkedHashSet<>();
        int[] tempOne = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int i : tempOne) {
            playerOne.add(i);
        }

        Set<Integer> playerTwo = new LinkedHashSet<>();
        int[] tempTwo = Arrays.stream(scanner.nextLine().split(("\\s+")))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i : tempTwo){
            playerTwo.add(i);
        }

        int count = 50;

        while (count-- > 0 && !playerOne.isEmpty() && !playerTwo.isEmpty()){
            int playerOneCurrentCard = playerOne.iterator().next();
            int playerTwoCurrentCard = playerTwo.iterator().next();

            playerOne.remove(playerOneCurrentCard);
            playerTwo.remove(playerTwoCurrentCard);

            if (playerOneCurrentCard > playerTwoCurrentCard){
                playerOne.add(playerOneCurrentCard);
                playerOne.add(playerTwoCurrentCard);
            } else if (playerOneCurrentCard < playerTwoCurrentCard){
                playerTwo.add(playerOneCurrentCard);
                playerTwo.add(playerTwoCurrentCard);
            }

            if (playerOne.isEmpty() || playerTwo.isEmpty()){
                break;
            }
        }

        if (playerOne.size() > playerTwo.size()){
            System.out.println("First player win!");
        } else if (playerOne.size() <playerTwo.size()){
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }
    }
}
