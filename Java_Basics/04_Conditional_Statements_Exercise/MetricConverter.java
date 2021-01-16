import java.util.Scanner;
 
public class MetricConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
        double input = Double.parseDouble(scan.nextLine());
        String inputType = scan.nextLine();
        String outputType = scan.nextLine();
 
        double inputInCm = 0;
        double inputInMm = 0;
        double inputInM = 0;
 
        //unless...
        //m cm mm
        if (inputType.equals("m")){
            inputInCm = input * 100;
            inputInMm = input * 1000;
        }else if (inputType.equals("cm")){
            inputInM = input / 100;
            inputInMm = input * 10;
        }else if (inputType.equals("mm")){
            inputInCm = input / 10;
            inputInM = input / 1000;
        }
 
        if (outputType.equals("m")){
            System.out.printf("%.3f", inputInM);
        }else if (outputType.equals("cm")){
            System.out.printf("%.3f", inputInCm);
        }else if (outputType.equals("mm")){
            System.out.printf("%.3f", inputInMm);
        }
    }
}
