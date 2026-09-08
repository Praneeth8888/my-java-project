abstract class car { // abstract class can have abstract methods only when class is declared as abstract
    public abstract void drive();//abstract method
    
    public abstract void fly();
    
    public void playMusic(){
        System.out.println("Playing music");
    }

}

abstract class porsche extends car {
    public void drive(){
        System.out.println("Driving Porsche");
    }
}

class Helicopter extends porsche {
    
    
    public void fly(){
        System.out.println("Flying Helicopter");
    }
}


public class Hello18{
    public static void main(String[] args){

        car obj = new Helicopter(); // u cant create object of abstract class
        obj.drive();
        obj.fly();
        obj.playMusic();
        // System.out.println("Hello, World!");
    }
}