class Human {
private int age=11;
private String name="Bob";


public int getage(){
    
    return age;
}
public void setage(int age){
    
this.age=age;
}

public void setname(String name){
    this.name=name;
}

public String getname(){
    return name;
}

}

public class Hello8 {
    public static void main(String[] args) {
        
    Human obj=new Human();
    obj.setage(52);
    obj.setname("Babu");


    System.out.println(obj.getage()+" : "+obj.getname());
    
}
    
}
 
