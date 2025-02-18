class A 
{
    public A()
    {
        System.out.println("in A");
    }
    public A(int n){
        System.out.println("in A int : "  + n);
    }
}
class B extends A{
    public B(){
        super();
        System.out.println("in B");
    }
    public B(int n, int m){
        super(m);
        System.out.println("in B int : " + n);
    }
}

public class ThisSuper {
    public static void main(String[] args) {
        B b = new B(7, 5);

    }
}
