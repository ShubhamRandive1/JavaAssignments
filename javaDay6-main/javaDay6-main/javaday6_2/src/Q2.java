import java.sql.SQLOutput;
import java.util.Scanner;

public class Q2 {

    public static void main(String args[]) {
        int m, n, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");

        m = sc.nextInt();
        System.out.print("Enter the number of columns: ");


        n = sc.nextInt();


        int array[][] = new int[m][n];


        System.out.println("Enter the elements of the array: ");


        for (i = 0; i < m; i++)


            for (j = 0; j < n; j++)

                array[i][j] = sc.nextInt();

        System.out.println("Elements of the array are: ");

        int sum = 0;
        for (i = 0; i < m; i++) {

            for (j = 0; j < n; j++) {

                if (array[i][j] % 2 == 0) {
                    sum += array[i][j];
                }
//prints the array elements
                //System.out.print(array[i][j] + " ");
//throws the cursor to the next line

            }
                System.out.println(sum);

        }

    }
}






