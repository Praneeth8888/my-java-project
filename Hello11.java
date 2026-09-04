



public class Hello11 {
    public static void main(String[] args) {
        Advcalc calc = new Advcalc();
       int r1=calc.add(67,69);
         int r2=calc.sub(67,69);
         int r3=calc.div(67,69);
         int r4=calc.mult(67,69);
          System.out.println("Addition of 67 and 69 is: "+r1);
          System.out.println("Subtraction of 67 and 69 is: "+r2);
          System.out.println("Division of 67 and 69 is: "+r3);
          System.out.println("Multiplication of 67 and 69 is: "+r4);
    }
}
