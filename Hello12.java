


class A{
 public A(){
     super();
        System.out.println("this is A");
    }

    public A(int n){
            super();
        System.out.println("this is A when n is called");
    }
}

class B extends A{
    public B(){
        super();
        System.out.println("this is B");
    }
   
    public B(int n){
         super(n);
        System.out.println("this is B when n is called");
    }

}




public class Hello12 {
    public static void main(String[] args) {
       B obj=new B(5);
    }
}