package programming.assignment5;


import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class RationalNumbers {
    private static String formatResult(double result) {
        return new DecimalFormat("0.00").format(result);
    }

    public static float addition(double x, double y){
        return (float) (x + y);
    }

    public static float subtraction(double x, double y){
        return (float) (x - y);
    }

    public static float multiplication(double x, double y){
        return (float) (x * y);
    }

    public static float division(double x, double y){
        return (float) (x / y);
    }

    public static float lowestTerm(double x){
        return 0;
    }

    public static double[] getNumbers(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        double[] numbers = new double[2];
        while (scanner.hasNext()){

        }
        return numbers;
    }

    public static float initialFloatExtractor(String str) {
        String separator = "and";
        int sepPos = str.lastIndexOf(separator);
        if (sepPos == -1) {
            System.out.println("");
        }
        String output = str.substring(0, sepPos).replaceAll("[^0-9]", "");
        return Float.parseFloat(output);
    }

    public static float lastFloatExtractor(String str) {
        String separator = "and";
        int sepPos = str.indexOf(separator);
        if (sepPos == -1) {
            System.out.println("");
        }
        String output = str.substring(sepPos + separator.length()).replaceAll("[^0-9]", "");
        return Float.parseFloat(output);
    }

    public static void main(String[] args){
        System.out.println(subtraction(3.7, 3.3));
        System.out.println(addition(3.7, 3.31));
        String line = "asdasdaksj1hasdjkhkj1000 and 1098";
        System.out.printf("First num = %s Second num = %s", initialFloatExtractor(line), lastFloatExtractor(line));
    }
}