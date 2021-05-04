/*
Bardillon, Romeo Jr, M.
BSIT 2-2
HeartRates.java
 */
package programming.assignment2;

import java.time.LocalDate;
import java.time.Period;

public class HeartRates {
    private String firstName, lastName;
    private int birthMonth, birthDate, birthYear;

    HeartRates(String firstName, String lastName, int birthMonth, int birthDate, int birthYear){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthMonth = birthMonth;
        this.birthDate = birthDate;
        this.birthYear = birthYear;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setBirthMonth(int birthMonth){
        this.birthMonth = birthMonth;
    }

    public int getBirthMonth(){
        return birthMonth;
    }

    public void setBirthDate(int birthDate){
        this.birthDate = birthDate;
    }

    public int getBirthDate(){
        return birthDate;
    }

    public void setBirthYear(int birthYear){
        this.birthYear = birthYear;
    }

    public int getBirthYear(){
        return birthYear;
    }

    public int age(){
        LocalDate today = LocalDate.now();
        LocalDate birthdate = LocalDate.of(birthYear, birthMonth, birthDate);
        return Period.between(birthdate, today).getYears();
    }

    public int maximumHeartRate(){
        return 220 - age();
    }

    public String targetHeartRate(){
        float lowestHeartRate = (float) (maximumHeartRate()*.50);
        float highestHeartRate = (float) (maximumHeartRate()*.85);
        return String.format("%.0f and %.0f beats per minute. %n", lowestHeartRate, highestHeartRate);
    }
}
