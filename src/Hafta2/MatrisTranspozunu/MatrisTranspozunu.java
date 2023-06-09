package Hafta2.MatrisTranspozunu;

public class MatrisTranspozunu {
    public static void main(String[] args) {
        int[][] matrix = { //Matris
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] transpose = new int[matrix[0].length][matrix.length]; //Transpozunu kaydedeceğimiz matris

        System.out.println("Matris: ");
        for (int i = 0; i < matrix.length; i++) { //Matrisi ekrana yazdırma
            for (int j = 0; j < matrix[0].length; j++) {

                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("Transpozun: ");
        for (int i = 0; i < transpose.length; i++) { //Matrisin transpozunu bulup ekrana yazdırma
            for (int j = 0; j < transpose[i].length; j++) {
                transpose[i][j] = matrix[j][i];
                System.out.print(transpose[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
