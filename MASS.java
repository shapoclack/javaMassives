import java.util.Arrays;
import java.util.Random;

public class MASS{

		public static void main(String[] args) {
        int[] intArray = new int[] {1, 2, 3, 4, 5};
        System.out.println("Задание 1: " + Arrays.toString(intArray));

        System.out.println();
        System.out.println("Задание 2: ");

        int[][] matrix = new int[3][3];
        Random rand = new Random();
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                matrix[i][j] = rand.nextInt(10);
                    System.out.print(matrix[i][j] + " " );
                }
                System.out.println();
            }
        }
}


     

