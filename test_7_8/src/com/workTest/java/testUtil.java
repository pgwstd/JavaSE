package com.workTest.java;

public class testUtil {
    //计算数组最大值
    public int arrMax(int[] arr){
        int max = arr[0];
        for (int i = 0;i < arr.length;i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    //计算数组最小值
    public int arrMin(int[] arr){
        int min = arr[0];
        for (int i = 0;i < arr.length;i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    //查找数组中是否存在该元素
    public int arrSeach(int[] arr,int dest){
        for (int i = 0;i < arr.length;i++){
            if (arr[i] == dest){
                return i;
            }
        }
        return -1;
    }

    //打印数组
    public void print(int[] arr){
       for (int i = 0;i < arr.length;i++){
           System.out.print(arr[i]+" ");
       }
        System.out.println();
    }

    //
}
