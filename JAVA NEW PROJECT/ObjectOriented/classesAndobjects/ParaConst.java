package ObjectOriented.classesAndobjects;

public class ParaConst {

    String langauge;

    public ParaConst(String lang){                          // Parameterised constructor
        langauge = lang;
        System.out.println("The Langauge is : "+langauge);
    }
    public static void main(String args[]){
        ParaConst pc = new ParaConst("Java");
        ParaConst pc2 = new ParaConst("C");
    }
}
