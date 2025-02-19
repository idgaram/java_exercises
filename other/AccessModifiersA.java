package other;

class Launch{
    public void abc()
    {
        AccessModifiersA obj = new AccessModifiersA();
        System.out.println(obj.marks);
    }
}

public class AccessModifiersA {
    protected int marks = 6;
    
}
