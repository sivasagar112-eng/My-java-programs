class Animal{
    String name;
    void eat(){
        System.out.println(name +" "+ "eats food.");
    }
}
class Dog extends Animal{
    void barks(){
        System.out.println(name +" "+ "says bow bow");
    }
}
class cat extends Dog{
    void meow(){
        System.out.println(name +" "+ "says meow meow");
    }
}

public class hierarchical_inheritance {
    public static void main(String args[]){
        Dog myDog = new Dog();
        myDog.name = "Bull";
        myDog.eat();
        myDog.barks();

        cat myCat= new cat();
        myCat.name = "Pussy";
        myCat.eat();
        myCat.meow();
    }
}
