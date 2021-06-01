package BankAccount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input;
        Map<Integer, BankAccount> database = new HashMap<>();

        while (!(input = scan.nextLine()).equals("End")){
            String[] tokens = input.split(" ");

            String output = null;
            switch (tokens[0]){
                case "Create":
                    BankAccount bankAccount = new BankAccount();
                    database.put(bankAccount.getId(), bankAccount);
                    output = "Account ID" + bankAccount.getId() + " created";
                    break;
                case "Deposit":
                    int id = Integer.parseInt(tokens[1]);
                    int amount = Integer.parseInt(tokens[2]);
                    if(id > database.size()) {
                        System.out.println("Account does not exist");
                        break;
                    }
                    database.get(id).deposit(amount);
                    output = "Deposited " + amount + " to ID" + id;
                    break;
                case "SetInterest":
                    double newInterest = Double.parseDouble(tokens[1]);
                    BankAccount.setInterestRate(newInterest);
                    break;
                case "GetInterest":
                    id = Integer.parseInt(tokens[1]);
                    int years = Integer.parseInt(tokens[2]);
                    if(id > database.size()) {
                        System.out.println("Account does not exist");
                        break;
                    }
                    double interest = database.get(id).getInterest(years);
                    output = String.format("%.2f", interest);
                    break;

            }
            if(output != null) {
                System.out.println(output);
            }
        }
    }
}
