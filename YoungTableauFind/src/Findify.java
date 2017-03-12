/**
 * Created by Aria on 11/03/2017.
 */
public class Findify {
    private static int[][] matrix = {
            {1,2,4,7,8},{3,5,6,9,99},{10,99,99,99,99}
    };

    public static void main(String[] args) {
        find(matrix, 1);
    }
    public static boolean find(int [][] tableau, int c){
        int rows = tableau.length;
        int columns = tableau[0].length;
        int i = 0;
        int j = columns -1;

        while (i < rows && j >= 0){
            if(tableau[i][j] == c){
                System.out.println("true");
                return true;
            }
            if(tableau[i][j] > c){
                System.out.println(tableau[i][j]);
                j--;
            }
            if(tableau[i][j] < c){
                System.out.println(tableau[i][j]);
                i++;
            }

        }
        System.out.println("false");
        return false;
    }
}
