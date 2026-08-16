import java.util.*; // universal header
public class Hello{

    public static void main(String args[])
    {

        int x ; // variable declaration
        Scanner user = new Scanner(System.in); // scanner

        x = user.nextInt(); // input

        if (x>10 && x<=20){
        System.out.println("Hello, World!");
        }
        else{
        System.out.println("Bye");
        }
    }
}