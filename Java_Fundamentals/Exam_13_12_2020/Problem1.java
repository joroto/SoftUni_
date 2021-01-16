import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder name = new StringBuilder(scan.nextLine());

        String input;

        while (!(input = scan.nextLine()).equals("Sign up")){
            String[] line = input.split(" ");

            switch (line[0]){
                case "Case":
                    if (line[1].equals("lower")){
                        String temp = name.toString();
                        temp = temp.toLowerCase();
                        name = new StringBuilder(temp);
                        System.out.println(name);
                    }
                    if (line[1].equals("upper")){
                        String temp = name.toString();
                        temp = temp.toUpperCase();
                        name = new StringBuilder(temp);
                        System.out.println(name);
                    }
                    break;
                case "Reverse":
                    if(Integer.parseInt(line[1]) >= 0 && Integer.parseInt(line[1]) < name.length() && Integer.parseInt(line[2]) >0 && Integer.parseInt(line[2]) < name.length()) {
                        StringBuilder sub = new StringBuilder();
                        sub.append(name.substring(Integer.parseInt(line[1]), Integer.parseInt(line[2]) + 1));
                        sub.reverse();
                        System.out.println(sub);
                    }
                    break;
                case "Cut":
                    if (name.toString().contains(line[1])){
                        String temp = name.toString().replace(line[1], "");
                        name = new StringBuilder(temp);
                        System.out.println(name);
                    }else {
                        System.out.println("The word "+ name + " doesn't contain "+ line[1] + ".");
                    }
                    break;
                case "Replace":
                    String temp = name.toString().replace(line[1], "*");
                    name = new StringBuilder(temp);
                    System.out.println(name);
                    break;
                case "Check":
                    if (name.toString().contains(line[1])){
                        System.out.println("Valid");
                    }else {
                        System.out.println("Your username must contain "+ line[1]+ ".");
                    }
                    break;
            }
        }
    }
}
