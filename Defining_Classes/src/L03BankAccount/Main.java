package L03BankAccount;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, BankAccount> accounts = new HashMap<>();

        String input = scanner.nextLine();

        int accountCounter = 1;

        while(!input.equals("End")){
            String[] tokens = input.split("\\s+");

            String command = tokens[0];

            if (command.equals("Create")){
                BankAccount bankAccount = new BankAccount();

                accounts.put(accountCounter, bankAccount);

                System.out.printf("Account ID%d created%n", accountCounter);
                accountCounter++;
            } else if (command.equals("Deposit")){
                int id = Integer.parseInt(tokens[1]);
                double amount = Double.parseDouble(tokens[2]);

                if (accounts.get(id) == null){
                    System.out.println("Account does not exist");
                    input = scanner.nextLine();

                    continue;
                }

                accounts.get(id).deposit(amount);

                DecimalFormat decimalFormat = new DecimalFormat("0.######");
                System.out.printf("Deposited %s to ID%d%n", decimalFormat.format(amount), id);
            } else if (command.equals("SetInterest")){
                double interest = Double.parseDouble(tokens[1]);

                BankAccount.setInterestRate(interest);


            } else if (command.equals("GetInterest")){
                int id = Integer.parseInt(tokens[1]);
                int years = Integer.parseInt(tokens[2]);

                if (accounts.get(id) == null){
                    System.out.println("Account does not exist");
                    input = scanner.nextLine();

                    continue;
                }

                System.out.println(String.format("%.2f", accounts.get(id).getInterest(years)));
            }

            input = scanner.nextLine();
        }
    }
}
