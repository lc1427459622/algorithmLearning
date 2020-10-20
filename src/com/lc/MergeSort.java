package com.lc;

/**
 * 合并排序思想：如果要排序一个数组
 * 先将这个数组从中间分成两部分，
 * 然后对两部分分别排序，
 * 最后再合并在一起。
 *
 * 将一个问题拆分为一个个小问题 可以使用递归方式
 * 1.分析出递归公式
 * 2.找到递归终止条件
 *
 * merge_sort(p...r) = merge(merge_sort(p..q),merge_sort(q+1...r))
 *
 * p >= r 不再继续分解
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] ints = new int[]{4,5,2,3,7,10,6};


        ints = mergeSort(ints,0,ints.length-1);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

  /*  public static int [] mergeSort1(int[] ints,int low,int high){
        if(low >= high){
            return ints;
        }
        int center = (low + high)/2;
        mergeArray1(int[] ints,)
    }
*/
    private static int[] mergeSort(int[] ints,int begin,int end) {
        if(begin > end){
            return ints;
        }
        int q = (begin + end)/2;
        int[] array1 = mergeSort(ints,begin,q);
        int[] array2 = mergeSort(ints,q+1,end);

        ints = mergeArray(ints,array1,array2);

        return ints;

    }

    private static int[] mergeArray(int[] ints, int[] array1, int[] array2) {
        int i = 0;
        int j = array1.length;
        int k = 0;
        int[] tempArr = new int[ints.length];
        while (i <= array1.length -1){
            if(ints[i] < ints[j]){
                tempArr[k++] = ints[i++];
            }else{
                tempArr[k++] = ints[j++];
            }
        }

        int start = i;
        int end = array1.length-1;

        if(j < ints.length-1){
            start = j;
            end = ints.length -1;
        }

        while (start <= end){
            tempArr[k++] = ints[start++];
        }

        for (int l = 0; l < ints.length; l++) {
            ints[l] = tempArr[l];
        }
        return ints;



    }

}
