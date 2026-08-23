//classes , objects

class Calc{ // create class
    public int add(int n1,int n2)
    {
        
        return n1+n2;
    }
}

public class Hello2{

    public static void main(String Args[]){
    int num1=3;
    int num2= 789;
 
   Calc c = new Calc();// calling the class
  int result= c.add(num1,num2);
    System.out.println(result);

    }
}
