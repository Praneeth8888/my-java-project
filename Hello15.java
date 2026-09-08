
class A{
    public void show(){
        System.out.println("in show A");
    }
}


class B extends A{
    public void show(){
        System.out.println("in show B");
    }
}


public class Hello15 {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
    }
}
