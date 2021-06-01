package Тelephony;

import java.util.List;

public class Smartphone implements Callable, Browsable{
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public
    String call () {
        StringBuilder sb = new StringBuilder ();
        for (String number : numbers) {
            boolean numberIsValid = true;
            for (char c : number.toCharArray ()) {
                if (!Character.isDigit (c)) {
                    sb.append ("Invalid number!").append (System.lineSeparator ());
                    numberIsValid = false;
                    break;
                }
            }
            if (numberIsValid) {
                sb.append ("Calling... ").append (number).append (System.lineSeparator ());
            }
        }
        return sb.toString ().trim ();
    }

    @Override
    public
    String browse () {
        StringBuilder sb = new StringBuilder ();
        for (String url : urls) {
            boolean urlIsValid = true;
            for (char c : url.toCharArray ()) {
                if (Character.isDigit (c)) {
                    sb.append ("Invalid URL!").append (System.lineSeparator ());
                    urlIsValid = false;
                    break;
                }
            }
            if (urlIsValid) {
                sb.append ("Browsing: ").append (url).append ("!").append (System.lineSeparator ());
            }

        }
        return sb.toString ().trim ();
    }

}
