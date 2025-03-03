package other;

class Launch {
    public void abc(){
        A obj = new A();
        System.out.println(obj.marks);
    }
}

public class A {
    public int marks = 6; //has to be public to be accessed from demo

    protected int protectedMarks = 7;

    public void show(String str){
        System.out.println(str);
    }
}
