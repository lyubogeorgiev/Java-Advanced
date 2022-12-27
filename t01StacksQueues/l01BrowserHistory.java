package t01StacksQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class l01BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> browserHistory = new ArrayDeque<>();
        String input = scanner.nextLine();
        String currentUrl = "";

        while(!input.equals("Home")){
            if (input.equals("back")){
                if (browserHistory.size() > 0){
                    currentUrl = browserHistory.pop();
                    System.out.println(currentUrl);
                }else{
                    System.out.println("no previous URLs");
                }
            } else {
                if (!currentUrl.equals("")){
                    browserHistory.push(currentUrl);
                }
                currentUrl = input;
                System.out.println(currentUrl);
            }

            input = scanner.nextLine();

        }
    }
}
