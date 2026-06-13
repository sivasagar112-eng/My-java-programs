public class decrement {
    public static void main(String args[]){
        int a = 10;
        int b = 0;
        // b = --a; //First chnage then assign
        b = a--; //First assign then change
        System.out.println(a);
        System.out.println(b);
    }
    
}
