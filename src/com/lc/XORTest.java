package com.lc;

/**
 * 异或
 *
 * 给定一个整数数组 nums，其中恰好有两个元素只出现一次，
 * 其余所有元素均出现两次。 找出只出现一次的那两个元素。
 */
public class XORTest {
    public static void main(String[] args) {



        int c = 7;
        int d = 9;

        c = d ++;
        System.out.println(c);
        d = ++ d;
        System.out.println(d);
        System.out.println(c^d);
        int[] nums = {1,3,4,5,6,1,3,4,5,6,7,9};
        nums = singleNumber(nums);
        for(int n : nums){
            System.out.println(n+" ");
        }
    }
    public static int[] singleNumber(int[] nums){
        int[] res = new int[2];
        if(nums == null || nums.length < 2){
            return res;
        }
        int xorRes = 0;
        for(int x : nums){
            xorRes ^= x;
        }
        //用来标志第几位是1
        int temp = 1;
        while (true){
            if((xorRes & 1) == 1){
                break;
            }
            temp = temp << 1;
            xorRes = xorRes >> 1;//右移，从低到高

        }
        for(int y : nums){
            if((y & temp) == 0){
                res[0] ^= y;
            }else {
                res[1] ^= y;
            }
        }
        return res;
    }
}
