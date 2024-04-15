class Solution {
    public int maxSubArray(int[] nums) {
          int sum = Integer.MIN_VALUE;
           int x = 0;
           for (int j = 0; j < nums.length; j++) {
               x += nums[j];
               sum=Math.max(sum,x);
               if (x < 0)
                   x = 0;
       }
       return sum;
        
    }
}