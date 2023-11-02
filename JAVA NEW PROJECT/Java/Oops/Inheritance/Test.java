class Parent{
    public void m1(){
        System.out.print("Parent class ");
    }
    }
    

class Child extends Parent{
    public void m2(){
        System.out.print("Child class ");
    }
    
}

public class Test extends Child{
    public static void main(String args[]){
        Parent p = new Parent();
        Child c = new Child();
        Parent p1 = new Child();
        // Child c1 = new Parent();  parent cannot inheriate the child properties

        p.m1();
        p1.m1();
        c.m1();
        c.m2();
    }
}