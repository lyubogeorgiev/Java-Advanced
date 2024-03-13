package Ex08CustomListSorter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CustomList<String> customList = new CustomList<>(String.class);

        String input = scanner.nextLine();

        while(!input.equals("END")){
            String[] tokens = input.split("\\s+");

            switch (tokens[0]){
                case "Add":
                    customList.add(tokens[1]);
                    break;
                case "Remove":
                    customList.remove(Integer.parseInt(tokens[1]));
                    break;
                case "Contains":
                    System.out.println(customList.contains(tokens[1]));
                    break;
                case "Swap":
                    customList.swap(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
                    break;
                case "Greater":
                    System.out.println(customList.countGreaterThan(tokens[1]));
                    break;
                case "Max":
                    System.out.println(customList.getMax());
                    break;
                case "Min":
                    System.out.println(customList.getMin());
                    break;
                case "Print":
                    for (int i = 0; i < customList.getSize(); i++) {
                        System.out.println(customList.getElement(i));
                    }
                    break;
                case "Sort":
                    Sorter.sort(customList);
                    break;
            }

            input = scanner.nextLine();
        }
    }
}
