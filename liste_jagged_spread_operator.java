import java.util.Arrays;

class Arranger_jagged_spread_operator{
    public int[][] inputer(int[]... liste){

        int listeRows = liste.length;
        int listeMix[][] = new int[listeRows][]; //jagged
        System.out.println(Arrays.deepToString(liste));
        System.out.println(Arrays.deepToString(listeMix));

        for(int i = 0; i<listeRows;i++){
            int[] currentList = liste[i];
            listeMix[i]= new int[currentList.length];
            for(int j = 0; j<currentList.length;j++){
                listeMix[i][j] = currentList[j];
            }

        }

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
            }

        }

        return listeMix;
    }
}

public class liste_jagged_spread_operator {
    public static void main(String[] args) {
        int liste1[] = {1,2,3};
        int liste2[] = {4,5,6,9};
        int liste3[] = {7,8};

        Arranger_jagged_spread_operator arranger = new Arranger_jagged_spread_operator();
        int listeMix[][] = arranger.inputer(liste1, liste2, liste3);


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
