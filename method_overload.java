class Calculator{
    public int add(int n1,int n2){

        return n1 + n2;
    }
}

public class method_overload {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int r1 = calc.add(3,4);
        System.out.println(r1);
    }
   
    
}
