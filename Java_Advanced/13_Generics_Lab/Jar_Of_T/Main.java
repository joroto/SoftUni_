package Jar_Of_T;

public class Main {
    public static void main(String[] args) {
        Jar<Integer> jarOne = new Jar<>();
        Jar<String> jarTwo = new Jar<>();
        jarOne.add (13);
        jarTwo.add ("Pesho");
        jarTwo.add ("14");
        String remove = jarTwo.remove ();
    }
}
