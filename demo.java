import other.A;

class C extends A{
    public void showProtected(){
        System.out.println(marks + " " + protectedMarks);
    }
}

public class demo {
    public static void main(String[] args) {
        A obj1 = new A();
        System.out.println(obj1.marks);
        // System.out.println(obj1.protectedMarks); not accessible in other packages because of protected
        obj1.show("in obj1");

        B obj2 = new B();
        System.out.println(obj2.marks);

        C obj3 = new C();
        obj3.show("in obj3");
        obj3.showProtected();

    }
}
