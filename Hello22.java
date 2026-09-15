@FunctionalInterface
interface A 
{
    void show(int i);
}

public class Hello22
{
    public static void main(String a[]) 
    {
        A obj = i -> System.out.println("in show " + i);
        
        obj.show(5);
    }
}