import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String type = scan.nextLine();
        if (type.equals("square")){
            double a = Double.parseDouble(scan.nextLine());
            double area = a * a;
            System.out.printf("%.3f", area);
        }
        else if (type.equals("rectangle")){
            double a = Double.parseDouble(scan.nextLine());
            double b = Double.parseDouble(scan.nextLine());
            double area = a * b;
            System.out.printf("%.3f", area);
        }
        else if (type.equals("circle")){
            double r = Double.parseDouble(scan.nextLine());
            double area = r * r * 3.14159265359;
            System.out.printf("%.3f", area);
        }
        else if (type.equals("triangle")){
            double a = Double.parseDouble(scan.nextLine());
            double h = Double.parseDouble(scan.nextLine());
            double area = (a * h) / 2;
            System.out.printf("%.3f", area);
        }

    }
}
