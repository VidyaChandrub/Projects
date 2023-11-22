package ObjectOriented.recursion;
interface Cat{

}
class Animal{

}

class Dog extends Animal implements Cat{

}
public class Test2 {
    public static void main(String[] args) {
        Dog d = new Dog();

        System.out.println(d instanceof Dog);
        System.out.println(d instanceof Animal);
        System.out.println(d instanceof Cat);
    }
}
