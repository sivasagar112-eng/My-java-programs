class Animal{
    void eat(){
        System.out.println("The animal eats food.");
    }
}
class Dog extends Animal{
    void barks(){
        System.out.println("The dog barks.");
    }
}
class puppy extends Dog{
    void weep(){
        System.out.println("The puppy weeps.");
    }
}

public class multilevel_inheritance {
    public static void main(String args[]){
        puppy Mypuppy = new puppy();
            Mypuppy.eat();
            Mypuppy.barks();
            Mypuppy.weep();
    }
}
