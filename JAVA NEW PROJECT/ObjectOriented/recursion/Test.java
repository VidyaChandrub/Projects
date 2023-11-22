package ObjectOriented.recursion;

public class Test {

    public int fact(int n){
        if(n != 0){
            return n * fact(n-1);  // recursive
        }else{
            return 1;
        }
        
    }
    public static void main(String[] args) {
        Test a = new Test();
        int number = 4;
        int result = a.fact(number);
        System.out.println(result);
    }
}
