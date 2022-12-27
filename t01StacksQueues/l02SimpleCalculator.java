package t01StacksQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class l02SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputTokens = scanner.nextLine().split("\\s+");

        Deque<String> operators = new ArrayDeque<>();
        Deque<Integer> operands = new ArrayDeque<>();

        for (int i = inputTokens.length - 1; i >= 0; i--) {
            String element = inputTokens[i];
            if (element.equals("+") || element.equals("-")){
                operators.push(element);
            }else{
                operands.push(Integer.parseInt(element));
            }
        }

        while(!operators.isEmpty()){
            String operator = operators.pop();
            Integer firstOperand = operands.pop();
            Integer secondOperand = operands.pop();

//            System.out.printf("%d %s %d%n", firstOperand, operator, secondOperand);
            int result;
            if (operator.equals("+")){
                result = firstOperand + secondOperand;
            }else{
                result = firstOperand - secondOperand;
            }


//            System.out.println(result);

            operands.push(result);
        }

        System.out.println(operands.peek());
    }
}
