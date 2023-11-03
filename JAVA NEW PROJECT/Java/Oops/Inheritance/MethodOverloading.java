class Parent{
    public void m1(){
        System.out.println("P m1 method");
    }
}
class Child {
    public void m1(){
        System.out.println("C m1 method");
    }
}
public class MethodOverloading extends Child{
    public static void main(String args[]){
        Child c = new Child();
        Parent p = new Parent();
        
        p.m1();
        c.m1();
    }
}