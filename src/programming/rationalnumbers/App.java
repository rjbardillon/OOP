package programming.rationalnumbers;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.atomic.DoubleAdder;

public class App {
    private static final String DIVIDER = "**********************************";
    private static final File FILE = new File("C:\\Users\\romsk\\OneDrive - Polytechnic University of the " +
            "Philippines\\Documents\\Coding\\Java\\IntelliJ\\OOP\\src\\programming\\rationalnumbers\\input\\Input.txt");

    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(FILE)) {
            while (scanner.hasNext()) {
                String[] numbers = scanner.nextLine().split("and");

                if (numbers.length == 2) {
                    String firstNumber = numbers[0];
                    String secondNumber = numbers[1];

                    if (RationalNumber.isRational(firstNumber) && RationalNumber.isRational(secondNumber)) {
                        RationalOperations rationalOperations = new RationalOperationsImpl(new RationalNumber(firstNumber), new RationalNumber(secondNumber));
                        writeResult(rationalOperations);
                        printResult(rationalOperations);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void writeResult(RationalOperations rationalOperations) {
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\romsk\\OneDrive - Polytechnic University of the " +
                    "Philippines\\Documents\\Coding\\Java\\IntelliJ\\OOP\\src\\programming\\rationalnumbers\\output\\Output.txt", true);

            fileWriter.write("\n" + DIVIDER + "\n");
            fileWriter.write("Line: " + rationalOperations.displayLine() + "\n");
            fileWriter.write(DIVIDER + "\n");
            fileWriter.write("Sum = " + (float) rationalOperations.add() + "\n");
            fileWriter.write("Difference = " + (float) rationalOperations.subtract() + "\n");
            fileWriter.write("Product = " + (float) rationalOperations.multiply() + "\n");
            fileWriter.write("Quotient = " + (float) rationalOperations.divide() + "\n");
            fileWriter.write(rationalOperations.compare() + "\n");
            fileWriter.write(rationalOperations.lowestTerm() + "\n");
            fileWriter.write(rationalOperations.convertToFloatingPoint() + "\n");
            fileWriter.write(rationalOperations.absoluteValue() + "\n");
            fileWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void printResult(RationalOperations rationalOperations) {

        System.out.println("\n" + DIVIDER);
        System.out.println("Line: " + rationalOperations.displayLine());
        System.out.println(DIVIDER);
        System.out.println(rationalOperations.add());
        System.out.println(rationalOperations.subtract());
        System.out.println(rationalOperations.multiply());
        System.out.println(rationalOperations.divide());
        System.out.println(rationalOperations.compare());
        System.out.println(rationalOperations.lowestTerm());
        System.out.println(rationalOperations.convertToFloatingPoint());
        System.out.println(rationalOperations.absoluteValue());
    }
}

