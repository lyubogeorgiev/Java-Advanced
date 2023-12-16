import java.util.*;

public class Ex08InfixToPostfix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputTokens = scanner.nextLine().split("\\s+");
        StringBuilder result = new StringBuilder();

        Deque<String> operatorsStack = new ArrayDeque<>();
        Map<String, Integer> operatorPrecedenceTable = new HashMap<>();

        operatorPrecedenceTable.putIfAbsent("+", 0);
        operatorPrecedenceTable.putIfAbsent("-", 0);
        operatorPrecedenceTable.putIfAbsent("/", 1);
        operatorPrecedenceTable.putIfAbsent("*", 1);
        operatorPrecedenceTable.putIfAbsent("^", 2);

        for (String symbol : inputTokens) {
            if (operatorPrecedenceTable.containsKey(symbol)) {
                int currentOperatorPrecedence = operatorPrecedenceTable.get(symbol);
                int lastOperatorPrecedence = -1;
                if (!operatorsStack.isEmpty() && !operatorsStack.peek().equals("(")){
                    lastOperatorPrecedence = operatorPrecedenceTable.get(operatorsStack.peek());
                }

                if (currentOperatorPrecedence > lastOperatorPrecedence) {
                    operatorsStack.push(symbol);
                } else {
                    if (symbol.equals("^")){
                        operatorsStack.push(symbol);
                    } else {
                        boolean isPrecedenceLower = true;

                        while (isPrecedenceLower){
                            if (!operatorsStack.isEmpty()){
                                result.append(operatorsStack.pop());
                            }

                            if (!operatorsStack.isEmpty()){
                                lastOperatorPrecedence = operatorPrecedenceTable.get(operatorsStack.peek());

                                if (lastOperatorPrecedence > currentOperatorPrecedence){
                                    isPrecedenceLower = false;
                                }
                            } else {
                                operatorsStack.push(symbol);
                                break;
                            }
                        }
                    }
                }
            } else if (symbol.equals("(")) {
                operatorsStack.push(symbol);
            } else if (symbol.equals(")")) {
                while (true){
                    String currentSymbol = operatorsStack.pop();
                    if (currentSymbol.equals("(")) {
                        break;
                    }

                    result.append(currentSymbol).append(" ");
                }
            } else {
                result.append(symbol).append(" ").append(" ");
            }
        }

        while (!operatorsStack.isEmpty()){
            result.append(operatorsStack.pop()).append(" ");
        }

        System.out.println(result.toString().trim());
    }
}
