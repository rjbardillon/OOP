/*
Bardillon, Romeo Jr, M.
BSIT 2-2
DateConverter.java
 */
package programming.assignment4;

import java.util.InputMismatchException;
import java.util.Scanner;

/*You will define three exception classes, one called DayException, another called MonthException, and a third called YearException.*/
class DayException extends Exception {
    DayException(){
        super("Invalid Day. Please try again. ");
    }
}

class MonthException extends Exception {
    MonthException(){
        super("Month between 1 and 12 only. Please try again. ");
    }
}

class YearException extends Exception {
    YearException(){
        super("Year between 1000 and 3000 only. Please try again. ");
    }
}

class DateConverter {

    public static boolean isLeapYear(int year) {
        boolean leap;

        // if the year is divided by 4
        if (year % 4 == 0) {

            // if the year is century
            if (year % 100 == 0) {

                // if year is divided by 400
                // then it is a leap year
                leap = year % 400 == 0;
            }

            // if the year is not century
            else
                leap = true;
        } else
            leap = false;
        return leap;
    }

    public static void showOutput(int month, int day, int year){
        String monthInString;
        if (month == 1) {
            monthInString = "January";
        } else if (month == 2) {
            monthInString = "February";
        } else if (month == 3) {
            monthInString = "March";
        } else if (month == 4) {
            monthInString = "April";
        } else if (month == 5) {
            monthInString = "May";
        } else if (month == 6) {
            monthInString = "June";
        } else if (month == 7) {
            monthInString = "July";
        } else if (month == 8) {
            monthInString = "August";
        } else if (month == 9) {
            monthInString = "September";
        } else if (month == 10) {
            monthInString = "October";
        } else if (month == 11) {
            monthInString = "November";
        } else {
            monthInString = "December";
        }

        System.out.printf("%s %s %s", day, monthInString, year);
    }

    void validYear(int year) throws YearException {
        if (year < 1000 || year > 3000) {
            throw new YearException();
        }
    }

    void validMonth(int month) throws MonthException {
        if (month < 1 || month > 12) {
            throw new MonthException();
        }
    }

    void validDay(int month, int day, int year) throws DayException{
        if (month <= 7) {
            if (month % 2 == 0) {
                if (month == 2) {
                    if (isLeapYear(year)) {
                        if (day < 1 || day > 29) {
                            throw new DayException();
                        }
                    } else {
                        if (day < 1 || day > 28) {
                            throw new DayException();
                        }
                    }
                } else {
                    if (day < 1 || day > 30) {
                        throw new DayException();
                    }
                }
            } else {
                if (day < 1 || day > 31) {
                    throw new DayException();
                }
            }
        } else {
            if (month % 2 == 0) {
                if (day < 1 || day > 31) {
                    throw new DayException();
                }
            } else {
                if (day < 1 || day > 30) {
                    throw new DayException();
                }
            }
        }
    }

    public static void main(String[] args) {
        DateConverter ob = new DateConverter();
        Scanner scanner = new Scanner(System.in);
        int month;
        int day;
        int year;

        System.out.println("Input Date in this format (MM/DD/YYYY)");

        while (true) {
            System.out.println("Input Year between 1000 and 3000");
            try {
                year = scanner.nextInt();
                if (isLeapYear(year)) {
                    System.out.printf("%s is a leap year\n", year);
                }
                ob.validYear(year);
                break;
            } catch (YearException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("Numbers only. ");
            }
        }

        while (true) {
            System.out.println("Input Month");
            try {
                month = scanner.nextInt();
                ob.validMonth(month);
                break;
            } catch (MonthException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException inputMismatchException) {
                scanner.next();
                System.out.println("Input numbers only. ");
            }
        }

        while (true) {
            System.out.println("Input Day");
            try {
                day = scanner.nextInt();
                ob.validDay(month, day, year);
                break;
            } catch (DayException e) {
                System.out.println(e.getMessage());
            }
        }

        showOutput(month, day, year);
    }
}
