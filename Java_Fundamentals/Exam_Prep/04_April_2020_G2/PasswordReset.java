import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        String com;
        while (!(com = scan.nextLine()).equals("Done")){
            String[] line = com.split(" ");

            switch (line[0]){
                case "TakeOdd":
                    String temp1 = "";
                    for (int i = 1; i < input.length(); i+=2) {
                        temp1 += input.charAt(i);
                    }
                    input = temp1;
                    System.out.println(input);
                    break;
                case "Cut":
                    int index = Integer.parseInt(line[1]);
                    int length = Integer.parseInt(line[2]);

                    String firstPart = input.substring(0, index);
                    String secondPart = input.substring(index + length);

                    input = firstPart + secondPart;

                    System.out.println(input);
                    break;
                case "Substitute":
                    String subString = line[1];
                    String substitute = line[2];
                    String temp = "";

                    if(input.contains(String.valueOf(subString))){
                        temp = input.replaceAll(subString, substitute);
                        input = temp;
                        System.out.println(input);
                    }else {
                        System.out.println("Nothing to replace!");
                    }
                    break;

            }
        }
        System.out.println("Your password is: " + input);
    }
}
