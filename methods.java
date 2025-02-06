class Computer{
    private int money;

    public Computer(int initialMoney){
        this.money = initialMoney;
    }
  
    public void playMusic(){
        System.out.println("music is playing");
    }

    public String getMeAPen(int cost){
        this.money--; 
        return "pen";
    }

    public int getMoney(){
        return this.money;
    }
}

public class methods {

    public static void main(String a[]){

        int money = 5;

        Computer computer = new Computer(money);

        computer.playMusic();
        System.out.println(computer.getMeAPen(money));
        System.out.println(computer.getMoney());
        System.out.println(computer.getMeAPen(money));
        System.out.println(computer.getMoney());



    }
}
