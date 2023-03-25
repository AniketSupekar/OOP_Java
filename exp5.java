import java.util.*;

public class exp5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers of rows of first matrix :");
        int r1 = sc.nextInt();
        System.out.println("Enter the number of columns of first matrix :");
        int c1 = sc.nextInt();

        int arr1[][] = new int[r1][c1];

        System.out.println("Enter the elements of first martix :");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        int arr2[][] = new int[r1][c1];

        System.out.println("Now, Enter the elements of second martix :");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        int arr3[][] = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
