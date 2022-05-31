package data_structure;

import java.util.Arrays;
import java.util.HashSet;

/**
 *存在重复元素
 */
public class day1_217 {

    public boolean containsDuplicate_official(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        int length = nums.length;

        for (int i = 0; i<length;i++){
            if (set.contains(nums[i])){
                return true;
            }else {
                set.add(nums[i]);
            }
        }
        return false;
    }
}
