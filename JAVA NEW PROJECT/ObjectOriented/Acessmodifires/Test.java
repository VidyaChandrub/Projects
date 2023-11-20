package ObjectOriented.Acessmodifires;

class Default1{    // accessible withini the package and if we do not specify any access maodifier it will be default 
    String lang = "Java";
}

public class Test {
    public static void main(String[] args) {
        Default1 d = new Default1();
        System.out.println(d.lang);
    }
}
