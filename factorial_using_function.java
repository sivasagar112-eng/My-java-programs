import java.util.Scanner;

public class factorial_using_function {
    public static int printFactorial(int n) {
        int factorial = 1;
        for(int i = n;i>=1;i--){
            factorial = factorial *i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a = sc.nextInt();
        System.out.println("The factorial is : " + printFactorial(a));
    }
}

