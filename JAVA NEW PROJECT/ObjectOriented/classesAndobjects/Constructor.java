package ObjectOriented.classesAndobjects;

public class Constructor {
    private String name;

    Constructor(){                                                      // No arg constructor
        System.out.println("Constructor called :) :) ");
        name = "Vidya";
    }

    public static void main(String args[]){
        Constructor c = new Constructor();
        System.out.println("Name is : " + c.name);
    }
}
