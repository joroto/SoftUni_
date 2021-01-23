import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int peopleCount = scan.nextInt();
        int capacity = scan.nextInt();
        int courseCount = 0;

        while (peopleCount > 0){
            peopleCount -= capacity;
            courseCount++;
        }
        System.out.print(courseCount);
    }
}

