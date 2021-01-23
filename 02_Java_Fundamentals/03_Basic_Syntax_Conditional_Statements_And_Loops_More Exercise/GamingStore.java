import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double money = Double.parseDouble(scan.nextLine());
        double spent = 0;

        String command;
        while (!(command = scan.nextLine()).equals("Game Time")){
            switch (command) {
                case "OutFall 4":
                    if (money < 39.99){
                        System.out.println("Too Expensive");
                        break;
                    }
                    System.out.println("Bought OutFall 4");
                    money -= 39.99;
                    spent += 39.99;
                    break;
                case "RoverWatch Origins Edition":
                    if (money < 39.99){
                        System.out.println("Too Expensive");
                        break;
                    }
                    System.out.println("Bought RoverWatch Origins Edition");
                    money -= 39.99;
                    spent += 39.99;
                    break;
                case "CS: OG":
                    if (money < 15.99){
                        System.out.println("Too Expensive");
                        break;
                    }
                    System.out.println("Bought CS: OG");
                    money -= 15.99;
                    spent += 15.99;
                    break;
                case "Zplinter Zell":
                    if (money < 19.99){
                        System.out.println("Too Expensive");
                        break;
                    }
                    System.out.println("Bought Zplinter Zell");
                    money -= 19.99;
                    spent += 19.99;
                    break;
                case "Honored 2":
                    if (money < 59.99){
                        System.out.println("Too Expensive");
                        break;
                    }
                    System.out.println("Bought Honored 2");
                    money -= 59.99;
                    spent += 59.99;
                    break;
                case "RoverWatch":
                    if (money < 29.99){
                        System.out.println("Too Expensive");
                        break;
                    }
                    System.out.println("Bought RoverWatch");
                    money -= 29.99;
                    spent += 29.99;
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }
            if (money <= 0){
                System.out.println("Out of money!");
                break;
            }
        }
        if (money > 0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spent, money);
        }

    }
}

