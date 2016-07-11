/**
 * Created by Админ on 11.07.2016.
 */
public class Matrix {
    public static void main(String[] args) {
        int [] [] matrixA = {
                {-8,1,5},
                {5,4,4},
                {-3,3,1}
        };
        for (int i=0; i<3; i++){
            for (int k=0; k<3; k++){
                System.out.println(matrixA[i][k]);
            }
            System.out.println();
        }
    }
}
