class Laptop{
    String model;
    int price;


    public String toString(){
        return "Laptop [model=" + model + ", price=" + price + "]";
    }
}


public class Hello17 {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.model = "Dell";
        obj.price= 50000;

        System.out.println(obj);
    }
}
