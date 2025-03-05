import java.util.Scanner;
/**
 * This project will ask for 3 different positive numbers, and will output them in order.
 * @author Alan Doughman
 * @version v1.0
 * @since 3/4/25
 */
public class Sorting
{
    public static void main (String[] args) {
    int n1, n2, n3;
    boolean validity;;
        
    Scanner input = new Scanner(System.in);
    
    System.out.print("Please enter three positive whole numbers that you want sorted: ");
    while(!(input.hasNextInt())){
        input.next();
        System.out.print("Invalid input. Please input a positive whole number: ");
    }
    n1 = input.nextInt();
    while (!(n1>0)){
            System.out.print(n1 + " is not a valid number. Please input a positive whole number: ");
            while (!(input.hasNextInt())) {
                input.next();
                System.out.print("Not a valid input. Please input a positive whole number: ");
            }
            n1 = input.nextInt();
        }
    
    System.out.print("2: ");
    while(!(input.hasNextInt())){
        input.next();
        System.out.print("Invalid input. Please input a positive whole number: ");
    }
    n2 = input.nextInt();
    while (!(n2>0)){
            System.out.print(n2 + " is not a valid number. Please input a positive whole number: ");
            while (!(input.hasNextInt())) {
                input.next();
                System.out.print("Not a valid input. Please input a positive whole number: ");
            }
            n2 = input.nextInt();
        }
        
    System.out.print("3: ");
    while(!(input.hasNextInt())){
        input.next();
        System.out.print("Invalid input. Please input a positive whole number: ");
    }
    n3 = input.nextInt();
    while (!(n3>0)){
            System.out.print(n3 + " is not a valid number. Please input a positive whole number: ");
            while (!(input.hasNextInt())) {
                input.next();
                System.out.print("Not a valid input. Please input a positive whole number: ");
            }
            n3 = input.nextInt();
        }
    
        
    if (n1<n2) {
        if (n3<n1){
            System.out.print("In order: " + n3 +", "+ n1 +", "+ n2+"\n");
        } else if (n2<n3) {
            System.out.print("In order: " + n1 +", "+ n2 +", "+ n3+"\n");
        } else {
            System.out.print("In order: " + n1 +", "+ n3 +", "+ n2+"\n");
        }
    } else {  //(n2<n1)
        if (n3<n2){
            System.out.print("In order: " + n3 +", "+ n2 +", "+ n1+"\n");
        } else if (n1<n3) {
            System.out.print("In order: " + n2 +", "+ n1 +", "+ n3+"\n");
        } else {
            System.out.print("In order: " + n2 +", "+ n3 +", "+ n1+"\n");
        }
    }
    
    }
}
