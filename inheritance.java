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
        
        Calc calc = new Calc();
        int r1 = calc.add(1,3);
        int r2 = calc.sub(3,1);

        System.out.println(r1 + " : " + r2);
    }
}
