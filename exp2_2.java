import java.util.Scanner;

// Display first 20 prime numbers 

public class exp2_2 {
    public static void main(String[] args) {
        int ct = 0, n = 0, i = 1, j = 1;
        while (n < 50) {
            j = 1;
            ct = 0;
            while (j <= i) {
                if (i % j == 0)
                    ct++;
                j++;
            }
            if (ct == 2) {
                System.out.printf("%d ", i);
                n++;
            }
            i++;
        }
    }
}
