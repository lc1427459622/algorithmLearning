package com.lc;

/**
 *        // 异或 ⊕ 的特性
 *        // 0 异或 x  = x
 *        // x 异或 b = b
 *        // b 异或 b = 0
 *
 *        给定一个非空整数数组，除了某个元素只出现一次以外，
 *        其余每个元素均出现两次。找出那个只出现了一次的元素。
 */
public class Test {
    public static void main(String[] args) {
        int[] ints = {2,3,3,5,5,9,8,2,8};

        int singleNum = singleNumber(ints);
        System.out.println(singleNum);

        /*int s = 2;
        int r = s ^ 2;
        System.out.println(r);*/
    }

    private static int singleNumber(int[] ints) {
        int len = ints.length;
        int result = 0;
        for (int i : ints) {
            result ^= i;
        }
        return result;
    }

}
