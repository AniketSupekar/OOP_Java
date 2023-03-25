// Find a factorial of the number 
import java.util.*;
class exp2_1 {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number to find the factorial :");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int fact = 1;
        for(int i=1;i<=n;i++) {
            fact = fact * i;
        }
        System.out.println("The factorial of "+n+" is "+fact);
    }
}