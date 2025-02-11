
import java.util.HashMap;
import java.util.Map;

class Human {
    int age;
    String name;
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
        
    }
}
