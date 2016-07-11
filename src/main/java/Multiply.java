/**
 * Created by Админ on 11.07.2016.
 */
public class Multiply {
    public static void main(String[] args) {
        int [][] matrixA = {
                {5,-5,6},
                {4,7,-3},
                {-3,6,6}
        };
        int [][] matrixB = {
                {9,1,-9},
                {5,-1,1},
                {-7,8,1}
        };
        int a = matrixA.length;
        int b = matrixB[0].length;
        int c = matrixB.length;
        int[][] result = new int[a][b];

        for (int i = 0; i<a; i++) {
            for (int k = 0; k<b; k++){
                for(int j =0; j<c; j++){
                    result[i][k] +=matrixA[i][k]*matrixB[j][k];
                }
            }
        }
        for (int i=0; i<result.length; i++){
            for (int k=0; k<result[0].length; k++){
                System.out.format("%6d ", result[i][k] );
            }
            System.out.println();
        }
    }

}
