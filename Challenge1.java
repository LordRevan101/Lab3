import java.util.Scanner;
/**
 * This project will check if the user input is within the range 1-3.
 * @author Alan Doughman
 * @version v1.0
 * @since 3/2/25
 */
public class Challenge1 {
    public static void main (String[] args) {
        int number;

        Scanner userinput = new Scanner(System.in);

        System.out.print("Please input a whole number between 1 and 3: "); 

        while (!(userinput.hasNextInt())) {
            userinput.next();
            System.out.print("Not a valid input. Please input a whole number between 1 and 3: ");
        }
        number = userinput.nextInt();

        while (!(number>=1 && number<=3)){
            System.out.print(number + " is not a valid number. Please input a whole number between 1 and 3: ");
            while (!(userinput.hasNextInt())) {
                userinput.next();
                System.out.print("Not a valid input. Please input a whole number between 1 and 3: ");
            }
            number = userinput.nextInt();
        }

        switch(number){
            case 1:
                System.out.print("Your number, " + number + ", converted to roman numeral is I.\n");
                break;
            case 2:
                System.out.print("Your number, " + number + ", converted to roman numeral is II.\n");
                break;
            case 3:
                System.out.print("Your number, " + number + ", converted to roman numeral is III.\n");
                break;
            default:
                System.out.print(number + " is not a valid number.\n");
        }
    }
}