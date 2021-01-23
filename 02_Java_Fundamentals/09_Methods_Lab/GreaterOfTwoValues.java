import java.util.Scanner;

public class GreaterOfTwoValues {
    static int getMaxInt (int first, int second){
        return Math.max(first, second);
    }

    static char getMax (char first, char second){
        if (first > second){
            return first;
        }
        return second;
    }

    static String getMax (String first, String second){
        if (first.compareTo(second) >= 0){
            return first;
        }
        return second;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String type = scan.nextLine();
        String first = scan.nextLine();
        String second = scan.nextLine();

        if (type.equals("int")){
            System.out.print(getMaxInt(Integer.parseInt(first), Integer.parseInt(second)));
        }else {
            System.out.print(getMax(first, second));
        }
    }
}

