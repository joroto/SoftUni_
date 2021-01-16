import java.util.Locale;
import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String rawKey = scan.nextLine();

        String input;

        while (!(input = scan.nextLine()).equals("Generate")){
            String[] line = input.split(">>>");

            switch (line[0]){
                case "Contains":
                    if(rawKey.contains(line[1])){
                        System.out.printf("%s contains %s\n", rawKey, line[1]);
                    }else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    int start = Integer.parseInt(line[2]);
                    int end = Integer.parseInt(line[3]);
                    String sub = rawKey.substring(start, end);
                    switch (line[1]){
                        case "Upper":
                            for (int i = start; i < end; i++) {
                                sub = sub.toUpperCase();
                                StringBuilder sb = new StringBuilder();
                                sb.append(rawKey);
                                sb.replace(start, end, (sub));
                                rawKey = sb.toString();
                            }
                            break;
                        case "Lower":
                            for (int i = start; i < end; i++) {
                               sub = sub.toLowerCase();
                                StringBuilder sb = new StringBuilder();
                                sb.append(rawKey);
                                sb.replace(start, end, (sub));
                                rawKey = sb.toString();
                            }
                            break;
                    }
                    System.out.println(rawKey);
                    break;
                case "Slice":
                    int start2 = Integer.parseInt(line[1]);
                    int end2 = Integer.parseInt(line[2]);
                    StringBuilder delete = new StringBuilder();
                    delete.append(rawKey);
                    delete.replace(start2, end2, "");
                    rawKey = delete.toString();

                    System.out.println(rawKey);
                    break;
            }
        }
        System.out.printf("Your activation key is: %s", rawKey);
    }
}
