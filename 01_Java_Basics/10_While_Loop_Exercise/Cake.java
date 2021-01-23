import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cakeWidth = Integer.parseInt(scan.nextLine());
        int cakeLength = Integer.parseInt(scan.nextLine());

        int cakeArea = cakeLength * cakeWidth;
        int piecesCount = 0;

        String input = scan.nextLine();

        while (!input.equals("STOP")){
            if (piecesCount < cakeArea){
                int inputt = Integer.parseInt(input);
                piecesCount += inputt;
                if (piecesCount < cakeArea) {
                    input = scan.nextLine();
                }
            }else {
                break;
            }
        }

        if (cakeArea < piecesCount){
            System.out.printf("No more cake left! You need %d pieces more.", piecesCount - cakeArea);
        }else {
            System.out.printf("%d pieces are left.", cakeArea - piecesCount);
        }
    }
}

