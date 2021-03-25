package Food_Shortage;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        Map<String, Buyer> buyers = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] inputArr = scan.nextLine().split("\\s+");

            if(inputArr.length == 4){
                Citizen citizen = new Citizen(inputArr[0]
                , Integer.parseInt(inputArr[1]), inputArr[2], inputArr[3]);
                buyers.put(inputArr[0], citizen);
                citizen.buyFood();
            }else if(inputArr.length == 3){
                Rebel rebel = new Rebel(inputArr[0], Integer.parseInt(inputArr[1]),
                        inputArr[2]);
                buyers.put(inputArr[0], rebel);
                rebel.buyFood();
            }
        }
        String input;
        int sum = 0;

        while (!(input = scan.nextLine()).equals("End")) {
            if(buyers.containsKey(input)){
                sum += buyers.get(input).getFood();
            }
        }

        System.out.println(sum);

    }
}
