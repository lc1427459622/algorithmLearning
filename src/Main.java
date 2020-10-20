public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] nums = {3, 2, 14, 0, 0, 4};
        Solution.moveZeroes(nums);
    }


    static class Solution {
        public static void moveZeroes(int[] nums) {
            int numsSize = nums.length;
            int i = 0,j = 0;
            for(i = 0 ; i < numsSize; i++)
            {
                if(nums[i] != 0)
                {
                    nums[j++] = nums[i];
                }
            }
            while(j < numsSize)
            {
                nums[j++] = 0;
            }
            for (int m = 0; m < nums.length; m++) {
                System.out.println(nums[m]);
            }

        }

    }

}
