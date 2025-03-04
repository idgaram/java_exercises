import java.lang.reflect.Field;

class Laptop{
    int price;
    String model;

    public void displayAllFields(){
        Field[] fields = this.getClass().getDeclaredFields();
        for (Field field : fields){
            try {
                System.out.println(field.getName() + " : " + field.get(this));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }


    public String toString(){
        return model + " " + price ;
    }

    public boolean equals(Laptop that){
return this.model.equals(that.model) && this.price == that.price;
    }
}
public class demo {
    public static void main(String[] args) {
        Laptop obj1 = new Laptop();
        obj1.model = "lenovo yoga";
        obj1.price = 1000;

        Laptop obj2 = new Laptop();
        obj2.model = "lenovo yoga";
        obj2.price = 1000;

        boolean result = obj1.equals(obj2);

        System.out.println(result);
   

        // obj.displayAllFields();
       }
}
