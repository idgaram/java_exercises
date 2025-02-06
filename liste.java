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
    public static void main(String[] args) {
        int liste1[] = {1,2,3};
        int liste2[] = {4,5,6};
        int liste3[] = {7,8,9};
        // int listeMix[][] = new int[3][3];
        // int random = (int) (Math.random() * 100);


        Arranger arranger = new Arranger();
        int listeMix[][] = arranger.inputer(liste1, liste2, liste3);


        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 3; j++) {
        //         listeMix[i][j] = (int) (Math.random()*100 );
        //     }

        // }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(listeMix[i][j] + " ");
            }
            System.out.println();
        }

        // for(int i = 0;i<liste2.length;i++){
        // for(int n = 0;n<liste1.length;n++){
            // System.out.println(liste1[n]);
        // }
        // System.out.println(liste2[i]);
    
    }
}
