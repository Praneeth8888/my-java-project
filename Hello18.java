abstract class car { // abstract class can have abstract methods only when class is declared as abstract
    public abstract void drive();//abstract method
    
    public abstract void fly();
    
    public void playMusic(){
        System.out.println("Playing music");
    }

}

abstract class porsche extends car { // before we used porsche , but it cant do fly, so we need to make it abstract class 
    public void drive(){
        System.out.println("Driving Porsche");
    }
}

class Helicopter extends porsche { // since porsche became abstract class, we can used helicopter to implement the fly method
    // and create object of helicopter
    
    
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

// 08:07:22 – What is Interface → Must-know
// 08:15:18 – More on Interfaces → Must-know
// 08:18:40 – Need of Interface → Must-know