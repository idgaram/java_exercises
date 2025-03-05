class A{
public void show1(){
    System.out.println("in A show");
}
}

class B extends A{
public void show2(){
    System.out.println("in B show");
}
}
public class demo {
    public static void main(String[] args) {
    //    double d = 4.5;
    //    int i = (int) d;
    //    System.out.println(i);
       
        A obj1 = new B();
        obj1.show1();

        B obj2 = (B) obj1;
        obj2.show1();
        obj2.show2();

        // B obj2 =  new B();
        // obj2.show1();
        // obj2.show2();

       }
}