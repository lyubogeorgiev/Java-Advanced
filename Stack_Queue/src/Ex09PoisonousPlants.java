import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Ex09PoisonousPlants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Deque<Integer> plantsFirstQueue = new ArrayDeque<>();
        Deque<Integer> plantsSecondQueue = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(plantsFirstQueue::push);


        boolean isThereADeadPlant = true;
        int days = 0;

        while (isThereADeadPlant){
            isThereADeadPlant = false;

            while (!plantsFirstQueue.isEmpty()){
//                System.out.println();
//                System.out.println(" day " + days + " inside loop");

                int rightPlant = plantsFirstQueue.poll();
//                System.out.println("Right plant: " + rightPlant);
//                System.out.println("First Queue: " + plantsFirstQueue);
                if (plantsFirstQueue.isEmpty()){
                    plantsSecondQueue.offer(rightPlant);
                    break;
                }

                int leftPlant = plantsFirstQueue.peek();

//                System.out.println("Left plant: " + leftPlant);
//                System.out.println("First Queue: " + plantsFirstQueue);

                if (rightPlant > leftPlant){
                    isThereADeadPlant = true;
//                    System.out.println("there is a dead plant");

                } else {
                    plantsSecondQueue.offer(rightPlant);
//                    System.out.println("there isn't a dead plant");
                }

//                System.out.println("Second Queue: "  + plantsSecondQueue);
            }

            plantsFirstQueue.addAll(plantsSecondQueue);
            plantsSecondQueue.clear();


            if (isThereADeadPlant){

                days++;
            }
        }

        System.out.println(days);
    }
}
