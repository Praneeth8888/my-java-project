
class Calc { 
 public int add(int a, int b){
     return a + b;
 }
   

}

class Advcalc extends Calc {
public int add(int a, int b){
        return a + b + 1;
    }
   
   

}




public class Hello13 {
    public static void main(String[] args) {
      Advcalc obj=new Advcalc();
     int ans= obj.add(5, 6);
     System.out.println(ans);

    }
}