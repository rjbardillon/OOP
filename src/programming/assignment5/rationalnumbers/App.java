/*
Bardillon, Romeo Jr, M.
BSIT 2-2
App.java
 */
package programming.assignment5.rationalnumbers;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static final String DIVIDER = "**********************************";
    private static final File FILE = new File("D:/input.txt");

    public static void main(String[] args) throws IOException {

        try (Scanner scanner = new Scanner(FILE)) {
            int index = 0;
            while (scanner.hasNext()) {
                String[] numbers = scanner.nextLine().split("and");
                String separator = "√";
                if (numbers.length == 2) {
                    String firstNumber = numbers[0];
                    String secondNumber = numbers[1];
                    double dFirstNumber;
                    double dSecondNumber;

                    if (firstNumber.charAt(0) == '√') {
                        int sepPos = firstNumber.indexOf(separator);
                        if (sepPos == -1) {
                            System.out.println("");
                        }
                        dFirstNumber = Math.sqrt(Double.parseDouble(firstNumber.substring(sepPos + separator.length())));
                        firstNumber = String.valueOf(dFirstNumber);
                    }
                    if (secondNumber.charAt(0) == '√') {
                        int sepPos = secondNumber.indexOf(separator);
                        if (sepPos == -1) {
                            System.out.println("");
                        }
                        dSecondNumber = Math.sqrt(Double.parseDouble(secondNumber.substring(sepPos + separator.length())));
                        secondNumber = String.valueOf(dSecondNumber);
                    }
                    if (RationalNumber.isRational(firstNumber) && RationalNumber.isRational(secondNumber)) {
                        RationalOperations rationalOperations = new RationalOperationsImpl(new RationalNumber(firstNumber), new RationalNumber(secondNumber));
                        writeResult(rationalOperations, index);
                        printResult(rationalOperations, index);
                    }
                    index += 1;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void writeResult(RationalOperations rationalOperations, int index) {
        try (Scanner scanner = new Scanner(FILE)) {
            ArrayList<String> entries = new ArrayList<>();
            FileWriter fileWriter = new FileWriter("D:/results.txt", true);

            while (scanner.hasNext()) {
                entries.add(scanner.nextLine());
            }
            fileWriter.write("\n" + DIVIDER + "\n");
            fileWriter.write("Line: " + entries.get(index) + "\n");
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
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void printResult(RationalOperations rationalOperations, int index) {
        try (Scanner scanner = new Scanner(FILE)) {
            ArrayList<String> entries = new ArrayList<>();

            while (scanner.hasNext()) {
                entries.add(scanner.nextLine());
            }
            System.out.println("\n" + DIVIDER);
            System.out.println("Line: " + entries.get(index));
            System.out.println(DIVIDER);
            System.out.println("Sum = " + rationalOperations.add());
            System.out.println("Difference = " + rationalOperations.subtract());
            System.out.println("Product = " + rationalOperations.multiply());
            System.out.println("Quotient = " + rationalOperations.divide());
            System.out.println(rationalOperations.compare());
            System.out.println(rationalOperations.lowestTerm());
            System.out.println(rationalOperations.convertToFloatingPoint());
            System.out.println(rationalOperations.absoluteValue());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

