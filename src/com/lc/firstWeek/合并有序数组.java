package com.lc.firstWeek;

public class 合并有序数组 {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        if (m == 0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
            return;
        }
        int[] tmpNums = new int[m + n];
        int i = 0;
        int j = 0;
        int o = 0;
        int num1 = 0;
        int num2 = 0;
        int minNum = 0;
        int maxNum = 0;
        int flag = 0;
        while (o < (m + n)) {
            if (i < m && j < n) {
                if(maxNum == 0) {
                    num1 = nums1[i];
                    num2 = nums2[j];
                    minNum = compareNum(num1, num2);
                    if (minNum == num1) {
                        j++;
                        flag = 1;
                        maxNum = num2;
                    } else {
                        flag = 2;
                        maxNum = num1;
                        i++;
                    }
                }else{
                    if(flag == 1){
                        minNum = compareNum(nums1[i], maxNum);
                    }else if(flag == 2){
                        minNum = compareNum(nums1[i], maxNum);
                    }
                }
            } else if (i < m && j >= n) {
                num1 = nums1[i];
                num2 = maxNum;
                maxNum = compareNum(num1, num2);
                i++;
            } else if (i >= m && j < n) {
                num2 = nums2[j];
                num1 = maxNum;
                maxNum = compareNum(num1, num2);
                j++;
            } else {
                break;
            }
            tmpNums[o] = minNum;
            o++;
        }
        for (int k = 0; k < (m + n); k++) {
            nums1[k] = tmpNums[k];
        }
    }

    //比较两个数返回较小的数
    public static int compareNum(int num1, int num2) {
        if (num1 >= num2) {
            return num2;
        } else {
            return num1;
        }
    }


    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0};
        int m =3;
        int[] arr2 ={2,5,6};
        int n = 3;

        merge(arr1,m,arr2,n);
    }
}
