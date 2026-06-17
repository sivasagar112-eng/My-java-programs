class Swapping{
    int x;
    int y;
    int temp;
    Swapping(int m, int n){
        x = m;
        y = n;
    }
    void swap(){
        System.out.println("M = "+x);
        System.out.println("N = "+y);
        temp = x;
        x = y;
        y = temp;
        System.out.println("M = "+x);
        System.out.println("N = "+y);
    }
}

public class swapping_function {
    public static void main(String args[]){
        Swapping sp = new Swapping(14, 23);
        sp.swap();
    }
}
