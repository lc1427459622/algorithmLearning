package com.lc;

public class QuickSort {


    public static void main(String[] args) {
        int[] arr = {49,38,65,97,23,22,76,1,5,8,2,0,-1,22};

        quickSort1(arr,0,arr.length-1);
        System.out.println("排序后：");
        for(int i : arr){
            System.out.print(i+" ");
        }
    }

    private static void quickSort1(int[] arr ,int low ,int high){
        if(low < high){
            //获取基准数值的索引
            int index = getIndex1(arr,low,high);

            quickSort1(arr,low,index -1);
            quickSort1(arr,index + 1,high);

        }
    }

    private static int getIndex1(int[] arr, int low, int high) {
        int tmp = arr[low];
        while (low < high){
            while (low < high && arr[high] >= tmp){
                high--;
            }
            arr[low] = arr[high];
            while (low < high  && arr[low] <= tmp){
                low++;
            }
            arr[high] = arr[low];
        }
        arr[low] = tmp;
        return low;

    }

    private static void quickSort(int[] arr, int low, int high) {
        if(low < high){
            //找寻基准数的索引
            int index = getIndex(arr,low,high);

            //进行迭代对index之前和之后的数据进行相同操作使整个数组变得有序
            quickSort(arr,low,index - 1);
            quickSort(arr,index + 1,high);
        }
    }

    private static int getIndex(int[] arr, int low, int high) {
        //获取基准数
        int tmp = arr[low];
        while (low < high){
            //当队尾的元素大于等于基准数 向前挪动high指针
            while (low < high && arr[high] >= tmp){
                high--;
            }
            //当队尾的元素小于基准数tmp 需要将其赋值给low
            arr[low] = arr[high];
            //当队首的元素小于等于基准数 向后挪动low指针
            while (low < high && arr[low] <= tmp){
                low++;
            }
            //当队首的元素大于基准数 需要将low位置的值赋值给high位置
            arr[high] = arr[low];

        }
        //跳出循环说明 low == high 此时low或high的值 就是基准数t'm'p 的索引
        arr[low] = tmp;
        return low;
    }


}
