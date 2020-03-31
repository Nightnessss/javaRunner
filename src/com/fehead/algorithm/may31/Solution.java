package com.fehead.algorithm.may31;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Nightnessss 2020/3/31 19:01
 */
public class Solution {

    private void swap(int[] nums, int index1, int index2) {
        if (index1 > nums.length-1 || index2 > nums.length-1 || index1 == index2) {
            return;
        }
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
    public int[] sortArray(int[] nums) {
        List<Integer> list = Arrays.stream(nums).boxed().sorted().collect(Collectors.toList());

        return list.stream().mapToInt(Integer::valueOf).toArray();
    }

    /**
     * 冒泡排序
     * @param nums
     * @return
     */
    public int[] sort1(int[] nums) {
        int n = nums.length - 1;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 0; j < n; j++) {
                if (nums[j] > nums[j+1]) {
                    swap(nums, j, j+1);
                }
            }
            n--;
        }
        return nums;
    }

    /**
     * 交换排序
     * @param nums
     * @return
     */
    public int[] sort2(int[] nums) {
        int max = 0;
        int n = nums.length-1;
        for (int i = 0; i < nums.length-1; i++) {
            max = 0;
            for (int j = 0; j <= n; j++) {
                if (nums[max] < nums[j]) {
                    max = j;
                }
            }
            swap(nums, max, n);
            n--;
        }
        return nums;
    }

    /**
     * 快排
     * @param nums
     * @return
     */
    public int[] sort3(int[] nums) {

        quickSort(nums, 0, nums.length-1);
        return nums;
    }
    private void quickSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int low = left + 1;
        int high = right;
        while (low <= high) {
            if (nums[low] > nums[left]) {
                swap(nums, low, high);
                high--;
            } else {
                low++;
            }
        }
        low--;
        swap(nums, high, left);
        quickSort(nums, left, low-1);
        quickSort(nums, low+1, right);
    }

    /**
     * 计数排序
     * @param nums
     * @return
     */
    public int[] sort4(int[] nums) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int a : nums) {
            max = Math.max(max, a);
            min = Math.min(min, a);
        }
        int[] count = new int[max - min + 1];

        for (int a : nums) {
            count[a-min]++;
        }
        int[] res = new int[nums.length];
        int cnt = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                res[cnt++] = i+min;
                count[i]--;
            }
        }
        return res;
    }
}
