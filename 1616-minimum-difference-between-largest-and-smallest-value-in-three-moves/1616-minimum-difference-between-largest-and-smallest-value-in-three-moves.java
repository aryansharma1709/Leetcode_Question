class Solution {
    public int minDifference(int[] nums) {
      int n=nums.length;
        if(n<=3) return 0; 
        Arrays.sort(nums);
        int min=Integer.MAX_VALUE;
        min=Math.min(min,nums[n-4]-nums[0]);
        min=Math.min(min, nums[n-3]-nums[1]);
        min=Math.min(min,nums[n-2]-nums[2]);
        min=Math.min(min,nums[n-1]-nums[3]);
        return min;
    }
}