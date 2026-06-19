class Factorial{
    int n;
    Factorial(int x){
        n = x;
    }
    void fact(){
        if (n < 0) {
            System.out.println("Invalid number!!");
            return;
        }
        int f = 1;
        for(int i = n;i >= 1;i--){
            f = f*i;
        }
        System.out.println(f);
    }
}

public class factorial_const {
    public static void main(String args[]){
        Factorial fact1 = new Factorial(5);
        fact1.fact();
    }
}
