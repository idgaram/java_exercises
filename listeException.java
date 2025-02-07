
import java.util.Arrays;

public class listeException{
    
    public static void main(String[] args) {
        int[] myList = new int[6];
        
        myList[0] = 1;
        myList[1] = 5;
        myList[2] = 120;
        myList[3] = 55;
        myList[4] = 141;

        for (int i = 0; i < myList.length +1; i++) {
            System.out.println(myList[i]);
        }

        System.out.println(Arrays.toString(myList));

    }
}
