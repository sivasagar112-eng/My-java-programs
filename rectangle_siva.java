class Rectangle{
    int length;
    int breadth;
    void getdata(int x, int y){
        length = x;
        breadth = y;
    }
    int rectarea(){
        return length*breadth;
    }
}

public class rectangle_siva {

    public static void main(String args[]){
        Rectangle rect1 = new Rectangle();
        rect1.length = 5;
        rect1.breadth = 6;
        int area1 = rect1.length*rect1.breadth;
        Rectangle rect2 = new Rectangle();
        rect2.getdata(5,6);
        int area2 = rect2.rectarea(); 
        System.out.println("Area1 : "+area1);
        System.out.println("Area2 : "+area2);
    }
}