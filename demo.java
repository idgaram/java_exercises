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


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + price;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (price != other.price)
            return false;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        return true;
    }

//     public boolean equals(Laptop that){
// return this.model.equals(that.model) && this.price == that.price;
//     }



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
