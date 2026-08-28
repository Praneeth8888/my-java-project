class Human{
private int age=11;
private String name="Bob";


public int getage(){
    
    return age;
}
public void setage(int a){
age=a;
}

public void setname(String n){
    name=n;
}

public String getname(){
    return name;
}

}



public class Hello7 {
    public static void main(String[] args) {
        
    Human obj=new Human();
    obj.setage(52);
    obj.setname("Babu");


    System.out.println(obj.getage()+" : "+obj.getname());
    
}
 
    
}
