import java.util.*;

public class array_2nd_question {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row : ");
        int row = sc.nextInt();
        System.out.println("Enter the col: ");
        int col = sc.nextInt();
        System.out.println("Enter the numbers : ");
        int numbers[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter the number to found at which indices it exists : ");
        int x = sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (numbers[i][j] == x) {
                    System.out.println("The number found at (" + i + ", " + j + ") ");
                }
            }
        }
        sc.close();
    }
}
