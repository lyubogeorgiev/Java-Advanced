package t01StacksQueues;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class e08InfixToPostfix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String infix = scanner.nextLine().replaceAll("\\s+", "");

        Map<Character, Integer> precedenceMap = Stream.of(new Object[][] {
                {'+', 1},
                {'-', 1},
                {'*', 2},
                {'/', 2},
        }).collect(Collectors.toMap(data -> (Character)data[0], data -> (Integer)data[1]));

        Deque<Character> stack = new ArrayDeque<>();
        List<Character> postfix = new ArrayList<>();

        int openingBracketActive = 0;

        for (int i = 0; i < infix.length(); i++) {
            char currentCharacter = infix.charAt(i);

            if (precedenceMap.containsKey(currentCharacter)){
                //if currentCharacter is an operator
                //check the precedence and do the steps

                if (stack.isEmpty()){
                    stack.push(currentCharacter);
                    continue;
                }

                char previousOperand = stack.peek();

                if (!precedenceMap.containsKey(previousOperand)){
                    stack.push(currentCharacter);
                    continue;
                }

                if (precedenceMap.get(previousOperand) < precedenceMap.get(currentCharacter)){
                    stack.push(currentCharacter);
                    continue;
                }

                //in this case the previous operand from the stack will go to the string
                postfix.add(stack.pop());
                //and the currentOperator will go into the stack
                stack.push(currentCharacter);
            }else if (currentCharacter == '('){
                //if currentCharacter is an opening bracket
                //here is the tricky part, we need some flag to know that we have an opening bracket
                //and threat the flow differently until we get the closing bracket
                stack.push(currentCharacter);
                openingBracketActive++;
            }else if (currentCharacter == ')'){
                //if currentCharacter is closing bracket
                openingBracketActive--;

                //now take everything out of the stack until make it to opening bracket and remove it, too
                char nextStackChar = stack.pop();

                while(nextStackChar != '('){
                    postfix.add(nextStackChar);
                    nextStackChar = stack.pop();
                }
            }
//            else if (openingBracketActive > 0){
//
//            }
                else{
                //the last case is the current character is an operand
                //here the operand will just simply go to the string
                postfix.add(currentCharacter);
            }
        }

        while (!stack.isEmpty()){
            postfix.add(stack.pop());
        }

//        postfix.forEach(x -> System.out.println(x));

        System.out.println(postfix.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }
}
