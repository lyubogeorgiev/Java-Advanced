package t01StacksQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class l08BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<String> browserBack = new ArrayDeque<>();
        Deque<String> browserForward = new ArrayDeque<>();

        String input = scanner.nextLine();
        String currentUrl = null;

        while(!input.equals("Home")){
            if (input.equals("forward")){
                if (browserForward.isEmpty()){
                    System.out.println("no next URLs");
                }else{
                    browserBack.push(currentUrl);
                    currentUrl = browserForward.pop();
                    System.out.println(currentUrl);
                }
            }else if(input.equals("back")){
                if (browserBack.isEmpty()){
                    System.out.println("no previous URLs");
                }else{
                    browserForward.push(currentUrl);
                    currentUrl = browserBack.pop();
                    System.out.println(currentUrl);

                }
            }else{
                if (currentUrl != null){
                    browserBack.push(currentUrl);
                }

                currentUrl = input;
                System.out.println(currentUrl);

            }

            input = scanner.nextLine();
        }
    }
}
