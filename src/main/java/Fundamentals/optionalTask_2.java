package Fundamentals;






import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class optionalTask_2 {
    public static void main(String[] args) {
//        findAndDeleteMaxElement();
        sortElementsByKColorRow();


    }

    public static void findAndDeleteMaxElement() {
        Scanner input = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = Integer.MIN_VALUE;

        Random rand = new Random();
        try {
            System.out.println("Type please matrix size: ");
            int m = input.nextInt();
            System.out.println("Type please random border: ");
            int min = input.nextInt();
            int max = input.nextInt();
            int[][] A = new int[m][m];
            int result_array[][] = new int[m - 1][m - 1];

            for (int i = 0; i < m; i++) {
                for (int k = 0; k < m; k++) {
                    A[i][k] = (int) (Math.random() * (max - min) + min);
                }
            }
            for (int[] i : A) {
                for (int j : i)
                    result = Math.max(result, j);
            }
            System.out.println("Your matrix: ");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(A[i][j] + " ");
                    result = Math.max(result, j);

                }
                System.out.print("\n");

            }
            int remove_row = 0;
            int remove_col = 0;
            int p = 0;
            System.out.println("Max element in the matrix is " + result);
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    if (A[i][j] == result) {
                        System.out.println("\n");
                        remove_row = i;
                        remove_col = j;
                    }

                }
            }
            for (int i = 0; i < m; ++i) {
                if (i == remove_row)
                    continue;
                int q = 0;
                for (int j = 0; j < m; ++j) {
                    if (j == remove_col)
                        continue;
                    result_array[p][q] = A[i][j];
                    ++q;
                }
                ++p;
            }
            for (int i = 0; i < result_array.length; i++) {
                for (int j = 0; j < result_array.length; j++) {
                    System.out.println(result_array[i][j] + " ");
                }
                System.out.print("\n");
            }


        } catch (NumberFormatException r) {
            System.out.println("ERROR!Data what was types it is not a number " + r);
        }

    }

    public  static void sortElementsByKColorRow() {
        Scanner input = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Random rand = new Random();
        try {
            System.out.println("Type please matrix size: ");
            int m = input.nextInt();
            System.out.println("Type please random border: ");
            int min = input.nextInt();
            int max = input.nextInt();
            System.out.println("Type please row number what will be sorted: ");
            int row_to_sort=input.nextInt();
            int[][] A = new int[m][m];
            int result_array[][] = new int[m - 1][m - 1];

            for (int i = 0; i < m; i++) {
                for (int k = 0; k < m; k++) {
                    A[i][k] = (int) (Math.random() * (max - min) + min);
                }
            }
            System.out.println("Your matrix: ");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(A[i][j] + " ");
                }
                System.out.print("\n");

            }
            System.out.println("Result Matrix:");
            System.out.println("Row for sort"+row_to_sort);
            for (int i=0;  i<m; i++)
                for (int k=i+1; k < m; k++) {
                    if (A[i][row_to_sort] > A[k][row_to_sort]){
                        for (int j=0; j < m; j++) {
                            int temp = A[i][j];
                            A[i][j]=A[k][j];
                            A[k][j]=temp;
                        }
                    }
                }
            for (int i=0; i<m; i++)
            {
                for (int j=0; j<m; j++)
                {
                    System.out.print(A[i][j]+" ");
                }
                System.out.print("\n");
            }





        } catch (NumberFormatException r) {
            System.out.println("ERROR!Data what was types it is not a number " + r);
        }

    }

}