package com.lc;

/**
 * 插入排序
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] ints = new int[]{4,3,5,7,8,6,1};

        ints = insertSort2(ints);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

    private static int[] insertSort2(int[] ints) {
        for (int i = 0; i < ints.length; ++i) {
            int temp = ints[i];
            int j = i -1;
            //查找插入的位置
            for(;j >= 0;--j){
                if(ints[j] > temp){
                    ints[j+1] = ints[j];//数据移动
                }else{
                    break;
                }
            }
            ints[j+1] = temp;//插入数据
        }
        return ints;
    }


    private static int[] insertSort1(int[] ints) {

        for (int i = 1; i < ints.length; i++) {
            if(ints[i]<ints[i-1]){
                for (int j = 0; j < i; j++) {
                    if(ints[j] > ints[i]){
                        int temp = ints[i];
                        for (int k = i; k > j; k--) {
                            ints[k] = ints[k-1];
                        }
                        ints[j] = temp;
                        break;
                    }
                }
            }
        }
        return ints;
    }
}
