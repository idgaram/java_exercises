class Mobile2 {

    String brand;
    int price;
    String name;

    public void show(){
        System.out.println("brand "+brand+"\nprice "+price+"\nname "+name+"\n-------------");
    }

    public static void show1(Mobile2 mob) {
        System.out.println("brand "+ mob.brand+ "\nprice "+mob.price+"\nname "+mob.name+"\n-------------");
    }
}

public class staticMethod{
    public static void main(String[] args) {
        Mobile2 mob1 = new Mobile2();
        mob1.brand = "Samsung";
        mob1.price = 900;
        mob1.name = "smart";

        Mobile2 mob2 = new Mobile2();
        mob2.brand = "Apple";
        mob2.price = 2000;
        mob2.name = "smart";

        Mobile2.show1(mob1);
        mob1.show();
        mob2.show();
    }
}