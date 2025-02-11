
import java.util.HashMap;
import java.util.Map;

class HumanGetterSetter {
    int age;
    String name;

    // public Human(){
    //     this.age = 0;
    //     this.name = null;
    // }

    public HumanGetterSetter(){
        this.age = 0;
        this.name = null;

    }

    public HumanGetterSetter(int age, String name){
        this.age = age;
        this.name = name;

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

    public Map<String, Object> toMap(){
        Map<String, Object> map = new HashMap<>();
        map.put("age", this.age);
        map.put("name", this.name);
        return map;
    }
   


    
   
}

public class getterSetter {
    public static void main(String[] args) {
        HumanGetterSetter human = new HumanGetterSetter();
        human.age = 18;
        human.name = "steven";
        System.out.println(human.toMap());
    }
}
