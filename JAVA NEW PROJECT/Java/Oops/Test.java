public class Test{
    int id = 101;
    String name = "vidya";
    public void wish(){
        System.out.println("Hello, GM");
    }
    public static void main(String args[]){
        Test t1 = new Test();
        System.out.println(t1);
        System.out.println(t1.id);
        System.out.println(t1.name);
        t1.wish();
    }
}