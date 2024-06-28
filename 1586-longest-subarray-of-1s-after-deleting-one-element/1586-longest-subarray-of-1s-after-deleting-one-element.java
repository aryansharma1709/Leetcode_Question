class Solution {
    public int longestSubarray(int[] nums) {
        int i=0;
        int j=0;
        int ans=0;
        int c=0;
        while(i<nums.length && j<nums.length)
        {
            if(nums[j]==0)
            {
                c++;
            }
            while(c>1)
            {
                if(nums[i]==0)
                c--;
                i++;
            }
            ans=Math.max(ans,j-i);
            j++;
        }
        return ans;
    }
}