abstract class car {
    public abstract void drive();
        
    
    public void playMusic(){
        System.out.println("Playing music");
    }

}

class porsche extends car {
    public void drive(){
        System.out.println("Driving Porsche");
    }
}



public class Hello18{
    public static void main(String[] args){

        car obj = new porsche(); // u cant create object of abstract class
        obj.drive();
        obj.playMusic();
        // System.out.println("Hello, World!");
    }
}