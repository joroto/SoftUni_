import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String wantedBook = scan.nextLine();
        boolean found = false;
        int booksChecked = 0;

        while (!found){
            String input = scan.nextLine();

            if (input.equals("No More Books")){
                break;
            }
            if (input.equals(wantedBook)){
                found = true;
            }else{
                booksChecked++;
            }
        }
        if(found){
            System.out.printf("You checked %d books and found it.", booksChecked);
        }else{
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", booksChecked);
        }
    }
}

