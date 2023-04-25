// Write a java program which use try and catch for exception handling.
import java.util.*;;

public class exp12 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        try {
            double a;
            System.out.print("a=");
            a = sc.nextInt();
            System.out.println(a);
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }
}
