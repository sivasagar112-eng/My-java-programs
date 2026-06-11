import java.util.*;

public class question {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 For Namaskar. ");
        System.out.println("2 For Hello. ");
        System.out.println("3 For Bounjour ");
        System.out.println("Enter your Choice : ");
        int btn = sc.nextInt();
        switch (btn) {
            case 1:
                System.out.println("Namaskar.");
                break;
            case 2:
                System.out.println("Hello.");
                break;
            case 3:
                System.out.println("Bounjour");
                break;
            default:
                System.out.println("Invaid btn.");
                ;
                break;
        }
        sc.close();
    }
}
