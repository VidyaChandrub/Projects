//Varargs is variable arguments in java it simplifies the creation of methods that need to take a variable number of arguments
//rules it must be the last argument
//In a method only one varargs should be there
/*import java.lang.*;

public class Varargs{
    public static void add(int... x){
        int sum = 0;
        for(int value : sum){
            System.out.println(value);
        }
    }
    public static void main(String args[]){
        add();
        add(10,20);
    }
}*/

class Varargs{

    public static void add(int... x){
       
       for(int value : x){
            System.out.println(value);
       }
        
    }
    public static void main(String args[]){

        add();
        add(10,20);
        add(10,20,30);

    }
}

/* class Varargs{  
   
 static void display(int... values){  
  System.out.println("display method invoked ");  
  for(int s:values){  
   System.out.println(s);  
  }  
 }  
  
 public static void main(String args[]){  
  
 display();//zero argument   
 display(10);//one argument   
 display(10,20,30,40);//four arguments  
 }   
}*/
      