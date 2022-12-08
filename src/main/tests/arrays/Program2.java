package main.tests.arrays;

import java.util.Arrays;

/**
 * инициализация массивов
 */

public class Program2 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 13}, {5, 2}};
        int[][] matrix1 = {new int[2], {5, 2}};
        int[][] matrix2 = {{5}, {2, 2}};
        int[][] matrix3 = new int[][]{{1, 13}, {5, 2}, {2, 2}};
        int[][] matrix4 = new int[][]{{1, 13}, new int[2], {2, 2}};

        int[][] matrix5;
        matrix5 = new int[][]{{1, 13}, {5, 2}, {2, 2}};

        int[] matrix6[] = new int[][]{{1, 13}, {5, 2}, {2, 2}};
        int matrix7[][] = new int[][]{{1, 13}, {5, 2}, {2, 2}};

//      int[][] matrix8;
//      matrix8 = {{1, 13}, {5, 2}, {2, 2}};  // не хватает new int[][]


        for (int[] m : matrix6) {
            for (int n : m) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
