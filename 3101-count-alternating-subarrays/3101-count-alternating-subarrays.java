class Solution {
    public long countAlternatingSubarrays(int[] nums) {
      long c=1;
        long sum=nums.length;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]!=nums[i+1])
             c=c+1;
           else
           {
              sum+=(c*(c-1))/2;
              c=1;
           }
        }
        sum+=(c*(c-1))/2;
        return sum;
    }
}