class Mobile3 {

    String brand;
    int price ;
    static String name = "iphone";



    // public void show(){
    //     // System.out.println("brand "+brand+"\nprice "+price+"\nname "+name+"\n-------------");
    //     System.out.println("in constructor block");
    // }

    // public static void show1(Mobile3 mob) {
    //     System.out.println("brand "+ mob.brand+ "\nprice "+mob.price+"\nname "+name+"\n-------------");
    // }
    // public static void showStatic() {
    //     System.out.println("brand \nprice \nname \n-------------");
    // }

    public Mobile3(){
        brand  = "apple";
        price = 9000;
        System.out.println("in constructor block");
    }

    static{
        name = "phone";
        System.out.println("in static block");
    }
}

public class staticBlock{
    public static void main(String[] args) throws ClassNotFoundException{

        // Mobile3 mob1 = new Mobile3();
        Class.forName("Mobile3");

        // mob1.brand = "Samsung";
        // mob1.price = 900;
        // mob1.name = "smart";

        // Mobile3 mob2 = new Mobile3();
        // mob2.brand = "Apple";
        // mob2.price = 2000;
        // mob2.name = "smart";

        // Mobile3 mobStatic = new Mobile3();

        // Mobile3.show1(mob1);
        // mob1.show();
        // mob2.show();
        // Mobile3.showStatic();
        // mobStatic.showStatic();
        // mobStatic.show();
    }
}