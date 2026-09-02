class Human {
private int age=11;
private String name="Bob";

public Human(){ //constructor has same name as class name and no return type
    age=52;
    name="Babuuu";              //Default constructor
    System.out.println("Constructor is called");
}
public Human(int a, String b){ //Parameterized constructor
    age=a;
    name=b;

}

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

public class Hello9 {
    public static void main(String[] args) {
        
    Human obj=new Human();
    Human obj1=new Human(22,"Praneeth");
    // obj.setage(52);
    // obj.setname("Babu");


    System.out.println(obj.getage()+" : "+obj.getname());
    System.out.println(obj1.getage()+" : "+obj1.getname());
}
    
}
 
