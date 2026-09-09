interface A{
    int a=10;
    String s="Babu";
    void show();
    void config();
}

interface X{
    void display();
}

class B implements A,X{
    public void show(){
        System.out.println("Show method");
    }
    
    public void config(){
        System.out.println("Config method");
    }

    public void display(){
        System.out.println("Display method");
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
    

        X obj1;
        obj1 = new B();
            obj1.display();
        System.out.println(A.a);
        System.out.println(A.s);
    }
}