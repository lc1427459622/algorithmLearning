package com.lc;

/**
 * 儿子中比较出最大的儿子
 * 最大的儿子与父亲比较，儿子比父亲大，则与父亲交换
 * 从下往上进行比较
 *
 * 1.有多少父节点： ==(L-1)/2
 * 2.每个父节点的索引： == 1-父节点个数
 * 3.子节点索引： == 左儿子=父节点索引*2， 右儿子 = 左儿子 + 1
 *
 */
public class Tree {
    public static void main(String[] args) {
        //从数组的第一个元素开始，从上往下，从左往右
        int[] ints = {0,4,7,2,1,8,6,3};

        //实现堆排序
        //

    }
}
