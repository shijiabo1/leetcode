package array;

/**
 * @author shizhenbo
 * @title: FindCenterSubscript
 * @projectName leetcode
 * @description: 查找中心位置
 * @date 2021/7/1218:02
 */
public class PivotIndex {
    static int subscript = -1;

    public static int findSubscript(int[] arr){
        int length = arr.length;
        int i = 0;
        int sum = 0;
        while (i < length){
            sum = sum + arr[i];
            i++;
        }
//        System.out.println(sum);

        i = 0;

        return subscript;
    }

    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 6, 5, 6};
        System.out.println(PivotIndex.findSubscript(arr));
    }
}
