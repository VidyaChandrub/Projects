class A{
    public static void myMethod(){
        System.out.println("My method 1");
    }

    public static void myMethod2(String name){
        System.out.println("Hello "+name);
    }
}

public class TestEx {
    
    public static void main(String args[]){
    System.out.println("GE");
    A a = new A();
    a.myMethod();
    a.myMethod2("Vidya");
    }
}
 