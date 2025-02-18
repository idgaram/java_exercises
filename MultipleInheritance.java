// class A{
//     public void x(){
//         System.out.println("in x()");
//     }
// }

// class B extends A{
//     public void y(){
//         System.out.println("in y()");
//     }
// }

// class C extends A{
//     public void z(){
//         System.out.println("in z()");
//     }
// }

public class MultipleInheritance {
    public static void main(String[] args) {
        
        C c = new C();
        B b = new B();

        c.x();
        c.z();
        

        b.x();
        b.y();
        
    }
}
