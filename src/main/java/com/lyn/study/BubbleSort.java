package com.lyn.study;

import java.util.Arrays;

/**
 * 冒泡排序
 *
 * @author LengYouNuan
 * @create 2021-05-19 下午4:26
 */
public class BubbleSort {
    public static void main(String[] args) {
        int [] nums={2,3,1,4,7,5,8,6};
        bubbleSort(nums);
        System.out.println("排完序之后的数组==》"+ Arrays.toString(nums));

    }

    private static void bubbleSort(int[] nums) {
        boolean hasChange = true; //标记位，表示数据中元素位置有改变
        for (int i = 0; i < nums.length - 1 && hasChange; i++) {
            hasChange=false; //进入外层循环之后，标记为没改变
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j]>nums[j+1]){
                    //交换位置并修改标记
                    SwapUtils.swap(nums,j,j+1);
                    hasChange=true;
                }
            }
        }
    }
}
