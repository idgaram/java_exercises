class constructorExample{
    private int age;
    private String name;


    public constructorExample(){
        System.out.println("in constructor");
        age = 18;
        name = "defaultName";


    }

    public constructorExample(int age, String name){
        System.out.println("in constructor with values");
        this.name = name;
        this.age = age;

    }


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
        constructorExample obj2 = new constructorExample(12, "sangohan");


        System.out.println(obj1.getName() + " : " + obj1.getAge());
        System.out.println(obj2.getName() + " : " + obj2.getAge());
        
        
    }
}
