


class A extends Object{ // A is a subclass of Object and Object is not visible to us because it is a part of java.lang package and it is imported by default in every java program
 public A(){
     super();
        System.out.println("this is A");
    }

    public A(int n){
            super();
        System.out.println("this is A when variable is called");
    }
}

class B extends A{ // B is a subclass of A
    public B(){
        super();//this is used to call the constructor of the parent class
        System.out.println("this is B");
    }
   
    public B(int n){ 
       
         super(n);//this is used to call the constructor of the parent class
        System.out.println("this is B when n is called");
    }

}




public class Hello12 {
    public static void main(String[] args) {
       B obj=new B(5);
    }
}