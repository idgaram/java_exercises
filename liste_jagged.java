
import java.util.Arrays;

class Arranger_jagged{
    public int[][] inputer(int[] liste1, int[] liste2, int[] liste3){
        int listeMix[][] = new int[3][]; //jagged

        listeMix[0] = new int[3]; 
        listeMix[1] = new int[4]; 
        listeMix[2] = new int[2]; 

        for (int i = 0; i < listeMix.length; i++) {
            for (int j = 0; j < listeMix[i].length ; j++) {
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

public class liste_jagged {
    public static void main(String[] args) {
        int liste1[] = {1,2,3};
        int liste2[] = {4,5,6,9};
        int liste3[] = {7,8};

        Arranger_jagged arranger = new Arranger_jagged();
        int listeMix[][] = arranger.inputer(liste1, liste2, liste3);

        // for (int i = 0; i < listeMix.length; i++) {
        //     for (int j = 0; j < listeMix.length; j++) {
        //         System.out.print(listeMix[i][j] + " ");
        //     }
        //     System.out.println();
        // }    

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
