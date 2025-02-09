class Human{
    private int age;
    private String name;

    public void setAge(int incomingAge){
        age = incomingAge;
    }

    public int getAge(){
        return age;
    }

    public void setName(String incomingName){
        name = incomingName;
    }

    public String getName(){
        return name;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        
        Human human1 = new Human();
        human1.setAge(12);
        human1.setName("Lorys");

        System.out.println(human1.getAge() + " : " + human1.getName());

    }
}
