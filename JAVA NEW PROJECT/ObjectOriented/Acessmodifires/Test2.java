package ObjectOriented.Acessmodifires;

class Data{
    private String password;

    public String getPass(){
        return this.password;
    }

    public void setPass(String password){
        this.password = password;
    }
}
public class Test2 {
    public static void main(String[] args) {
        Data d = new Data();
        d.setPass("Vidya@651");
        System.out.println(d.getPass());
    }
}
