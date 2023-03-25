import java.util.Scanner;

// Find the sum and average of n numbers
public class exp2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter :");
        int num = sc.nextInt();
        System.out.println("Now enter the "+ num +" numbers");
        int arr[] = new int[num];
        for(int i=0;i<num;i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int j=0;j<arr.length;j++) {
            sum = sum + arr[j];
        }
        System.out.println("Sum of numbers : " +  sum);
        int avg = sum/num;
        System.out.println("Average of number is : " + avg);
   }
}
