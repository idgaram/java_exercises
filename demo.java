final class Calc{
    public void show(){
        System.out.println("in calc show");
    }
    public void add(int a, int b){
        System.out.println(a + b);
    }
}

class AdvancedCalc extends Calc{

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
