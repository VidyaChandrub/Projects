package ObjectOriented.classesAndobjects;

public class Methods {

    public int Add(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static int Mul(int a, int b){
        int mul = a * b;
        return mul;
    }
    public static void main(String args[]){
        Methods m1 = new Methods();
        int result = m1.Add(5,13);
        System.out.println(result);

        int res = Mul(2, 3);
        System.out.println(res);
    }
}
