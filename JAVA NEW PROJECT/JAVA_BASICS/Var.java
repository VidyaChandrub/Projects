class Var{
    int a = 100; //instance variable
    static int b = 100; //static variable
    public static void main(String args[]){

        int c = 10;
        Var v1 = new Var();
        Var v2 = new Var();

        System.out.println(v1.a);

        System.out.println(v1.b);
        System.out.println(v1.a);
    
        System.out.println(b);
        
        v1.a = 200;
        System.out.println(v1.a);
        System.out.println(v2.a);

        v1.b = 30;
        System.out.println(v1.b);
        System.out.println(v2.b);


    }
}