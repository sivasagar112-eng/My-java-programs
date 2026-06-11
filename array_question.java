import java.util.*;

public class array_question {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        System.out.println("Enter the numbers : ");
        int numbers[] = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("Enter the number to found : ");
        int x = sc.nextInt();
        for (int i = 0; i < size; i++) {
            if (numbers[i] == x) {
                System.out.println("The number found at index : " + i);
            }
        }
    }
}
