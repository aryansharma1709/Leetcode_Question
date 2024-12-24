class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int a=loot(Arrays.copyOfRange(nums,1,nums.length));
        int b=loot(Arrays.copyOfRange(nums,0,nums.length-1));
        return Math.max(a,b);
    }
    public int loot(int[] nums){
         int prev=nums[0];
        int prev2=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            int curri=Math.max(nums[i]+((i-2<0?0:prev2)),prev);
            prev2=prev;
            prev=curri;
        }
        return prev;
    }
}