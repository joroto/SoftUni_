import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split(" ");

            Car car;
            if(input.length == 1){
                car = new Car(input[0]);
            }else {
                car = new Car(input[0], input[1], Integer.parseInt(input[2]));
            }
            System.out.println(car);
        }
    }
}
