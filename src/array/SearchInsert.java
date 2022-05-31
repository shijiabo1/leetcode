package array;

/**
 * @author shizhenbo
 * @title: Demo_02
 * @projectName leetcode
 * @description: 二分法搜索插入位置
 * @date 2021/7/1417:41
 */
public class SearchInsert {

    public static int SearchInsert(int target, int[] nums){

        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = (left + right)/2;
            if (target == nums[mid]){
                return mid;
            }else if (target < nums[mid]){
                right = mid -1;
            }else {
                left = mid + 1;
            }
        }

        return left;
    }


//[1,3,5,6], 5
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        System.out.println(SearchInsert.SearchInsert(4, nums));

    }
}
