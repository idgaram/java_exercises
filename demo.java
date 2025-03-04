class A {
    public void show(){
        System.out.println("in a show");
    }
}

class B extends A{
    public void show(){
        System.out.println("in b show");
    }
}

class C extends A{
    public void show(){
        System.out.println("in c show");
    }
}

class D{

}


public class demo {
    public static void main(String[] args) {
        A a = new B();
        
        a.show();

        a = new A();

        a.show();

        a = new C();

        a.show();

        // a = new D(); not possible because d doesn't extend A

       }
}
