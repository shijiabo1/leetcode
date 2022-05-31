package array;

/**
 * @author shizhenbo
 * @title: RotationMatrix
 * @projectName leetcode
 * @description: TODO
 * @date 2021/7/2114:12
 */
public class RotationMatrix {

    public void rotate(int[][] matrix){
        int n = matrix.length;

        for (int i = 0; i < n/2; i++){
            for (int j = 0; j < (n+1)/2; j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[n - j - 1][i];
                matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
                matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
                matrix[j][n - i - 1] = tmp;
            }
        }

    }

    public static void main(String[] args) {

    }
}
