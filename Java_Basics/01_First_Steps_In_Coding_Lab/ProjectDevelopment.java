import java.util.Scanner;

public class ProjectDevelopment {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int proekti = Integer.parseInt(scanner.nextLine());
        int chasove = proekti * 3;

        System.out.printf("The architect " + name + " will need " + chasove + " hours to complete " + proekti + " project/s.");

    }
}
