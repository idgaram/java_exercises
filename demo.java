class Calc{
   public final void show(){
        System.out.println("by me");
    }
    public void add(int a, int b){
        System.out.println(a + b);
    }
}

class AdvancedCalc extends Calc{
    public void show(){
        System.out.println("hey this isn't possible");
    }
}

public class demo {
    public static void main(String[] args) {
        // final int num = 8;
        // num = 9;
        Calc obj = new Calc();
        obj.show();
        obj.add(5, 5);

       }
}
