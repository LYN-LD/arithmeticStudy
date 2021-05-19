package com.lyn.study;

/**
 * 数据交换工具类
 * @author LengYouNuan
 * @create 2021-05-19 下午4:28
 */
public abstract class SwapUtils {

    /**
     * 交换数据中的两个元素位置
     * @param nums 数组
     * @param i i位置
     * @param j j位置
     */
    public static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
