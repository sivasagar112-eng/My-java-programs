import java.util.*;

public class practice {
    public static int Myfactorial(int n){
        if (n == 0) {
            return 1;
        }
        else if (n < 0) {
            System.out.println("The number is Invalid");
            return -1;
        }
        int factorial = 1;
        for(int i = n; i>=1;i--){
            factorial = factorial * i;
        }
        return factorial;
    }
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("Factorial : " + " " + Myfactorial(n));
        sc.close();
    }
}