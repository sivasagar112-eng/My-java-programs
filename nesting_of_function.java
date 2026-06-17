class Nesting {
    int m;
    int n;

    Nesting(int x, int y) {
        m = x;
        n = y;
    }

    int largest() {
        if (m > n) {
            return m;
        } else {
            return n;
        }
    }

    void display() {
        // int large = largest();
        System.out.println("The largest number is : " + largest());
    }
}

public class nesting_of_function {
    public static void main(String[] args) {
        Nesting nest = new Nesting(15, 20);
        nest.display();

    }

}
