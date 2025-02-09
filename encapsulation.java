class Human{
    private int age = 12;
    private String name = "lorys";

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        
        Human human1 = new Human();

        System.out.println(human1.getAge());

    }
}
