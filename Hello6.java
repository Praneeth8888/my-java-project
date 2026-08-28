class Human{
private int age=11;
private String name="Bob";


public int getage(){
    
    return age;
}

public String getname(){
    return name;
}

}



public class Hello6 {
    public static void main(String[] args) {
        
    Human obj=new Human();
    // obj.age=51;
    // obj.name="Bob";


    System.out.println(obj.getage());
    System.out.println(obj.getname());
}
 
    
}
