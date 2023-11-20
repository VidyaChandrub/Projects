package ObjectOriented.Acessmodifires;

class prv{
    private String name; // accessible within the class and to make accessible outside the class use getter and setters method

    public String getName(){
       return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}

public class Test1 {
    public static void main(String[] args) {
        prv p = new prv();
        p.setName("Vidya");
        System.out.println(p.getName());
    }
}
