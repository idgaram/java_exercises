
import other.OtherPackage;
import other.tools.VeryAdvancedCalculator;


public class inheritance {
    public static void main(String[] args) {


        VeryAdvancedCalculator calc = new VeryAdvancedCalculator();
        int r1 = calc.power(2, 3);
        int r2 = calc.mult(2, 3);
        System.out.println(r1 + " " + r2);

        OtherPackage obj = new OtherPackage();
        
    }
}
