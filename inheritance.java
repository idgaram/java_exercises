class Calc {
    public int add(int int1, int int2){
        return int1 + int2;
    }

    public int sub(int int1, int int2){
        return int1 - int2;
    }
}

class AdvancedInheritance extends Calc{


    public int mult(int int1, int int2){
        return int1 * int2;
    }

    public int div(int int1, int int2){
        return int1/int2;
    }


}
class VeryAdvancedCalculator extends AdvancedInheritance{


    public int power(int int1, int int2){
        return (int) Math.pow(int1, int2);
    }
}
public class inheritance {
    public static void main(String[] args) {

        VeryAdvancedCalculator calc = new VeryAdvancedCalculator();
        int r1 = calc.power(2, 3);
        int r2 = calc.mult(2, 3);
        System.out.println(r1 + " " + r2);
    }
}
