import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        StringBuilder build = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            if (String.valueOf(input.charAt(0)).equals("2")){
                if (input.length() == 1){
                    build.append("a");
                }else if(input.length() == 2){
                    build.append("b");
                }else {
                    build.append("c");
                }
            }
            if (String.valueOf(input.charAt(0)).equals("3")){
                if (input.length() == 1){
                    build.append("d");
                }else if(input.length() == 2){
                    build.append("e");
                }else {
                    build.append("f");
                }
            }
            if (String.valueOf(input.charAt(0)).equals("4")){
                if (input.length() == 1){
                    build.append("g");
                }else if(input.length() == 2){
                    build.append("h");
                }else {
                    build.append("i");
                }
            }
            if (String.valueOf(input.charAt(0)).equals("5")){
                if (input.length() == 1){
                    build.append("j");
                }else if(input.length() == 2){
                    build.append("k");
                }else {
                    build.append("l");
                }
            }
            if (String.valueOf(input.charAt(0)).equals("6")){
                if (input.length() == 1){
                    build.append("m");
                }else if(input.length() == 2){
                    build.append("n");
                }else {
                    build.append("o");
                }
            }
            if (String.valueOf(input.charAt(0)).equals("7")){
                if (input.length() == 1){
                    build.append("p");
                }else if(input.length() == 2){
                    build.append("q");
                }else if (input.length() == 3){
                    build.append("r");
                }else {
                    build.append("s");
                }
            }
            if (String.valueOf(input.charAt(0)).equals("8")){
                if (input.length() == 1){
                    build.append("t");
                }else if(input.length() == 2){
                    build.append("u");
                }else {
                    build.append("v");
                }
            }
            if (String.valueOf(input.charAt(0)).equals("9")) {
                if (input.length() == 1) {
                    build.append("w");
                } else if (input.length() == 2) {
                    build.append("x");
                } else if (input.length() == 3) {
                    build.append("y");
                } else {
                    build.append("z");
                }
            }
            if (String.valueOf(input.charAt(0)).equals("0")) {
                build.append(" ");
            }
        }
        System.out.println(build);
    }
}
