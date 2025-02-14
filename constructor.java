class constructorExample{
    private int age;
    private String name;


    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
}

public class constructor {
    public static void main(String[] args) {
        constructorExample obj1 = new constructorExample();

        System.out.println(obj1.getName() + " : " + obj1.getAge());

        obj1.setAge(18);
        obj1.setName("sangohan");
    }
}
