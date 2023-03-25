import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

// Make calculator with simple arithmatic operations such as add , subtract , multiply , divide , factorial using switch case.

public class exp3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1 :");
        int no1 = sc.nextInt();
        System.out.print("Enter the number 2 :");
        int no2 = sc.nextInt();
        int fact1 = 1;
        int fact2 = 1;
        int c;

        do {
            System.out.println("=== Now choose which operation do you want to perform === ");
            System.out.println("Press 1 for addition");
            System.out.println("Press 2 for subtraction");
            System.out.println("Press 3 for multiplication");
            System.out.println("Press 4 for division");
            System.out.println("Press 5 to find factorial of "+no1);
            System.out.println("Press 6 to find factorial of "+no2);

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    int add = no1 + no2;
                    System.out.println("The addition of " + no1 + " and " + no2 + " is " + add);
                    System.out.println();
                    break;

                case 2:
                    int sub = no1 - no2;
                    System.out.println("The subtraction of " + no1 + " and " + no2 + " is " + sub);
                    System.out.println();
                    break;

                case 3:
                    int mul = no1 * no2;
                    System.out.println("The multiplication of " + no1 + " and " + no2 + " is " + mul);
                    System.out.println();
                    break;

                case 4:
                    int div1 = no1 / no2;
                    int div2 = no1 % no2;
                    System.out.println("The quotient dividing " + no1 + " by " + no2 + " is " + div1);
                    System.out.println("The reminder dividing " + no1 + " by " + no2 + " is " + div2);
                    System.out.println();
                    break;

                case 5:
                    for (int i = 1; i <= no1; i++) {
                        fact1 = fact1 * i;
                    }
                    System.out.println("The factorial of " + no1 + " is " + fact1);
                    System.out.println();
                    break;

                case 6:
                    for (int i = 1; i <= no2; i++) {
                        fact2 = fact2 * i;
                    }
                    System.out.println("The factorial of " + no2 + " is " + fact2);
                    System.out.println();
                    break;

                default:
                    System.out.println("Please select the valid choice ");
                    System.out.println();
                    break;

            }
            System.out.println("Do you want to continue ?");
            System.out.println("Press 1 for continue");
            System.out.println("Press 0 for exit");

            c = sc.nextInt();
        } while (c == 1);
    }
}
