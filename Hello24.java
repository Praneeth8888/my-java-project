public class Hello24 {
    public static void main(String a[]) {
        int i = 20;
        int j = 0;
        

        try {
            j = 18 / i; // Causes ArithmeticException because i is 0
            if(j==0){
                throw new ArithmeticException("j is zero"); // Manually throwing an ArithmeticException if j is zero
            }
           
        }
        
        catch(ArithmeticException e) {// This catch block will handle the ArithmeticException
            j=18/1;
            System.out.println("Default");
        }


        catch(Exception e) {
            System.out.println("Some other exception occurred."+ e); // This catch block will handle any other exceptions that are not caught by the previous catch blocks
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}