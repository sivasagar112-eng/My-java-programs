class Rectangle {
    int length;
    int breadth;

    Rectangle() {
        length = 0;
        breadth = 0;
    }

    void getdata(int x, int y) {
        length = x;
        breadth = y;
    }

    // Rectangle(int x, int y) {
    //     length = x;
    //     breadth = y;
    // }

    int rectarea() {
        return (length * breadth);
    }
}

public class constructor {

    public static void main(String args[]) {
        Rectangle rect2 = new Rectangle();
        rect2.getdata(6,8);
        int area1 = rect2.rectarea();
        System.out.println("Area calcualted through getdata method is : " + area1);
    }
}