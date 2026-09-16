
public class Hello23  {
    public static void main(String a[]) {
        int i = 4;
        int j = 0;

        try {
            j = 18 / i; // Causes ArithmeticException because i is 0
        } catch(Exception e) {
            System.out.println("Something Went Wrong.");
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}