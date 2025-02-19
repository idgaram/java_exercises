import other.AccessModifiersA;

class AccessModifiersC extends AccessModifiersA{
    
}

public class AccessModifiers {
    public static void main(String[] args) {
        
        AccessModifiersA a = new AccessModifiersA();
        System.out.println(a.marks);

        AcessModifiersB b = new AcessModifiersB();
        System.out.println(b.marks);
    }

}
