package array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shizhenbo
 * @title: SetZeros
 * @projectName leetcode
 * @description: 行列转化为0
 * @date 2021/7/2114:23
 */
public class SetZeros {

    public void setZeros(int[][] matrix){
        ArrayList list  = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i=0; i< m; i++){
            for (int j = 0; j < n; j++){
                if (matrix[i][j] == 0){
                    int[] tmp = {i, j};
                    list.add(tmp);
                }
            }
        }
        if (list.size() >0){
            for (int i=0; i< list.size(); i++){
                int[] tmp = (int[]) list.get(i);
                int row = tmp[0];
                int col = tmp[1];
                for (int k=0; k < n; k++){
                    matrix[row][k] = 0;
                }
                for (int t=0; t < m; t++){
                    matrix[t][col] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        boolean[] m = new boolean[3];
        System.out.println(m[0]);


    }
}
