package data_structure;

import java.util.ArrayList;
import java.util.List;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

/**
 * 给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 */
public class day1_53 {
    public static void main(String[] args) {
        int[] a = new int[3];
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(nums[0]);
        System.out.println(maxSubArray(nums));

    }

    public static int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        int res = dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++){

            dp[i] = nums[i];
            if (dp[i-1] > 0){
                dp[i] = dp[i-1] + dp[i];
            }
            res = Math.max(dp[i], res);
        }


        return res;
    }
}
