package ObjectOriented.inheritance;

class Animal{
    void eat(){
        System.out.println("I will eat food");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("I will bark");
    }
}

public class Inh1 {
    public static void main(String args[]){
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}
