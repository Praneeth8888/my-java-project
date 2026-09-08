

//Final keyword is used to declare constants in varibale , class and methods.
// Once a final variable is assigned a value, it cannot be changed. 
//In this example, we are trying to change the value of a final variable 'a' which will result in a compilation error.



public class Hello16 {
    public static void main(String[] args) {
       final int a=10;
       a=20;
       System.out.println(a);
    }
}
