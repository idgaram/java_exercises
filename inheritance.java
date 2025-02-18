class Calc {
    public int add(int int1, int int2){
        return int1 + int2;
    }

    public int sub(int int1, int int2){
        return int1 - int2;
    }
}

public class inheritance {
    public static void main(String[] args) {
        
        
        
        
        AdvancedInheritance advanceCalc = new AdvancedInheritance();
        int r1 = advanceCalc.add(2,3);
        int r2 = advanceCalc.sub(2,3);
        int r3 = advanceCalc.mult(2,3);
        int r4 = advanceCalc.div(2,3);
        
        System.out.println(r1 + " : " + r2);
        System.out.println(r3 + " : " + r4);
    }
}
