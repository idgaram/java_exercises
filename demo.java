public class demo {
    public static void main(String[] args) {

        int num = 7;
        Integer num1 = num; //autoboxing

        int num2 = num1.intValue(); //auto unboxing

        System.out.println(num1);

        String str = "12";
        int numStr = Integer.parseInt(str);
        System.out.println(numStr*2);

       }
}