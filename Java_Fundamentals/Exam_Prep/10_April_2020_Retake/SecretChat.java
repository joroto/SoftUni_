import java.util.Collections;
import java.util.Scanner;

public class SecretChat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder input = new StringBuilder(scan.nextLine());

        String hm;
        while (!(hm = scan.nextLine()).equals("Reveal")){
            String[] line = hm.split(":\\|:");

            switch (line[0]){
                case "InsertSpace":
                    input.insert(Integer.parseInt(line[1]), " ");
                    System.out.println(input);
                    break;
                case "Reverse":
                    StringBuilder sub = new StringBuilder(line[1]);
                    if(input.toString().contains(sub)){
                        String temp = "";
                        temp =  input.toString().replaceFirst(sub.toString(), "");
                        sub.reverse();
                        temp += sub;
                        input = new StringBuilder(temp);
                        System.out.println(input);
                    }else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    String subString = line[1];
                    String replacement = line[2];

                    String temp = "";
                    temp = input.toString().replaceAll(subString, replacement);
                    input = new StringBuilder(temp);
                    System.out.println(input);

                    break;
            }
        }
        System.out.println("You have a new text message: "+ input);
    }
}
