package com.lyn.study;

import java.util.Arrays;

/**
 * 插入排序
 *
 * @author LengYouNuan
 * @create 2021-05-19 下午4:44
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] nums = {2, 1, 4, 3, 6, 5, 10, 7, 8, 0, 9};
        insertSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void insertSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            int j;
            for (j = i - 1; j >= 0 && nums[j] > num; j--) { //for循环执行顺序是先定义j 再判断 符合条件进循环体 然后减减操作，如果不符合调价则不进循环体并且不会执行减减操作
                nums[j + 1] = nums[j];
            }
            nums[j + 1] = num;
        }
    }
}
