package programming.assignment1;/*
Bardillon, Romeo Jr, M.
BSIT 2-2
Lottery.java
 */

import java.util.*;

public class Lottery {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sNumberPicks;
        List<Integer> winningNumbers = getWinningNumbers();
        List<Integer> userPicks = new ArrayList<>();
        List<String> numberPicksList;
        int numberOfDigitsMatched = 0;
        boolean isNumber;

        do {
            isNumber = true;
            System.out.print("Enter your lottery pick(2 digits and must not contain '0'): ");
            sNumberPicks = scanner.nextLine();
            numberPicksList = Arrays.asList(sNumberPicks.split(""));
            for (String numberPick : numberPicksList) {
                if (!isNumeric(numberPick)) {
                    isNumber = false;
                    break;
                }
                userPicks.add(Integer.parseInt(numberPick));
            }
            if (numberPicksList.size() != 2) {
                System.out.println("Lottery number must be 2 digits!");
            }
            if (!isNumber) {
                System.out.println("Please input digits only.");
            } else if (numberPicksList.contains("0")) {
                System.out.println("Lottery number must not contain '0'!");
            }
        } while (numberPicksList.size() != 2 || numberPicksList.contains("0") || !isNumber);


        System.out.printf("The lottery number is %s%s\n", winningNumbers.get(0), winningNumbers.get(1));
        if (winningNumbers.get(0).equals(userPicks.get(0)) && winningNumbers.get(1).equals(userPicks.get(1))) {
            System.out.println("Match in exact order: you win Php Php 100,000.00");
        } else {
            winningNumbers = mergeSameNumbers(winningNumbers);
            userPicks = mergeSameNumbers(userPicks);
            for (Integer winningNumber : winningNumbers) {
                for (Integer userPick : userPicks) {
                    if (userPick.equals(winningNumber)) {
                        numberOfDigitsMatched++;
                    }
                }
            }
            if (numberOfDigitsMatched == 2) {
                System.out.println("Match all the digits: you win Php Php 30,000.00");
            } else if (numberOfDigitsMatched == 1) {
                System.out.println("Match one digit: you win Php 10,000.00");
            } else {
                System.out.println("Sorry, no match");
            }
        }
    }

    private static List<Integer> getWinningNumbers() {
        List<Integer> winningNumbers = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            winningNumbers.add(new Random().nextInt(9) + 1);
        }

        return winningNumbers;
    }

    private static List<Integer> mergeSameNumbers(List<Integer> numberList) {
        List<Integer> mergedList = new ArrayList<>();

        if (numberList.get(0).equals(numberList.get(1))) {
            mergedList.add(numberList.get(0));
            return mergedList;
        }

        return numberList;
    }

    private static boolean isNumeric(final String str) {
        if (str == null || str.length() == 0) {
            return false;
        }

        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;

    }

}
