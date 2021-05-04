package programming.assignment1;/*
Bardillon, Romeo Jr, M.
BSIT 2-2
Money.java
 */

import java.util.Scanner;

public class ConvertMoneyToPesoAndCents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount;
        int peso, cent, twentyFiveCent, fiveCent, oneCent;
        String numberStr, fractionalStr;

        System.out.print("Enter an amount: ");
        amount = scanner.nextDouble();
        peso = (int) amount;
        numberStr = (amount + "0");
        fractionalStr = numberStr.substring(numberStr.indexOf('.') + 1, numberStr.indexOf('.') + 3);
        cent = Integer.parseInt(fractionalStr);
        twentyFiveCent = cent / 25;
        fiveCent = (cent % 25) / 5;
        oneCent = cent % 5;
        System.out.println("Quantity\tCoins");
        System.out.printf("%s\t\t\t1 peso\n%s\t\t\t25 cents\n%s\t\t\t5 cents\n%s\t\t\t1 cent\n", peso, twentyFiveCent, fiveCent, oneCent);
    }
}
