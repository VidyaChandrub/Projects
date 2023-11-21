package ObjectOriented.thisKeyword;

public class Main {

    int age;

    Main(int age){
        //age = age;   o/p = 0
        this.age = age;   //o/p = 8
    }

    public static void main(String[] args) {
        Main obj = new Main(8);
        System.out.println(obj.age);   // o/p = 0 because of ambiguity so we use this keyword
    }
    
}
