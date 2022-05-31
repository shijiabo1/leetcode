package offer;

import java.util.HashSet;

/**
 * @author shizhenbo
 * @title: RepetitiveNum
 * @projectName leetcode
 * @description: TODO
 * @date 2021/11/1117:24
 */
public class FindRepeatNumber_03 {
    public static void main(int[] nums) {

    }

    public int findRepeatNumber(int[] nums) {
        HashSet set = new HashSet();
        int repeatNUm = -1;
        for (int i=0; i < nums.length; i++){
            if (set.contains(nums[i])){
                repeatNUm = nums[i];
                break;
            }else {
                set.add(nums[i]);
            }
        }
        return repeatNUm;
    }
}
