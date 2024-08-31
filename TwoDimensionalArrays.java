import java.util.Scanner;

public class TwoDimensionalArrays {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.out.println("Enter matrix length rows and matrix length columns");
         int rows = sc.nextInt();
         int columns = sc.nextInt();
         int[][] matrix = new int[rows][columns];
         for (int i = 0; i < matrix.length; i++) {
             for (int j = 0; j < matrix[i].length; j++) {
                 System.out.println("Enter matrix element " + i + " and " + j + ": ");
                 matrix[i][j] = sc.nextInt();
             }
         }
         for (int row = 0; row < matrix.length; row++) {
             for (int column = 0; column < matrix[row].length; column++) {
                 System.out.print(matrix[row][column] + " ");
             }
         }
         int total = 0;
         for (int row = 0; row < matrix.length; row++) {
             for (int column = 0; column < matrix[row].length; column++) {
                 total += matrix[row][column];
             }
         }
         for (int column = 0; column < matrix.length; column++) {
             int sum = 0;
             for (int row = 0; row < matrix.length; row++) {
                 sum += matrix[row][column];
             }
             System.out.println( "sum for column: " + column + " is "+ sum);
         }
     }
}
