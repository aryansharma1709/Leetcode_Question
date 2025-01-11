class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int sum=0;
        int total=0;
        for(int i=0;i<nums.length;i++)
        {
            total+=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            max=Math.max(sum,max);
            if(sum<0)sum=0;
        }
        sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            min=Math.min(sum,min);
            if(sum>0)sum=0;
        }
        if(max<0) return max;
        return total-min>max?total-min:max;
    }
}