 import java.util.*;
 public class function{
    public static int printSum(int a,int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fist number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second number : ");
        int b = sc.nextInt();

        System.out.println("The sum is : "+printSum(a, b));
        sc.close();
    }
}