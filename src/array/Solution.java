package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author shizhenbo
 * @title: Solution
 * @projectName leetcode
 * @description: TODO
 * @date 2021/7/169:20
 */
public class Solution {

    public static int[][] merge(int[][] intervals){
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        ArrayList<int[]> outputs = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++){
            int[] currentInterval = intervals[i];
            if (outputs.isEmpty()){
                outputs.add(currentInterval);
            }else {
                int currentLeft = currentInterval[0];
                int lastRight = outputs.get(outputs.size() - 1)[1];

                if (lastRight < currentLeft){
                    outputs.add(currentInterval);
                }else {
                    int currentRight = currentInterval[1];
                    outputs.get(outputs.size() - 1)[1] = Math.max(lastRight,currentRight);
                }
            }
        }
        return outputs.toArray(new int[outputs.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{2,6},{1,3}, {8,10},{15,18}};
        int[] aaa = {7,1,2,3,4};
        Arrays.sort(aaa);
        System.out.println(aaa[0]);

        System.out.println(Solution.merge(intervals));
    }

}
