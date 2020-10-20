package com.lc;

/**
 * 冒泡排序
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] ints = new int[]{4,5,2,3,7,10,6};
        ints = bubbleSort(ints);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

    private static int[] bubbleSort(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            for (int j = 1; j <= ints.length -1 -i; j++) {
                if(ints[j]<ints[j-1]){
                    int temp = ints[j];
                    ints[j]=ints[j-1];
                    ints[j-1] = temp;
                }
            }
        }
        return ints;
    }
}
