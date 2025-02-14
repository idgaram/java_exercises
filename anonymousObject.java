class A{

    public A(){
        System.out.println("object created");
    }

    public void show(){
        System.out.println("in A show");
    }
}

public class anonymousObject {
    public static void main(String[] args) {
        // A a = new A();
        // a.show();

        new A();
    }
}
