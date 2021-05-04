/*
Bardillon, Romeo Jr, M.
BSIT 2-2
HeartRateApp.java
 */
package programming.assignment2;

import java.util.Scanner;

public class HeartRateApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String firstName, lastName;
        int birthMonth, birthDate, birthYear;

        // prompts for the person’s information
        System.out.print("What is your First Name? ");
        firstName = scanner.nextLine();
        System.out.print("What is your Last Name? ");
        lastName = scanner.nextLine();
        System.out.print("What is your Birth Month? (MM) ");
        birthMonth = scanner.nextInt();
        System.out.print("What is your Birth Date? (DD) ");
        birthDate = scanner.nextInt();
        System.out.print("What is your Birth Year? (YYYY) ");
        birthYear = scanner.nextInt();

        // instantiates an object of class HeartRates
        HeartRates studentRomeo = new HeartRates(firstName, lastName, birthMonth, birthDate, birthYear);
        // and prints the information from that object including the person’s first name, last name, date of birth
        System.out.printf("First Name: %s %nLast Name: %s %nDate of Birth: %s-%d-%d %n", studentRomeo.getFirstName(),
                studentRomeo.getLastName(), studentRomeo.getBirthMonth(), studentRomeo.getBirthDate(), studentRomeo.getBirthYear());
        // then calculates and prints the person’s age in (years).
        System.out.printf("Age: %d %n", studentRomeo.age());
        // maximum heart rate and target heart rate range
        System.out.printf("Maximum Heart Rate: %d %nYour target Heart Rate is in between of %s ", studentRomeo.maximumHeartRate(), studentRomeo.targetHeartRate());

    }
}
