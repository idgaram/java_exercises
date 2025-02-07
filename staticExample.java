class Mobile {

    static String brand; //affects all objects within the class
    int price;
    String name;

    public void show(){
        System.out.println("brand "+brand+"\nprice "+price+"\nname "+name+"\n-------------");
    }
}

public class staticExample {
    public static void main(String[] args) {
        

        Mobile mob1 = new Mobile();
        Mobile.brand = "Samsung";
        mob1.price = 900;
        mob1.name = "smart";

        Mobile mob2 = new Mobile();
        Mobile.brand = "Apple";
        mob2.price = 2000;
        mob2.name = "smart";

        Mobile.brand = "google";

        mob1.show();
        mob2.show();
    }
    
}
