import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        Map <String, int[]> heroes = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] hero = scan.nextLine().split("\\s+");
            String heroName = hero[0];
            int hp = Integer.parseInt(hero[1]);
            int mp = Integer.parseInt(hero[2]);
            int [] points = new int[]{hp, mp};

            heroes.put(heroName, points);
        }

        String input;

        while(!(input = scan.nextLine()).equals("End")) {
            String[] command = input.split(" - ");

            String heroName = command[1];
            switch (command[0]) {
                case "CastSpell":
                    int mpNeeded = Integer.parseInt(command[2]);
                    int left = heroes.get(heroName)[1] - mpNeeded;
                    if (heroes.get(heroName)[1] >= mpNeeded){
                        heroes.get(heroName)[1] -= mpNeeded;
                        System.out.println(heroName +" has successfully cast "+ command[3] + " and now has " + left +" MP!");
                    }else {
                        System.out.println(heroName + " does not have enough MP to cast " + command[3] +"!");
                    }
                        break;
                case "TakeDamage":
                    int damage = Integer.parseInt(command[2]);
                    if (heroes.get(heroName)[0] - damage > 0){
                        heroes.get(heroName)[0] -= damage;
                        System.out.println(heroName +" was hit for "+ damage +" HP by "+ command[3] +" and now has "+ heroes.get(heroName)[0] +" HP left!");
                    }else {
                        heroes.remove(heroName);
                        System.out.println(heroName +" has been killed by "+ command[3] +"!");
                    }
                    break;
                case "Recharge":
                    int amount = Integer.parseInt(command[2]);
                    if (heroes.get(heroName)[1] + amount > 200) {
                        amount = 200 - heroes.get(heroName)[1];
                    }
                        heroes.get(heroName)[1] += amount;
                        System.out.println(heroName +" recharged for "+ amount +" MP!");
                    break;
                case "Heal":
                    int amountHeal = Integer.parseInt(command[2]);
                    if (heroes.get(heroName)[0] + amountHeal > 100) {
                        amountHeal = 100 - heroes.get(heroName)[0];
                    }
                    heroes.get(heroName)[0] += amountHeal;
                    System.out.println(heroName +" healed for "+ amountHeal +" HP!");
                    break;
            }
        }
        heroes.entrySet().stream()
                .sorted((a,b) ->{
                    int result = b.getValue()[0] - a.getValue()[0];
                    if (result == 0){
                        result = a.getKey().compareTo(b.getKey());
                    }
                    return result;
                }).forEach(h -> {
            System.out.printf("%s\n", h.getKey());
            System.out.printf("  HP: %s\n", h.getValue()[0]);
            System.out.printf("  MP: %s\n", h.getValue()[1]);
        });
    }
}

