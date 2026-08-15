import java.util.*;
public class Hello{

    public static void main(String args[])
    {

        int x ; 
        Scanner user = new Scanner(System.in);
        x = user.nextInt();

        if (x>10 && x<=20){
        System.out.println("Hello, World!");
        }
        else{
        System.out.println("Bye");
        }
    }
}