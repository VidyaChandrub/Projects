package ObjectOriented.Acessmodifires;

class Animal{
    protected String name = "vidya";

    protected void display(String name){
        this.name = name;
        System.out.println(name);
    }
}
public class Test3 extends Animal{

    public static void main(String[] args) {
       Test3 t = new Test3();
    t.display("Vidya"); 
    }
    
}
