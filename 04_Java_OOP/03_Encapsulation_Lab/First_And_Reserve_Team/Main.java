package First_And_Reserve_Team;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Team team = new Team("Black Eagles");

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String[] info = scan.nextLine().split("\\s+");
            Person player = new Person(info[0], info[1],
                    Integer.parseInt(info[2]), Double.parseDouble(info[3]));
            team.addPlayer(player);
        }
        System.out.println("First team have " + team.getFirstTeam().size() + " players");
        System.out.println("Reserve team have " + team.getReserveTeam().size() + " players");
    }
}
