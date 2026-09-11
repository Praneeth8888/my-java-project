class A{
    public void showqweRtyuiopasdFghjklzxcVbnmQ(){
        System.out.println("A");
    }

}
class B extends A{
    @Override
public void showqweRtyuiopasdFghjklzxcVbnmQ(){
        System.out.println("B");
    }
}

public class Hello20 {
    public static void main(String[] args) {
        B obj = new B();
        obj.showqweRtyuiopasdFghjklzxcVbnmQ();
    }
}
