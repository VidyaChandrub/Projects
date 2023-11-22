package ObjectOriented.recursion;

public class Instanceof {
        public static void main(String[] args) {
        String name = "Vidya";
        boolean result1 = name instanceof String;
        System.out.println(result1);

        Instanceof obj = new Instanceof();
        
        boolean result2 = obj instanceof Instanceof;
        System.out.println(result2);

    }
}
