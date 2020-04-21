/*
Write a program using a switch statement to print
the month names given the exact number of days in the month.
If the user enters 30 then the program will display:
"September April June November".
If the user enters 9 then program will alert
the user that no months have exactly 9 days.

Pseudocode:
import Scanner
declare methods
declare vars for Scanner, input, month,
prompt user to enter the number of days
print according months based on switch cases
 */

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int days;
        String twentyEightDays, twentyNineDays, thirtyDays, thirtyOneDays;
        twentyEightDays = "February";
        twentyNineDays = "February";
        thirtyDays = "April, June, September, November";
        thirtyOneDays = "January, March, May, July, August, October, December";

        System.out.println("Enter the total number of days of a month.");
        days = input.nextInt();

        switch (days) {
            case 28:
                System.out.printf("%s", twentyEightDays);
                break;
            case 29:
                System.out.printf("%s", twentyNineDays);
                break;
            case 30:
                System.out.printf("%s", thirtyDays);
                break;
            case 31:
                System.out.printf("%s", thirtyOneDays);
                break;
            default:
                System.out.printf("There are no months that have exactly %d day(s).", days);
                break;
        }
    }
}
