package ObjectOriented.classesAndobjects;

class Lamp {
    boolean isOn;

    void turnOn(){
        isOn = true;
        System.out.println("Light is "+ isOn);
    }

    void turnOff(){
        isOn = false;
        System.out.println("Light is "+ isOn);
    }
}

public class Main{
    public static void main(String args[]){
        Lamp L1 = new Lamp();
        Lamp L2 = new Lamp();

        L1.turnOn();
        L2.turnOff();
    }
}