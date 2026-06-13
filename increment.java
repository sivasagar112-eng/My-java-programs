public class increment {

    public static void main(String args[]){
        int a = 10;
        int b = 0;
        // b = a++; // First assign then change
        b = ++a; // First Change then assign
        System.out.println(a);
        System.out.println(b);
    }
}