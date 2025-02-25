import java.util.Scanner;
/**
 * 1) User enters date in format of mm/dd/yyy
 * 2) Verify if the input is the correct format or valid. If it is correct, 
 *    display the date, but if not, say so and describe why.
 * @author Alan Doughman
 * @version v1.0
 * @since 2/25/25
 */

public class ValidDate {
    public static void main (String[] args) {
        int month, day, year;
        String temp, output = "";
        boolean isValid = false;

        Scanner keyboard = new Scanner(System.in);
        keyboard.useDelimiter("/");

        System.out.print("Enter date in mm/dd/yyyy format: ");
        month = keyboard.nextInt();
        day = keyboard.nextInt();
        temp = keyboard.nextLine().substring(1);
        year = Integer.parseInt(temp);

        if (day < 1)
            output = "Can never have less than 1 day in a month";

        else if (day > 31)
            output = "Can never have more than 31 days in a month";

        else{  
            switch(month){
                case 1: case 3: case 7: case 8: case 10: case 12:
                    isValid = true;
                    break;

                case 4: case 6: case 9: case 11:
                    if(day <= 30)
                        isValid = true;
                    else
                        output = "Can not have 31 days for this month";
                    break;

                case 2: 
                    boolean isLeapYear = false;
                    if(year%400==0 || (year%4==0&&!(year%100==0)))
                        isLeapYear = true;
                    if (isLeapYear){
                        if(day <= 29)
                            isValid = true;
                        else
                            output = "Can not have 30 or more days in a leap year";
                    }
                    else{  ////non-leap year
                        if(day <= 28) //Update X
                            isValid = true;
                        else
                            output = "Can not have 29 or more days in a non-leap year";
                    }
                    break;

                default:
                    output = "Months must be between 1 and 12.";

            }
        }

        if (isValid)
        System.out.println(month + "/" + day + "/" + year + " is a valid date");
        
        else
            System.out.println(month + "/" + day + "/" + year + " is not a valid date. " + output);
    }////end main
}////end class
