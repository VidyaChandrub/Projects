public class Variables{
    int a = 10; //instance var

    static int bh =20;  //Static variables

    public static void main(String args[]){
        Variables v1 = new Variables();
        Variables v2 = new Variables();
        int c = 30;  //local variables
        
        System.out.println(c); //accessing local variable

        System.out.println(bh);   //accessing static variable
        System.out.println(v1.bh);
        System.out.println(Variables.bh);
        System.out.println(v2.bh);

        
        System.out.println(v1.a);
        System.out.println(v2.a);

    }
}