/**
 * Created by Medet on 28.06.2016.
 */
import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите 4 целых числa: ");
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int d=in.nextInt();
        int[][] matrixA;
        matrixA = new int[2][2];
        matrixA[0][0] = a;
        matrixA[0][1] = b;
        matrixA[1][0] = c;
        matrixA[1][1] = d;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrixA[i][j] + "\t");
            }
            System.out.println();
        }
        int y=(a*d)+(b*c);
        System.out.println("Умножение элементов матрицы равно "+y);

    }
}
