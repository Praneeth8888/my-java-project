@Deprecated // This annotation indicates that the marked element is deprecated and should no longer be used
class A{
    public void showqweRtyuiopasdFghjklzxcVbnmQ(){
        System.out.println("A");
    }

}
class B extends A{
    @Override // Override "annotation" is used to indicate that the method is overriding a method from the superclass
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
