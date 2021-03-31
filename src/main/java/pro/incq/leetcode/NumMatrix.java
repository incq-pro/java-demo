package pro.incq.leetcode;

import java.util.Arrays;

/**
 * TODO
 *
 * @author pro.incq
 * @date 2021-03-02
 */
public class NumMatrix {
    private int[][] sum;
    public NumMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        sum = new int[m + 1][n + 1];
        for (int i = 0 ; i < m; i++) {
            int[] sumRow = sum[i+1];
            int[] matrixRow = matrix[i];
            int b = 0;
            for (int j = 0; j < n; j++) {
                b += matrixRow[j];
                sumRow[j+1] = (b + sum[i][j+1]);
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return sum[row2+1][col2+1] + sum[row1][col1] - sum[row1][col2+1] - sum[row2+1][col1];
    }

    public static void main(String[] args) {
        int[][] matrix = new int[5][];
        matrix[0] = new int[]{3,0,1,4,2};
        matrix[1] = new int[]{5,6,3,2,1};
        matrix[2] = new int[]{1,2,0,1,5};
        matrix[3] = new int[]{4,1,0,1,7};
        matrix[4] = new int[]{1,0,3,0,5};

        NumMatrix m = new NumMatrix(matrix);
        System.out.println(m.sumRegion(2,1,4,3));
        System.out.println(m.sumRegion(1,1,2,2));
        System.out.println(m.sumRegion(1,2,2,4));
    }
}
