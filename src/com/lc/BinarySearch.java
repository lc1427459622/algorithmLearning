package com.lc;

/**
 * 二分查找
 * <p>
 * 二分查找的前提是对有序的数据进行查找
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] ints = new int[]{1, 3, 4, 5, 7, 9, 10};
        int target = 3;
        int set = binarySearch(ints,target);
        if(set == -1){
            System.out.println("数组中不存在："+target);
        }else{
            System.out.println("数组中存在要查找的数据位置在：" + set);
        }
    }

    public static int binarySearch(int[] ints, int target) {

        int firstSet = 0;
        int lastSet = ints.length-1;
        int targetSet = -1;
        while (firstSet < lastSet){
            int center = (firstSet+lastSet)/2;
            if(ints[center] == target){
                targetSet = center;
                break;
            }else if(ints[center] > target){
                lastSet = center -1;
            }else{
                firstSet = center + 1;
            }
        }

        return targetSet;
    }

}
