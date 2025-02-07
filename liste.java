
import java.util.Arrays;

class Arranger{
    public int[][] inputer(int[] liste1, int[] liste2, int[] liste3){
        int listeMix[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // switch (j) {
                //     case 0:
                //     listeMix[i][j]= liste1[j];
                //     break;
                //     case 1:
                //     listeMix[i][j]= liste2[j];
                //     break;
                //     case 2:
                //     listeMix[i][j]= liste3[j];
                //     break;          
                // }
                if(i==0){
                    listeMix[i][j]= liste1[j];
                }
                else if(i==1){
                    listeMix[i][j]= liste2[j];
                }
                else{
                    listeMix[i][j]= liste3[j];
                }
            }

        }

        return listeMix;
    }
}

public class liste {
    public static void main(whatIsAString[] args) {
        int liste1[] = {1,2,3};
        int liste2[] = {4,5,6};
        int liste3[] = {7,8,9};

        Arranger arranger = new Arranger();
        int listeMix[][] = arranger.inputer(liste1, liste2, liste3);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(listeMix[i][j] + " ");
            }
            System.out.println();
        }    

        for (int n[]:listeMix){
            for(int m:n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(listeMix));
        System.out.println(Arrays.toString(listeMix));
    }
}
