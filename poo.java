class Calculator {

    public int add(int a,int b){
        int r = a + b;
        return r;
    }
}

public class poo {
    public static void main(String a[]){

        int num1, num2;
        num1 = 4;
        num2 = 5;

        Calculator calc = new Calculator(); 
        calc.add(num1, num2);


        int result = calc.add(num1, num2);

        
        System.out.println("result of add is : " + result);

        class Innerpoo {
                public int sayInt(int a){

                    return a;
                }
    
}
        Innerpoo test = new Innerpoo();
        System.out.println(test.sayInt(7));
    }
}
