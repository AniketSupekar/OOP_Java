import java.util.Objects;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class exp6 {

    public void area1(double l1 , double w1) {
        double a1 = l1 * w1;
        System.out.println("Area of first rectangle is " + a1);
    }

    public void area2(double l2 , double w2) {
        double a2 = l2 * w2;
        System.out.println("Area of second rectangle is " + a2);
    }

    public void com(double a1 , double a2 , String c1 , String c2) {
        if(a1==a2 && Objects.equals(c1, c2)) {
            System.out.println("Two rectangles are same !");
        } else {
            System.out.println("Two rectangles are different !");
        }
    }

    public static void main(String[] args) {
        double area1 , area2;
        exp6 e = new exp6();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length for first rectangle :");
        double l1 = sc.nextDouble();
        System.out.print("Enter the width for first rectangle :");
        double w1 = sc.nextDouble();
        System.out.print("Enter the color for first rectangle :");
        String c1 = sc.next();

        area1 = l1 * w1;

        System.out.print("Enter the length for second rectangle :");
        double l2 = sc.nextDouble();
        System.out.print("Enter the width for second rectangle :");
        double w2 = sc.nextDouble();
        System.out.print("Enter the color for second rectangle :");
        String c2 = sc.next();

        area2 = l2 * w2;

        e.com(area1, area2, c1, c2);
    }
}
