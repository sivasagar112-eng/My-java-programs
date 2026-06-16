import java.util.*;

public class array_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println("The sum of array is : " + sum);
        sc.close();
    }
}
