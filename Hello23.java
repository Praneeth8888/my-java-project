
public class Hello23  {
    public static void main(String a[]) {
        int i = 2;
        int j = 0;
        int nums[]= new int[4];

        try {
            j = 18 / i; // Causes ArithmeticException because i is 0
            System.out.println(nums[1]); // This line will not be executed due to the Arithmetic Exception above
            System.out.println(nums[4]); // This line will also not be executed
        }
        
        catch(ArithmeticException e) {
            System.out.println("Cannot divide by zero."+ e);
        }

        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds."+ e);
        }

        catch(Exception e) {
            System.out.println("Some other exception occurred."+ e);
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}