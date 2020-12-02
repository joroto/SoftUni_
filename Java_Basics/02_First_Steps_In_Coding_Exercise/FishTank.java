import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lenght = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        double percent = Double.parseDouble(scan.nextLine());

        double aquariumV = lenght * width * height * 0.001;
        double percentShitInAquarium = percent * 0.01;
        double aquariumVMax = aquariumV * (1 - percentShitInAquarium);
        System.out.printf("%.2f", aquariumVMax);

    }
}
