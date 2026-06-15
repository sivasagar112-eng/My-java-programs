class First{
    String name;
    void firname(){
        System.out.println(name);
    }
}
class Middle{
    String mid;
    void midname(){
        System.out.println(mid);
    }
}
class Last{
    String las;
    void lastname(){
        System.out.println(las);
    }
}
public class own_name {
    public static void main(String args[]){
        First f = new First();
        Middle m = new Middle();
        Last l = new Last();

        f.name = "T.Siva";
        m.mid = "Sagar";
        l.las = "Achary";
        System.out.println(f.name + " " + m.mid + " " + l.las);
    }
}
