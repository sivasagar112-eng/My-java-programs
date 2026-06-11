import java.util.Scanner;

public class find_an_element_in_an_2darr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int r = sc.nextInt();
        System.out.print("Enter the numbers of cols : ");
        int c = sc.nextInt();

        int numbers[][] = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("At index  [" + i + "][" + j + "]:");
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(numbers[i][j] + " ");
            }
        }
        System.out.println("Enter the element to found : ");
        int x = sc.nextInt();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (numbers[i][j] == x) {
                    System.out.println("The element found at : (" + i + "," + j + ")");
                }
            }

        }
    }
}
