import java.util.*;

// Write java program to sort list of integers and names , motive is to learn arrays and strings in java.

public class exp5 {

    public void sortInt(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public void printInt(int arr[]) {
        System.out.println("Sorted integers are :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void sortNames(String names[]) {
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].compareTo(names[j]) > 0) {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
    }

    public void printNames(String names[]) {
        System.out.println("Sorted strings are :");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
    }

    public static void main(String[] args) {
        exp5 e = new exp5();
        Scanner sc = new Scanner(System.in);
        int c;

        do {
            System.out.println("Press 1, If you want to perform sorting of integers");
            System.out.println("Press 2, If you want to perform sorting of strings");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("How many numbers do you want to sort :");
                    int num = sc.nextInt();
                    int arr[] = new int[num];

                    System.out.println("Now, Enter " + num + " numbers");
                    for (int i = 0; i < num; i++) {
                        arr[i] = sc.nextInt();
                    }
                    e.sortInt(arr);
                    e.printInt(arr);
                    break;

                case 2:
                    System.out.println("How many names do you want to sort :");
                    int no = sc.nextInt();
                    System.out.println("Now enter " + no + " names");
                    String names[] = new String[no];
                    for (int i = 0; i < no; i++) {
                        names[i] = sc.nextLine();
                    }
                    e.sortNames(names);
                    e.printNames(names);
                    break;

                default:
                    System.out.println("Please select valid choice !");
            }
            System.out.println();
            System.out.println("Do you want to continue ?");
            System.out.println("Press 1 to continue");
            System.out.println("Press 0 to exit");
            c = sc.nextInt();
        } while (c == 1);
    }
}
