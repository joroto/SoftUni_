import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double record = Double.parseDouble(scan.nextLine());
        double distance = Double.parseDouble(scan.nextLine());
        double time = Double.parseDouble(scan.nextLine()); //to swim 1m

        double slowdown = distance / 15;
        slowdown = Math.floor(slowdown);
        double slowdownTime = slowdown * 12.5;
        double timeToSwim = distance * time;
        timeToSwim = timeToSwim + slowdownTime;

        double timeToRecord = 0;

        if (timeToSwim >= record){
            timeToRecord = timeToSwim - record;
            System.out.printf("No, he failed! He was %.2f seconds slower.", timeToRecord);
        }else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", timeToSwim);
        }

    }
}

