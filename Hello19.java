interface A{
    int a=10;
    String s="Babu";
    void show();
    void config();
}

class B implements A{
    public void show(){
        System.out.println("Show method");
    }
    
    public void config(){
        System.out.println("Config method");
    }
}

public class Hello19
{
    public static void main(String a[])
    {
        A obj;
        obj = new B();
        obj.show();
        obj.config();
        System.out.println(A.a);
        System.out.println(A.s);
    }
}