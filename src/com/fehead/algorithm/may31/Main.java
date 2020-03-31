package com.fehead.algorithm.may31;

/**
 * 给你一个整数数组 nums，请你将该数组升序排列。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [5,2,3,1]
 * 输出：[1,2,3,5]
 * 示例 2：
 *
 * 输入：nums = [5,1,1,2,0,0]
 * 输出：[0,0,1,1,2,5]
 *  
 *
 * 提示：
 *
 * 1 <= nums.length <= 50000
 * -50000 <= nums[i] <= 50000
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sort-an-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author Nightnessss 2020/3/31 19:01
 */
public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {5,1,1,2,0,0};
        for (int i : solution.sort4(nums)) {
            System.out.println(i);
        }
    }
}
