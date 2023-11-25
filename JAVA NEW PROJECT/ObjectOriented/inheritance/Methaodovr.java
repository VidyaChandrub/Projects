package ObjectOriented.inheritance;

class Animal{
    public void eat(){
        System.out.println("I had food");
    }
}

class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("i had dog food");
    }
}
public class Methaodovr {
    public static void main(String[] args) {
        
        Dog d1 = new Dog();
        d1.eat();
    }
}
