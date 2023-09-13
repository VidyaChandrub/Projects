class Var{
    int b = 80; //instance variables

    static int c=30;

    public static void main(String args[]){

        Var v1 = new Var();
        Var v2 = new Var();

        int a = 10; //local variables
        System.out.println(a);

        

        System.out.println(v1.b);
        System.out.println(v1.c);

        System.out.println(a+v1.b+v1.c);
        System.out.println(a+v2.b+v2.c);

        System.out.println(c);
        System.out.println(Var.c);
        System.out.println(v2.b);
        System.out.println(v2.c);

        v2.b = 300;  // value of instance variables vary 

        System.out.println(a+v1.b+v1.c);
        System.out.println(a+v2.b+v2.c); 
        
        v1.c = 100;   // value of static variables will not change 

        System.out.println(a+v1.b+v1.c);
        System.out.println(a+v2.b+v2.c);
    }
}