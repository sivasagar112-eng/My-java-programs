import java.util.Scanner;

public class myName {
    public static void name(String name){
        System.out.println("My name is Siva.");
    }
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        String Fullname = sc.nextLine();
        name(Fullname);
        sc.close();
    }
}